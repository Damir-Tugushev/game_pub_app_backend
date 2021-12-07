package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan.plan_data.GamePlanDataTypeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_plan_data_types")
class GamePlanDataTypeController(override val service: GamePlanDataTypeService)
    : EntityController<GamePlanDataTypeEntity, Int>()
