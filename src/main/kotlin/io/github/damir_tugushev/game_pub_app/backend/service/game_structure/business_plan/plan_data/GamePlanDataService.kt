package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.plan_data.GamePlanDataRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GamePlanDataService(override val repository: GamePlanDataRepository)
    : EntityService<GamePlanDataEntity, Int>()
