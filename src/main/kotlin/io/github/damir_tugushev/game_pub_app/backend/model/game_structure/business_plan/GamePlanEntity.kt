package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.GamePlan
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils
import javax.persistence.*

@Entity
@Table(name = "business_plan_document")
@Serializable
class GamePlanEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_version_plan_document")
    override val id: Int = 0,

    @Column(name = "description_plan_document", length = 1000)
    override val description: String,

    @Column(name = "content_plan_document")
    override val contentUri: String = "",

    @Column(name = "creation_date_plan_document")
    override val creationDate: String = "",

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_plan", referencedColumnName = "id_type_plan")
    override val type: GamePlanTypeEntity,

    @OneToMany(cascade = [CascadeType.MERGE], mappedBy = "gamePlan", fetch = FetchType.EAGER)
    override val gamePlanData: Set<GamePlanDataEntity> = setOf(),
) : GamePlan {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GamePlanEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
