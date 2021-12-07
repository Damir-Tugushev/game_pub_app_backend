package io.github.damir_tugushev.game_pub_app.backend.controller.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.EmployeeEntity
import io.github.damir_tugushev.game_pub_app.backend.service.user_structure.employee.EmployeeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("employees")
class EmployeeController(override val service: EmployeeService)
    : EntityController<EmployeeEntity, Int>()
