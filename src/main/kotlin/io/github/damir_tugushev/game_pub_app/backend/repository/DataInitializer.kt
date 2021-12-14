package io.github.damir_tugushev.game_pub_app.backend.repository

import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationEntity
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.*
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.plan_data.*
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.documentation.*
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis.*
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis.analysis_data.*
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.material.*
import io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.project.*
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.employee.*
import io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.organization.*

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class DataInitializer(
    private val passwordEncoder: PasswordEncoder,

    // Business plan
    private val gamePlanDataRepository: GamePlanDataRepository,
    private val gamePlanDataTypeRepository: GamePlanDataTypeRepository,
    private val gamePlanRepository: GamePlanRepository,
    private val gamePlanTypeRepository: GamePlanTypeRepository,

    // Documentation
    private val gameDocumentationRepository: GameDocumentationRepository,
    private val gameDocumentationTypeRepository: GameDocumentationTypeRepository,

    // Marketing analysis
    private val gameAnalysisDataRepository: GameAnalysisDataRepository,
    private val gameAnalysisDataTypeRepository: GameAnalysisDataTypeRepository,
    private val gameAnalysisRepository: GameAnalysisRepository,
    private val gameAnalysisTypeRepository: GameAnalysisTypeRepository,

    // Material
    private val gameMaterialRepository: GameMaterialRepository,
    private val gameMaterialTypeRepository: GameMaterialTypeRepository,

    // Project
    private val gameProjectRepository: GameProjectRepository,
    private val lifeCycleStageRepository: LifeCycleStageRepository,

    // Employee
    private val employeeRepository: EmployeeRepository,
    private val employeeTypeRepository: EmployeeTypeRepository,
    private val userRepository: UserRepository,

    // Organization
    private val organizationRepository: OrganizationRepository,
    private val organizationTypeRepository: OrganizationTypeRepository,
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        initAllTypes()
        initAllDocuments()

        organizationRepository.saveAll(initOrganizations(
            Pair(null, organizationTypeRepository.getById(2)),
            Pair(null, organizationTypeRepository.getById(2)),
            Pair(null, organizationTypeRepository.getById(2)),
//            Pair(organizationRepository.getById(3), organizationTypeRepository.getById(1)),
        ))

        organizationRepository.save(OrganizationEntity(
            headOrganization = organizationRepository.getById(3),
            organizationType = organizationTypeRepository.getById(1),
            name = "Mojang Studios", description = "Mojang Studios is a Swedish video game developer based in " +
                    "Stockholm. It was founded by the independent video game designer Markus Persson in 2009 as " +
                    "Mojang Specifications for the development and release of Persson''s sandbox and survival video " +
                    "game Minecraft. The studio inherited its name from a previous video game venture Persson had " +
                    "left two years prior. Following the game's release, Persson, in conjunction with Jakob Porsér, " +
                    "incorporated the business as Mojang AB in late 2010 and hired Carl Manneh as the company's " +
                    "chief executive officer. Other early hires included Daniel Kaplan and Jens Bergensten."
            ),
        )

        initEmployees()
    }

    private fun initAllTypes() {
        gamePlanDataTypeRepository.saveAll(initGamePlanDataTypes())
        gamePlanTypeRepository.saveAll(initGamePlanTypes())

        gameAnalysisDataTypeRepository.saveAll(initGameAnalysisDataTypes())
        gameAnalysisTypeRepository.saveAll(initGameAnalysisTypes())

        gameDocumentationTypeRepository.saveAll(initGameDocumentationTypes())
        gameMaterialTypeRepository.saveAll(initGameMaterialTypes())
        lifeCycleStageRepository.saveAll(initLifeCycleStages())

        employeeTypeRepository.saveAll(initEmployeeTypes())
        userRepository.saveAll(initUsers(passwordEncoder))

        organizationTypeRepository.saveAll(initOrganizationTypes())
    }

    private fun initAllDocuments() {
        initPlanDocuments()
        initAnalysisDocuments()
        initProjects()

        gameDocumentationRepository.saveAll(initGameDocumentation(
            Pair(gameDocumentationTypeRepository.getById(4), gameProjectRepository.getById(1)),
            Pair(gameDocumentationTypeRepository.getById(12), gameProjectRepository.getById(2)),
            Pair(gameDocumentationTypeRepository.getById(9), gameProjectRepository.getById(3)),
        ))
        gameMaterialRepository.saveAll(initGameMaterials(
            Pair(gameMaterialTypeRepository.getById(5), gameProjectRepository.getById(3)),
            Pair(gameMaterialTypeRepository.getById(2), gameProjectRepository.getById(1)),
            Pair(gameMaterialTypeRepository.getById(1), gameProjectRepository.getById(2)),
        ))
    }

    private fun initPlanDocuments() {
        gamePlanRepository.saveAll(initGamePlans(gamePlanTypeRepository.getById(1),
            gamePlanTypeRepository.getById(2), gamePlanTypeRepository.getById(3),
        ))

        gamePlanDataRepository.saveAll(initGamePlanData(
            Pair(gamePlanDataTypeRepository.getById(5), gamePlanRepository.getById(2)),
            Pair(gamePlanDataTypeRepository.getById(2), gamePlanRepository.getById(3)),
            Pair(gamePlanDataTypeRepository.getById(7), gamePlanRepository.getById(1)),
        ))
    }

    private fun initAnalysisDocuments() {
        gameAnalysisRepository.saveAll(initGameAnalysis(gameAnalysisTypeRepository.getById(8),
            gameAnalysisTypeRepository.getById(2), gameAnalysisTypeRepository.getById(5),
        ))

        gameAnalysisDataRepository.saveAll(initGameAnalysisData(
            Pair(gameAnalysisDataTypeRepository.getById(1), gameAnalysisRepository.getById(2)),
            Pair(gameAnalysisDataTypeRepository.getById(3), gameAnalysisRepository.getById(1)),
            Pair(gameAnalysisDataTypeRepository.getById(4), gameAnalysisRepository.getById(3)),
        ))
    }

    private fun initProjects() {
        val first = Triple(lifeCycleStageRepository.getById(7),
            gamePlanRepository.getById(1), gameAnalysisRepository.getById(3))
        val second = Triple(lifeCycleStageRepository.getById(7),
            gamePlanRepository.getById(2), gameAnalysisRepository.getById(1))
        val third = Triple(lifeCycleStageRepository.getById(5),
            gamePlanRepository.getById(3), gameAnalysisRepository.getById(2))

        gameProjectRepository.saveAll(initGameProjects(first, second, third))
    }

    private fun initEmployees() {
        val first = Triple(employeeTypeRepository.getById(1),
            organizationRepository.getById(4), userRepository.getById("markus_persson"))
        val second = Triple(employeeTypeRepository.getById(3),
            organizationRepository.getById(3), userRepository.getById("alexey_pajitnov"))
        val third = Triple(employeeTypeRepository.getById(9),
            organizationRepository.getById(2), userRepository.getById("ivan_ivanov"))
        val fourth = Triple(employeeTypeRepository.getById(8),
            organizationRepository.getById(1), userRepository.getById("tugushev_damir"))

        employeeRepository.saveAll(initEmployees(first, second, third, fourth))
    }
}
