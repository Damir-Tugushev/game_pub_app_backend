package io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee

import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.employee.EmployeeType
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "type_employee")
@Serializable
class EmployeeTypeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_employee")
    override val id: Int = 0,

    @Column(name = "description_type_employee", length = 1000)
    override val description: String,

    @Column(name = "name_type_employee", length = 100, unique = true)
    override val name: String,
) : EmployeeType {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as EmployeeTypeEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
