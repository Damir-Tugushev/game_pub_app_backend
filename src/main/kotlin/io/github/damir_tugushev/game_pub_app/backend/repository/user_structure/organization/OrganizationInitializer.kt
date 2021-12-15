package io.github.damir_tugushev.game_pub_app.backend.repository.user_structure.organization

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationEntity
import io.github.damir_tugushev.game_pub_app.backend.model.user_structure.organization.OrganizationTypeEntity

fun initOrganizations(vararg triples: Triple<OrganizationEntity?, OrganizationTypeEntity, GameProjectEntity>) = listOf(
    OrganizationEntity(
        headOrganization = triples[0].first,
        organizationType = triples[0].second,
        name = "Nintendo",
        description = "This company is credited with the conception of handheld video games in 1979. Nintendo was " +
                "founded by Fusajiro Yamauchi in September 1889. It is headquartered in Kyoto, Japan but has " +
                "subsidiaries and offices in several other parts of the world. Nintendo is the world’s largest video " +
                "game company by revenue, with a net value of over USD85 Billion.",
        projects = setOf(triples[0].third)
    ),
    OrganizationEntity(
        headOrganization = triples[1].first,
        organizationType = triples[1].second,
        name = "Valve Corporation",
        description = "It’s headquartered in Bellevue, Washington and has a subsidiary in Luxembourg. It was started " +
                "in 1996 by former Microsoft employees Gabe Newell and Mike Harrington. It has total equity of over " +
                "USD2.5 Billion. Some of the work produced by Valve Corporation includes: Counter-strike series, " +
                "Dota 2, Day of defeat series, Half-life series.",
        projects = setOf(triples[1].third)
    ),
    OrganizationEntity(
        headOrganization = triples[2].first,
        organizationType = triples[2].second,
        name = "Microsoft",
        description = "Microsoft Corporation is an American multinational technology corporation which produces " +
                "computer software, consumer electronics, personal computers, and related services. Its best known " +
                "software products are the Microsoft Windows line of operating systems, the Microsoft Office suite, " +
                "and the Internet Explorer and Edge web browsers. Its flagship hardware products are the Xbox video " +
                "game consoles and the Microsoft Surface lineup of touchscreen personal computers. Microsoft ranked " +
                "No. 21 in the 2020 Fortune 500 rankings of the largest United States corporations by total revenue; " +
                "it was the world's largest software maker by revenue as of 2016.",
        projects = setOf(triples[2].third)
    ),
)

fun initOrganizationTypes() = listOf(
    OrganizationTypeEntity(
        name = "Game developer",
        description = "In the video game industry, a game developer is part of a company which manufactures a " +
                "video game console and develops exclusively for it. Developers may use the name of the company " +
                "itself, have a specific division name or have been an independent studio before being acquired by " +
                "the console manufacturer. Whether by purchasing an independent studio or by founding a new team, " +
                "the acquisition of a first-party developer involves a huge financial investment on the part of the " +
                "console manufacturer, which is wasted if the developer fails to produce a hit game in a timely " +
                "manner. However, using developers saves the cost of having " +
                "to make royalty payments on a games profits.",
    ),
    OrganizationTypeEntity(
        name = "Game publisher",
        description = "A video game publisher is a company that publishes video games that have been developed " +
                "either internally by the publisher or externally by a video game developer. The large video " +
                "game publishers distribute the games they publish, while some smaller publishers instead hire " +
                "distribution companies (or larger video game publishers) to distribute the games they publish. " +
                "Other functions usually performed by the publisher include deciding on and paying for any licenses " +
                "used by the game; paying for localization; layout, printing, and possibly the writing of the user " +
                "manual; and the creation of graphic design elements such as the box design. Some large publishers " +
                "with vertical structure also own publishing subsidiaries (labels)."
    ),
)
