package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameDocumentationRepository
    : JpaRepository<GameDocumentationEntity, Int>
