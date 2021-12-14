package io.github.damir_tugushev.game_pub_app.backend.security

import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsService(private val repository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(id: String): UserDetails {
        val user = repository.findByIdOrNull(id)
            ?: throw UsernameNotFoundException("User with login $id not found")
        return User(user.id, user.passwordEncrypted, setOf())
    }
}
