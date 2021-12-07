package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.LifeCycleStageEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.project.LifeCycleStageService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("life_cycle_stages")
class LifeCycleStageController(override val service: LifeCycleStageService)
    : EntityController<LifeCycleStageEntity, Int>()
