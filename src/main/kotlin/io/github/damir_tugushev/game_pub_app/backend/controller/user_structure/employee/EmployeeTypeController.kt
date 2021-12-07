package io.github.damir_tugushev.game_pub_app.backend.controller.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.EmployeeTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.service.user_structure.employee.EmployeeTypeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("employee_types")
class EmployeeTypeController(override val service: EmployeeTypeService)
    : EntityController<EmployeeTypeEntity, Int>()
