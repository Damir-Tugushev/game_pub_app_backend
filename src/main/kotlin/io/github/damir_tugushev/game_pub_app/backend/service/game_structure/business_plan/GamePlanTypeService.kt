package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.GamePlanTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GamePlanTypeService(override val repository: GamePlanTypeRepository)
    : EntityService<GamePlanTypeEntity, Int>()
