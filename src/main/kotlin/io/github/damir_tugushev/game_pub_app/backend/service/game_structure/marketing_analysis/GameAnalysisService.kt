package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.marketing_analysis

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis.GameAnalysisRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameAnalysisService(override val repository: GameAnalysisRepository)
    : EntityService<GameAnalysisEntity, Int>()
