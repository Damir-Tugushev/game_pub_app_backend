package io.github.damir_tugushev.game_pub_app.backend.service.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.UserEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee.UserRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class UserService(override val repository: UserRepository)
    : EntityService<UserEntity, String>()
