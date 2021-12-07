package io.github.damir_tugushev.game_pub_app.backend.service.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.EmployeeTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee.EmployeeTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class EmployeeTypeService(override val repository: EmployeeTypeRepository)
    : EntityService<EmployeeTypeEntity, Int>()
