package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GamePlanTypeRepository
    : JpaRepository<GamePlanTypeEntity, Int>
