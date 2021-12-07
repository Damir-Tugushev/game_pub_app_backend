package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.material.GameMaterialTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameMaterialTypeService(override val repository: GameMaterialTypeRepository)
    : EntityService<GameMaterialTypeEntity, Int>()
