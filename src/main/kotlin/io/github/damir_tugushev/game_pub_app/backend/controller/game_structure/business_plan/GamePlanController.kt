package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan.GamePlanService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_plans")
class GamePlanController(override val service: GamePlanService)
    : EntityController<GamePlanEntity, Int>()
