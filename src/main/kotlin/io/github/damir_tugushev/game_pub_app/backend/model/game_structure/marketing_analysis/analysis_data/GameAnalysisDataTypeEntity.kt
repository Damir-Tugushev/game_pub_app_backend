package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data

import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataType
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils
import javax.persistence.*

@Entity
@Table(name = "type_data_analysis")
@Serializable
class GameAnalysisDataTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_data_analysis")
    override val id: Int = 0,

    @Column(name = "description_type_data_analysis", length = 1000)
    override val description: String,

    @Column(name = "name_type_data_analysis", length = 100, unique = true)
    override val name: String,
) : GameAnalysisDataType {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GameAnalysisDataTypeEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
