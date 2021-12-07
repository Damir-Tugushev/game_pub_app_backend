package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project

import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project.LifeCycleStage
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils
import javax.persistence.*

@Entity
@Table(name = "life_cycle_stage")
@Serializable
class LifeCycleStageEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stage")
    override val id: Int = 0,

    @Column(name = "description_stage", length = 1000)
    override val description: String,

    @Column(name = "name_stage", length = 100, unique = true)
    override val name: String,
) : LifeCycleStage {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as LifeCycleStageEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
