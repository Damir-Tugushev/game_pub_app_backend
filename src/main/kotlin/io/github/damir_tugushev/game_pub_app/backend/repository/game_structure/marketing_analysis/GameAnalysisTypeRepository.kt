package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameAnalysisTypeRepository
    : JpaRepository<GameAnalysisTypeEntity, Int>
