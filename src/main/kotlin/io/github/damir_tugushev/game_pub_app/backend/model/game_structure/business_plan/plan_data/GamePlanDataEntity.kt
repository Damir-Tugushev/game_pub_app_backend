package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.plan_data.GamePlanData
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "data_plan_creation")
@Serializable
class GamePlanDataEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_data_plan")
    override val id: Int = 0,

    @Column(name = "description_data_plan", length = 1000)
    override val description: String,

    @Column(name = "content_data_plan")
    override val contentUri: String,

    @Column(name = "creation_date_data_plan")
    override val creationDate: String,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_type_data_plan", referencedColumnName = "id_type_data_plan")
    override val type: GamePlanDataTypeEntity,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_version_plan_document", referencedColumnName = "id_version_plan_document")
    override val gamePlan: GamePlanEntity,
) : GamePlanData {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GamePlanDataEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
