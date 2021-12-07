package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.documentation.GameDocumentation
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "game_documentation")
@Serializable
class GameDocumentationEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documentation")
    override val id: Int = 0,

    @Column(name = "description_documentation", length = 1000)
    override val description: String,

    @Column(name = "content_documentation")
    override val contentUri: String,

    @Column(name = "creation_date_documentation")
    override val creationDate: String,

    @Column(name = "name_documentation", length = 100, unique = true)
    override val name: String,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_documentation", referencedColumnName = "id_type_documentation")
    override val type: GameDocumentationTypeEntity,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_project", referencedColumnName = "id_project")
    override val gameProject: GameProjectEntity,
) : GameDocumentation {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GameDocumentationEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
