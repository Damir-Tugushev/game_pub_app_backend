package io.github.damir_tugushev.game_pub_app.backend.service.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.EmployeeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee.EmployeeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class EmployeeService(override val repository: EmployeeRepository)
    : EntityService<EmployeeEntity, Int>()
