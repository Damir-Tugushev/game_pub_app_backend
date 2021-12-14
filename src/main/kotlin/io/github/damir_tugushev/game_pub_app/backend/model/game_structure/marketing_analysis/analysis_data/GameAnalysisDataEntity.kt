package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis.analysis_data.GameAnalysisData
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "data_analysis_creation")
@Serializable
class GameAnalysisDataEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_data_analysis")
    override val id: Int = 0,

    @Column(name = "description_data_analysis", length = 1000)
    override val description: String,

    @Column(name = "content_data_analysis")
    override val contentUri: String = "",

    @Column(name = "creation_date_data_analysis")
    override val creationDate: String = "",

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_data_analysis", referencedColumnName = "id_type_data_analysis")
    override val type: GameAnalysisDataTypeEntity,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_version_analysis_document", referencedColumnName = "id_version_analysis_document")
    override val gameAnalysis: GameAnalysisEntity,
) : GameAnalysisData {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GameAnalysisDataEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}