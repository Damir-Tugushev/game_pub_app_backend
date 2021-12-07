package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.material.GameMaterial
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "game_material")
@Serializable
class GameMaterialEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    override val id: Int = 0,

    @Column(name = "description_material", length = 1000)
    override val description: String,

    @Column(name = "content_material")
    override val contentUri: String,

    @Column(name = "creation_date_material")
    override val creationDate: String,

    @Column(name = "name_material", length = 100, unique = true)
    override val name: String,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_type_material", referencedColumnName = "id_type_material")
    override val type: GameMaterialTypeEntity,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_project", referencedColumnName = "id_project")
    override val gameProject: GameProjectEntity,
) : GameMaterial {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GameMaterialEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
