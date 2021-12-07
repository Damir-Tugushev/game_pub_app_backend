package io.github.damir_tugushev.game_pub_app.backend.service

import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull

abstract class EntityService<T : Entity<I>, I : Any> {
    protected abstract val repository: JpaRepository<T, I>

    suspend fun getAll(): Set<T> =
        withContext(Dispatchers.IO) { repository.findAll().toSet() }

    suspend fun save(entity: T): T =
        withContext(Dispatchers.IO) { repository.save(entity) }

    suspend fun delete(entity: T) =
        withContext(Dispatchers.IO) { repository.delete(entity) }

    suspend fun findById(id: I): T? =
        withContext(Dispatchers.IO) { repository.findByIdOrNull(id) }

    suspend fun deleteById(id: I) =
        withContext(Dispatchers.IO) { repository.deleteById(id) }

    suspend fun exists(entity: T): Boolean =
        withContext(Dispatchers.IO) { repository.existsById(entity.id) }
}
