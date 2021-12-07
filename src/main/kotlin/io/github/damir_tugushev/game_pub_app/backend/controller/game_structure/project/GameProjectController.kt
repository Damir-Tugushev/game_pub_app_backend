package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.project.GameProjectService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_projects")
class GameProjectController(override val service: GameProjectService)
    : EntityController<GameProjectEntity, Int>()
