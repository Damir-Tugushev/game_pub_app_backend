package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.plan_data.GamePlanDataType
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "type_data_plan")
@Serializable
class GamePlanDataTypeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_data_plan")
    override val id: Int = 0,

    @Column(name = "description_type_data_plan", length = 1000)
    override val description: String,

    @Column(name = "name_type_data_plan", length = 100, unique = true)
    override val name: String,
) : GamePlanDataType {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GamePlanDataTypeEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
