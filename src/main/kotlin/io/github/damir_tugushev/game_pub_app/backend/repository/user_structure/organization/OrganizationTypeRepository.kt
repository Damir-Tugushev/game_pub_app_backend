package io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.organization

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrganizationTypeRepository
    : JpaRepository<OrganizationTypeEntity, Int>
