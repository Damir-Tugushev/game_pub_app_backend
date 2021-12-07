package io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationEntity
import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.employee.Employee
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "employee")
@Serializable
class EmployeeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    override val id: Int = 0,

    @Column(name = "description_employee", length = 1000)
    override val description: String,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_employee", referencedColumnName = "id_type_employee")
    override var type: EmployeeTypeEntity,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_organization", referencedColumnName = "id_organization")
    override var organization: OrganizationEntity,

    @OneToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "login_user", referencedColumnName = "login_user")
    override var user: UserEntity,

    @Column(name = "age_employee")
    override var age: Int,

    @Column(name = "name_employee", length = 100)
    override var name: String,

    @Column(name = "surname_employee", length = 100)
    override var surname: String,

    @Column(name = "patronymic_employee", length = 100)
    override var patronymic: String? = null,
) : Employee {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as EmployeeEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
