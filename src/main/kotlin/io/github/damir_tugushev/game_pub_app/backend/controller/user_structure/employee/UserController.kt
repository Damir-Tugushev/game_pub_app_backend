package io.github.damir_tugushev.game_pub_app.backend.controller.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.UserEntity
import io.github.damir_tugushev.game_pub_app.backend.service.user_structure.employee.UserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(override val service: UserService)
    : EntityController<UserEntity, String>()
