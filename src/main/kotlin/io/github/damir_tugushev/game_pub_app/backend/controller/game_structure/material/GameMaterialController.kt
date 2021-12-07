package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.material.GameMaterialService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_materials")
class GameMaterialController(override val service: GameMaterialService)
    : EntityController<GameMaterialEntity, Int>()
