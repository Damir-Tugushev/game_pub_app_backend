package io.github.damir_tugushev.game_pub_app.backend.controller.user_structure.organization

import io.github.damir_tugushev.game_pub_app.backend.controller.EntityController
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationEntity
import io.github.damir_tugushev.game_pub_app.backend.service.user_structure.organization.OrganizationService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("organizations")
class OrganizationController(override val service: OrganizationService)
    : EntityController<OrganizationEntity, Int>()
