package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.material.GameMaterialRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameMaterialService(override val repository: GameMaterialRepository)
    : EntityService<GameMaterialEntity, Int>()
