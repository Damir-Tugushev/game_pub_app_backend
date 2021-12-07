package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GameMaterialRepository
    : JpaRepository<GameMaterialEntity, Int>
