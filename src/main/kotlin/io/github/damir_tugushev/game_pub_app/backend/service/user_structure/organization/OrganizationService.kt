package io.github.damir_tugushev.game_pub_app.backend.service.user_structure.organization

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.organization.OrganizationRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class OrganizationService(override val repository: OrganizationRepository)
    : EntityService<OrganizationEntity, Int>()
