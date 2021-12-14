package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.marketing_analysis.analysis_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.analysis_data.GameAnalysisDataTypeEntity

fun initGameAnalysisData(vararg pairs: Pair<GameAnalysisDataTypeEntity, GameAnalysisEntity>) = listOf(
    GameAnalysisDataEntity(
        type = pairs[0].first,
        gameAnalysis = pairs[0].second,
        description = "Reports of the past: By using the analysis of the past you get to know which project " +
                "performed better than the others. You find out which strategy helped generate more money " +
                "for the company. Also, you get to find out which things did not succeed as much as " +
                "it should. This way you avoid making the same error."
    ),
    GameAnalysisDataEntity(
        type = pairs[1].first,
        gameAnalysis = pairs[1].second,
        description = "Analyzing the current market: Marketing data analysis of the present allows you to understand " +
                "the current market better. It helps you to understand which methods are working fine. Answers " +
                "questions like how the customers are responding to your marketing plan. It gives an answer as to " +
                "what improvements you can implement to perform better."
    ),
    GameAnalysisDataEntity(
        type = pairs[2].first,
        gameAnalysis = pairs[2].second,
        description = "Predicting the future: Marketing data analysis can help you give an idea regarding the " +
                "future. It looks into trends and growths in the current market and makes assumptions based on " +
                "that. This in turn allows the company to set marketing plans for the future. You can even affect " +
                "the current market to ensure the future remains intact. Customer loyalty and return on investments " +
                "are things which can be affected in the present time to ensure " +
                "that you get better results in the future."
    ),
)

fun initGameAnalysisDataTypes() = listOf(
    GameAnalysisDataTypeEntity(
        name = "Game budget",
        description = "This is usually a spreadsheet that lists all the work and the attached value to help the " +
                "management team keep everything within the money limits of the production. For many projects " +
                "(not just game projects), a budget estimate is always necessary to obtain funding for a " +
                "project in the first place.",
    ),
    GameAnalysisDataTypeEntity(
        name = "Project schedule",
        description = "Ideally, game development works iteratively, with weekly changes and updates. However, all " +
                "tasks and important milestones to build the game should be tracked in this document. If scheduling " +
                "is done well, overtime is minimized, although because of different dependencies within project " +
                "teams, some overtime is usually very hard to avoid toward the end of a project cycle."
    ),
    GameAnalysisDataTypeEntity(
        name = "Sociological",
        description = "The sociological method concentrates on the communication field of games. A game is treated " +
                "as a product, which is offered by a producer to a consumer / recipient. The focus is not so much on " +
                "the game itself, but more on the social context of the game, both on the side of the producer and " +
                "the consumer. For the sociological analysis it is important to gain an important amount of " +
                "knowledge about the social factors of the time of production. A sociological analysis can under " +
                "these circumstances treat the medium itself only on the surface and is concentrated on all elements " +
                "and their mutual relations of the communication field of games."
    ),
    GameAnalysisDataTypeEntity(
        name = "Psychological",
        description = "The psychological game analysis is related to the effect a game causes to a recipient. It " +
                "tries to capture the associations and impressions, caused by the reception of the images, sounds " +
                "and interaction of the game, and that influence for a shorter or longer period the emotions of the " +
                "recipient. Strictly spoken each gamer should be interviewed for his or her feelings during " +
                "reception, as numerous details have their influence on the reception of a game. But on the other " +
                "hand it is safe to assume that many of the impressions gained during gameplay are intersubjective."
    ),
    GameAnalysisDataTypeEntity(
        name = "Game related",
        description = "The game related method researches one game by relating it to all other games (or a " +
                "representational selection) from the same developers studio (or distributor, leading artist, etc.) " +
                "or possibly a related group or development. It puts a game in the context of its background or " +
                "context during its development, and shows the development of a developers studio or a type of " +
                "games. In the same way it is possible to compare games from two different, but for certain reasons " +
                "comparable, developers or studios. This type of comparison focusses on the differences and the " +
                "resemblances between games, and/or developers. This type of analysis provides a large amount of " +
                "information on games and its makers. As it has no clear boundaries it is important to clearly " +
                "define the subjects this analysis will focuss on to begin with, but with the possibility to expand " +
                "the range of research on a later moment if necessary."
    ),
)
