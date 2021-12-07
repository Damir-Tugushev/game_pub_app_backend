package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.project.GameProjectRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameProjectService(override val repository: GameProjectRepository)
    : EntityService<GameProjectEntity, Int>()
