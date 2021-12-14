package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis.GameAnalysis
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "marketing_analysis_document")
@Serializable
class GameAnalysisEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_version_analysis_document")
    override val id: Int = 0,

    @Column(name = "description_analysis_document", length = 1000)
    override val description: String,

    @Column(name = "content_analysis_document")
    override val contentUri: String = "",

    @Column(name = "creation_date_analysis_document")
    override val creationDate: String = "",

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_analysis", referencedColumnName = "id_type_analysis")
    override val type: GameAnalysisTypeEntity,

    @OneToMany(cascade = [CascadeType.MERGE], mappedBy = "gameAnalysis", fetch = FetchType.EAGER)
    override val gameAnalysisData: Set<GameAnalysisDataEntity> = setOf(),
) : GameAnalysis {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GameAnalysisEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
