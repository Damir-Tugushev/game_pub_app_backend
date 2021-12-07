package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.LifeCycleStageEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.project.LifeCycleStageRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class LifeCycleStageService(override val repository: LifeCycleStageRepository)
    : EntityService<LifeCycleStageEntity, Int>()
