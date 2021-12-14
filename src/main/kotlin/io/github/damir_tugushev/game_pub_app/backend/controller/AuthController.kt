package io.github.damir_tugushev.game_pub_app.backend.controller

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.UserEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee.UserRepository
import io.github.damir_tugushev.game_pub_app.backend.security.JwtUtils
import io.github.damir_tugushev.game_pub_app.backend.security.UserDetailsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController(
    private val authenticationManager: AuthenticationManager,
    private val passwordEncoder: PasswordEncoder,
    private val userDetailsService: UserDetailsService,
    private val jwtUtils: JwtUtils,
    private val userRepository: UserRepository,
) {
    @PostMapping("auth")
    suspend fun auth(@RequestBody user: UserEntity): ResponseEntity<String> = try {
        val authentication = UsernamePasswordAuthenticationToken(user.id, user.passwordEncrypted)
        authenticationManager.authenticate(authentication)

        val userDetails = userDetailsService.loadUserByUsername(user.id)
        val token = jwtUtils.generateToken(userDetails)
        ResponseEntity.ok(token)
    } catch (e: BadCredentialsException) {
        ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
    } catch (e: UsernameNotFoundException) {
        ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
    } catch (e: Exception) {
        ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
    }

    @PostMapping("register")
    suspend fun register(@RequestBody user: UserEntity): ResponseEntity<String> = try {
        withContext(Dispatchers.IO) {
            require(userRepository.findByIdOrNull(user.id) == null) {
                "User with login ${user.id} already exists"
            }
            @Suppress("NAME_SHADOWING")
            val user = UserEntity(
                id = user.id,
                passwordEncrypted = passwordEncoder.encode(user.passwordEncrypted),
                creationDate = user.creationDate,
                description = user.description,
            )
            userRepository.save(user)
        }

        auth(user)
    } catch (e: IllegalArgumentException) {
        ResponseEntity.badRequest().build()
    } catch (e: Exception) {
        ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
    }
}
