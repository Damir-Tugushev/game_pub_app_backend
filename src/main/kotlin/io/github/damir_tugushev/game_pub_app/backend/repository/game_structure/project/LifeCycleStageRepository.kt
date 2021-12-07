package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.LifeCycleStageEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LifeCycleStageRepository
    : JpaRepository<LifeCycleStageEntity, Int>
