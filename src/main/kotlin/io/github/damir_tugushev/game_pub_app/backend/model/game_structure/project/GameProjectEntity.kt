package io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialEntity
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationEntity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project.GameProject
import kotlinx.serialization.Serializable
import org.springframework.data.util.ProxyUtils

import javax.persistence.*

@Entity
@Table(name = "game_project")
@Serializable
class GameProjectEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    override val id: Int = 0,

    @Column(name = "description_project", length = 1000)
    override val description: String,

    @Column(name = "creation_date_project")
    override val creationDate: String = "",

    @Column(name = "name_project", length = 100, unique = true)
    override val name: String,

    @ManyToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_stage", referencedColumnName = "id_stage")
    override val lifeCycleStage: LifeCycleStageEntity,

    @OneToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_version_plan_document", referencedColumnName = "id_version_plan_document")
    override val gamePlan: GamePlanEntity? = null,

    @OneToOne(cascade = [CascadeType.MERGE], fetch = FetchType.EAGER)
    @JoinColumn(name = "id_version_analysis_document", referencedColumnName = "id_version_analysis_document")
    override val gameAnalysis: GameAnalysisEntity? = null,

    @OneToMany(cascade = [CascadeType.MERGE], mappedBy = "gameProject", fetch = FetchType.EAGER)
    override val gameDocumentations: Set<GameDocumentationEntity> = setOf(),

    @OneToMany(cascade = [CascadeType.MERGE], mappedBy = "gameProject", fetch = FetchType.EAGER)
    override val gameMaterials: Set<GameMaterialEntity> = setOf(),

    @ManyToMany(cascade = [CascadeType.MERGE], mappedBy = "projects", fetch = FetchType.EAGER)
    override val organizations: Set<OrganizationEntity> = setOf(),
    ) : GameProject {
    override fun equals(other: Any?): Boolean {
        other ?: return false
        if (this === other) return true
        if (javaClass != ProxyUtils.getUserClass(other)) return false

        other as GameProjectEntity
        return this.id == other.id
    }

    override fun hashCode() = javaClass.hashCode()
}
