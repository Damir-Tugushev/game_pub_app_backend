package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.plan_data.GamePlanDataTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GamePlanDataTypeService(override val repository: GamePlanDataTypeRepository)
    : EntityService<GamePlanDataTypeEntity, Int>()
