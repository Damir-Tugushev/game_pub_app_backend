package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.GamePlanRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GamePlanService(override val repository: GamePlanRepository)
    : EntityService<GamePlanEntity, Int>()
