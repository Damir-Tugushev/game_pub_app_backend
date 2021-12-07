package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.marketing_analysis.analysis_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis.analysis_data.GameAnalysisDataTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameAnalysisDataTypeService(override val repository: GameAnalysisDataTypeRepository)
    : EntityService<GameAnalysisDataTypeEntity, Int>()
