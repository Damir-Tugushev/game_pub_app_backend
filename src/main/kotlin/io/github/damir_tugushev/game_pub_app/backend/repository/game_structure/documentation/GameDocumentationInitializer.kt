package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.documentation.GameDocumentationTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity

fun initGameDocumentation(vararg pairs: Pair<GameDocumentationTypeEntity, GameProjectEntity>) = listOf(
    GameDocumentationEntity(
        type = pairs[0].first,
        gameProject = pairs[0].second,
        name = "Game design document",
        description = "A game design document (often abbreviated GDD) is a highly descriptive living software design " +
                "document of the design for a video game. A GDD is created and edited by the development team and it " +
                "is primarily used in the video game industry to organize efforts within a development team. The " +
                "document is created by the development team as result of collaboration between their designers, " +
                "artists and programmers as a guiding vision which is used throughout the game development process. " +
                "When a game is commissioned by a game publisher to the development team, the document must be " +
                "created by the development team and it is often attached to the agreement between publisher and " +
                "developer; the developer has to adhere to the GDD during game development process."
    ),
    GameDocumentationEntity(
        type = pairs[1].first,
        gameProject = pairs[1].second,
        name = "Life cycle",
        description = "Game developers may produce the game design document in the pre-production stage of game " +
                "development—prior to or after a pitch. Before a pitch, the document may be conceptual and " +
                "incomplete. Once the project has been approved, the document is expanded by the developer to a " +
                "level where it can successfully guide the development team. Because of the dynamic environment of " +
                "game development, the document is often changed, revised and expanded as development progresses and " +
                "changes in scope and direction are explored. As such, a game design document is often referred to " +
                "as a living document, that is, a piece of work which is continuously improved upon throughout the " +
                "implementation of the project, sometimes as often as daily. A document may start off with only the " +
                "basic concept outlines and become a complete, detailed list" +
                " of every game aspect by the end of the project.",
    ),
    GameDocumentationEntity(
        type = pairs[2].first,
        gameProject = pairs[2].second,
        name = "Content",
        description = "A game design document may be made of text, images, diagrams, concept art, or any applicable " +
                "media to better illustrate design decisions. Some design documents may include functional " +
                "prototypes or a chosen game engine for some sections of the game. Although considered a requirement " +
                "by many companies, a GDD has no set industry standard form. For example, developers may choose to " +
                "keep the document as a word processed document, or as an online collaboration tool.",
    ),
)

fun initGameDocumentationTypes() = listOf(
    GameDocumentationTypeEntity(
        name = "Game Design Overview",
        description = "This is only a few pages, providing a high-level overview of the game, and is often written " +
                "for management. It is used to communicate the big picture of the game, the main creative vision."
    ),
    GameDocumentationTypeEntity(
        name = "Detailed design",
        description = "In this document, designers describe the game mechanics and interfaces. It helps designers " +
                "remember details, and communicate these details to artists and engineers. The document can appear " +
                "stitched together, because it evolves over time and is often abandoned halfway through development " +
                "as many of the main features are implemented."
    ),
    GameDocumentationTypeEntity(
        name = "Story overview",
        description = "Often external writers work on the game’s narrative, and game designers want to communicate " +
                "settings, characters, and actions to them. The document can be updated by writers and, in turn, " +
                "inform the game’s design as well.",
    ),
    GameDocumentationTypeEntity(
        name = "Technical design",
        description = "Within the engineering team, the technical details of game development have to be " +
                "communicated (e.g., rendering things on the screen, sending data over the network, saving files). " +
                "It contains the essential systems architecture underlying the game’s code."
    ),
    GameDocumentationTypeEntity(
        name = "Pipeline overview",
        description = "Often the assets (whether art, sound, or other files) in the game need to follow " +
                "specifications. This document keeps track of these requirements and specifications."
    ),
    GameDocumentationTypeEntity(
        name = "System limitations",
        description = "Engineers use this document to communicate the limitations of the game engine and other " +
                "systems that they are using (e.g., polygon count), which can be helpful for the creative teams to " +
                "keep their work in scope. If this is done well, it can save a lot of time later in development."
    ),
    GameDocumentationTypeEntity(
        name = "Art Bible",
        description = "The game’s art should have a single, consistent look and feel to it, which is often very " +
                "precisely communicated in guidelines contained within this document."
    ),
    GameDocumentationTypeEntity(
        name = "Concept art overview",
        description = "Similar to mood boards, the concept art overview helps the rest of the team to understand the " +
                "vision for the game and helps to keep the creative ideas aligned. Often concept art is also reused " +
                "in design documentation.",
    ),
    GameDocumentationTypeEntity(
        name = "Story Bible",
        description = "This is only necessary if the game actually features a story. Often limitations from other " +
                "teams (art, tech) will influence some parts of the narrative, so, again, it is good to keep a " +
                "common document of the game narrative and annotate it as changes are proposed."
    ),
    GameDocumentationTypeEntity(
        name = "Script",
        description = "If the game features any dialogue, it is recorded in " +
                "this document and checked for integrity and correctness.",
    ),
    GameDocumentationTypeEntity(
        name = "Game tutorial and Manual",
        description = "With the increasing amount of in-game tutorials, manuals have almost become obsolete for " +
                "games today, but this does not mean that it is not necessary to write down what the basic actions " +
                "in the game are and how to best teach them to players."
    ),
    GameDocumentationTypeEntity(
        name = "Walkthrough",
        description = "After the game is released, players often codify their own strategies, and document " +
                "Easter eggs and other parts of a game that they found particularly exciting."
    ),
)
