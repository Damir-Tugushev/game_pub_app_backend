package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan.plan_data.GamePlanDataService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_plan_data")
class GamePlanDataController(override val service: GamePlanDataService)
    : EntityController<GamePlanDataEntity, Int>()
