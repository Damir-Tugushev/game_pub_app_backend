package io.github.damir_tugushev.game_pub_app.backend.service.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.documentation.GameDocumentationTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class GameDocumentationTypeService(override val repository: GameDocumentationTypeRepository)
    : EntityService<GameDocumentationTypeEntity, Int>()
