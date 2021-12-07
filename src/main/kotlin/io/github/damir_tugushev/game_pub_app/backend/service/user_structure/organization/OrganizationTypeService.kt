package io.github.damir_tugushev.game_pub_app.backend.service.user_structure.organization

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.organization.OrganizationTypeRepository
import io.github.damir_tugushev.game_pub_app.backend.service.EntityService
import org.springframework.stereotype.Service

@Service
class OrganizationTypeService(override val repository: OrganizationTypeRepository)
    : EntityService<OrganizationTypeEntity, Int>()
