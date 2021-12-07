package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.documentation.GameDocumentationRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameDocumentationService(override val repository: GameDocumentationRepository)
    : EntityService<GameDocumentationEntity, Int>()
