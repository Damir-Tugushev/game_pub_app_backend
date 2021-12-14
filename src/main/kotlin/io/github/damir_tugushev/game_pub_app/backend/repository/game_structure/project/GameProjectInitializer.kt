package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.project

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.marketing_analysis.GameAnalysisEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.LifeCycleStageEntity

fun initGameProjects(vararg triples: Triple<LifeCycleStageEntity, GamePlanEntity, GameAnalysisEntity>) = listOf(
    GameProjectEntity(
        lifeCycleStage = triples[0].first,
        gamePlan = triples[0].second,
        gameAnalysis = triples[0].third,
        name = "Tetris",
        description = "In Tetris, players complete lines by moving differently shaped pieces, which descend onto the " +
                "playing field. The completed lines disappear and grant the player points, and the player can " +
                "proceed to fill the vacated spaces. The game ends when the playing field is filled. The longer the " +
                "player can delay this inevitable outcome, the higher their score will be. In multiplayer games, the " +
                "players must last longer than their opponents, and in certain versions, players can inflict " +
                "penalties on opponents by completing a significant number of lines. Some adaptations have provided " +
                "variations to the game's theme, such as three-dimensional displays or a system for reserving pieces."
    ),
    GameProjectEntity(
        lifeCycleStage = triples[1].first,
        gamePlan = triples[1].second,
        gameAnalysis = triples[1].third,
        name = "Minecraft",
        description = "In Minecraft, players explore a blocky, procedurally-generated 3D world with virtually " +
                "infinite terrain, and may discover and extract raw materials, craft tools and items, and build " +
                "structures or earthworks. Depending on game mode, players can fight computer-controlled mobs, as " +
                "well as cooperate with or compete against other players in the same world. Game modes include a " +
                "survival mode, in which players must acquire resources to build the world and maintain health, and " +
                "a creative mode, where players have unlimited resources and access to flight. Players can modify " +
                "the game to create new gameplay mechanics, items, and assets."
    ),
    GameProjectEntity(
        lifeCycleStage = triples[2].first,
        gamePlan = triples[2].second,
        gameAnalysis = triples[2].third,
        name = "9Lives Arena",
        description = "9Lives Arena is a competitive online RPG with a unique take on 1v1 PvP. Atlantis fell many " +
                "decades ago, yet the tournament of 9Lives starring clones from abducted battlefield legends of the " +
                "future is still ongoing and is run by the last surviving tribe of the ancients. As a player, the " +
                "bloodline of your tournament clone defines your most valuable passive skill. Choose your skills " +
                "wisely from different times and regions... Viking, Barbarian, Samurai, Gladiator or Ancient Atlantean."
    ),
)

fun initLifeCycleStages() = listOf(
    LifeCycleStageEntity(
        name = "Planning",
        description = "This is the very first part of the planning stage and the roots that every video game will " +
                "grow from. In the planning stage, the most basic questions will need to be answered. Ideating a " +
                "video game is one of the hardest parts of game development. The idea a gaming studio comes up with " +
                "will serve as the backbone of the entire game. It’s what sets the standard for every employee " +
                "involved with building the game, but also gives publishers a high-level overview of what to expect. " +
                "This brings us to the next part of development – proofing a concept. A proof of concept takes all " +
                "the ideas that have been generated and sees how viable they are for the gaming studio to produce."
    ),
    LifeCycleStageEntity(
        name = "Pre-production",
        description = "The next stage of game development, called pre-production, brainstorms how to give life to " +
                "the many ideas laid out in the planning phase. This is where writers, artists, designers, " +
                "developers, engineers, project leads, and other crucial departments collaborate on the scope of the " +
                "video game and where each piece of the puzzle fits. From here, it’s common for studios to prototype " +
                "characters, environments, interfaces, control schemes, and other in-game elements to see how they " +
                "look, feel, and interact with one another. This is essentially the “let’s see what we’re working " +
                "with” moment before moving onto the bread-and-butter of development – production."
    ),
    LifeCycleStageEntity(
        name = "Production",
        description = "Most of the time, effort, and resources spent on developing video games are during the " +
                "production stage. This also happens to be one of the most challenging stages of video game " +
                "development. Lots of events could take years of iterating to get right, and that’s assuming only " +
                "a few changes are made along the way, which is hardly the reality. In game development, it’s not " +
                "uncommon for entire segments of a game – months worth of work – to get scrapped after its " +
                "completed. You can imagine how frustrating this is for the employees involved. These types of " +
                "changes are typically brought up in the testing stage."
    ),
    LifeCycleStageEntity(
        name = "Testing",
        description = "Every feature and mechanic in the game needs to be tested for quality control. A game that " +
                "hasn’t been thoroughly tested is a game that’s not even ready for an Alpha release. Some " +
                "playtesters conduct stress tests by running into walls hundreds, if not thousands of times in an " +
                "attempt to “break” the game. Other playtesters conduct “fun factor” tests to see if the game is " +
                "too hard or too easy, or complete the entire game to see if it was satisfying enough. After " +
                "countless hours of testing and iterating, the game should be ready for a late-Alpha or even Beta " +
                "release, depending on how polished the in-game features are. This is the first time the public will " +
                "get their hands on the game.",
    ),
    LifeCycleStageEntity(
        name = "Pre-launch",
        description = "The pre-launch stage is a stressful time for gaming studios. Questions of self-doubt may seep " +
                "in as you wonder how the public will react to your first functional product. But before a formal " +
                "Beta copy is released, the game will require some marketing. After all, how else will people " +
                "learn about it? Publishers almost always expect a hype video with a mix of cinematics " +
                "and sample gameplay to drive attention.",
    ),
    LifeCycleStageEntity(
        name = "Launch",
        description = "The months leading up to a game’s anticipated launch date is mostly spent squashing large " +
                "backlogs of bugs – some old, some new found in the testing stage. For games with many bugs, a " +
                "studio will create a hierarchy of bugs to squash. This hierarchy will include “game-crashing” bugs " +
                "near the top and minor bugs near the bottom. In addition to bug squashing, developers will " +
                "typically polish the game as much as possible before it launches. These types of changes, though " +
                "minor, can be important for making a video game more immersive. And when the game is squeaky-clean, " +
                "it’s time to launch and distribute.",
    ),
    LifeCycleStageEntity(
        name = "Post-production",
        description = "This is one of the most exciting times for any gaming studio. Years of hard work has finally " +
                "paid off, and video game sales are (hopefully) pouring in. But even now, there’s still work to be " +
                "done. It’s not uncommon for video games to launch with batches of minor bugs. The first few months " +
                "during the post-launch stage are typically spent identifying and squashing these bugs. Gaming " +
                "studios also rely on players to submit bug reports or speak up about bugs in online forums. This is " +
                "all part of post-launch support. Another part of post-launch is to provide regular software updates " +
                "for the game. These updates range from game-balancing patches to new downloadable content, or DLCs. " +
                "Releasing fresh content is common in today’s gaming industry because it increases the replay value " +
                "and appeal of a game. New levels, storylines, and multiplayer modes are just a few of the many DLC " +
                "options a gaming studio could explore.",
    ),
)
