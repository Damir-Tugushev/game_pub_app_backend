package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameDocumentationTypeRepository
    : JpaRepository<GameDocumentationTypeEntity, Int>
