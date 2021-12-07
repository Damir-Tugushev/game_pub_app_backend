package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.marketing_analysis

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.marketing_analysis.GameAnalysisTypeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_analysis_types")
class GameAnalysisTypeController(override val service: GameAnalysisTypeService)
    : EntityController<GameAnalysisTypeEntity, Int>()
