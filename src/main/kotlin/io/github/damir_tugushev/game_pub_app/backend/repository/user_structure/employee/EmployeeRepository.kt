package io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository
    : JpaRepository<EmployeeEntity, Int>
