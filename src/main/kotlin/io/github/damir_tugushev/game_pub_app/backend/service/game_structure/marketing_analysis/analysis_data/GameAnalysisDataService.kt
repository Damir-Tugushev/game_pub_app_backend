package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.marketing_analysis.analysis_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis.analysis_data.GameAnalysisDataRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameAnalysisDataService(override val repository: GameAnalysisDataRepository)
    : EntityService<GameAnalysisDataEntity, Int>()
