package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.marketing_analysis

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.marketing_analysis.GameAnalysisService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_analysis")
class GameAnalysisController(override val service: GameAnalysisService)
    : EntityController<GameAnalysisEntity, Int>()
