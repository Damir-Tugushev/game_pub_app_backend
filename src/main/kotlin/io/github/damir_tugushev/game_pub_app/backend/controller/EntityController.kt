package io.github.damir_tugushev.game_pub_app.backend.controller

import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

abstract class EntityController<T : Entity<I>, I : Any> {
    protected abstract val service: EntityService<T, I>

    @GetMapping("all")
    suspend fun getAll(): Set<T> = service.getAll()

    @PostMapping("save")
    suspend fun save(@RequestBody entity: T): T = service.save(entity)

    @DeleteMapping("delete")
    suspend fun delete(@RequestBody entity: T): Unit = service.delete(entity)

    @GetMapping("find/id")
    suspend fun findById(@RequestBody id: I): T? = service.findById(id)

    @DeleteMapping("delete/id")
    suspend fun deleteById(@RequestBody id: I): Unit = service.deleteById(id)
}
