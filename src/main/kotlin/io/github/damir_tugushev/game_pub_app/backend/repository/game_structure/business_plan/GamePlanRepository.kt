package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GamePlanRepository
    : JpaRepository<GamePlanEntity, Int>
