package io.github.damir_tugushev.game_pub_app.backend.controller.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.service.game_structure.material.GameMaterialTypeService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("game_material_types")
class GameMaterialTypeController(override val service: GameMaterialTypeService)
    : EntityController<GameMaterialTypeEntity, Int>()
