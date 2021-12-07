package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.marketing_analysis.analysis_data

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.marketing_analysis.analysis_data.GameAnalysisDataTypeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_analysis_data_types")
class GameAnalysisDataTypeController (override val service: GameAnalysisDataTypeService)
    : EntityController<GameAnalysisDataTypeEntity, Int>()
