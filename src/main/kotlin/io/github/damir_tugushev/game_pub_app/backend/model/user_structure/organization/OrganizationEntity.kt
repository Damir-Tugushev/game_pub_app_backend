package io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.employee.EmployeeEntity
import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.organization.Organization
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "organization")
@Serializable
class OrganizationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_organization")
    override var id: Int = 0,

    @Column(name = "description_organization", length = 1000)
    override var description: String,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_organization", referencedColumnName = "id_type_organization")
    override var organizationType: OrganizationTypeEntity,

    @Column(name = "creation_date_organization")
    override var creationDate: String = "",

    @Column(name = "name_organization", length = 100, unique = true)
    override var name: String,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_head_organization", referencedColumnName = "id_organization")
    override var headOrganization: OrganizationEntity? = null,

    @ManyToMany(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinTable(
        name = "organization_to_game_project",
        joinColumns = [JoinColumn(name = "id_organization")],
        inverseJoinColumns = [JoinColumn(name = "id_project")],
    )
    override val projects: Set<GameProjectEntity> = setOf(),

    @OneToMany(cascade = [CascadeType.MERGE], mappedBy = "organization", fetch = FetchType.EAGER)
    override val employees: Set<EmployeeEntity> = setOf(),
) : Organization {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as OrganizationEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
