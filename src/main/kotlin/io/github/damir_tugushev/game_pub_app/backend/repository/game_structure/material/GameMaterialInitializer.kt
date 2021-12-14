package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.material

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.material.GameMaterialTypeEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.project.GameProjectEntity

fun initGameMaterials(vararg pairs: Pair<GameMaterialTypeEntity, GameProjectEntity>) = listOf(
    GameMaterialEntity(
        type = pairs[0].first,
        gameProject = pairs[0].second,
        name = "Game marketing on YouTube",
        description = "If you don’t already have a YouTube channel, now is the time to set one up. With YouTube " +
                "being the second largest search engine after Google, you are looking at an open playing field of " +
                "opportunities to promote your game and engage with potential players and gaming reviewers. Creating " +
                "a promo video to use as a teaser, with the most thrilling or exciting parts of your game, is an " +
                "excellent way to kick things off. Include great graphics and soundtrack, along with any other " +
                "important pieces of information that will be attractive to a potential player. Once you have your " +
                "video uploaded, you can add the link to your description page on app stores and other social media " +
                "channels. You can then start adding tips and tricks or help videos and start engaging with other " +
                "gaming channels to get your name out there."
    ),
    GameMaterialEntity(
        type = pairs[1].first,
        gameProject = pairs[1].second,
        name = "Game marketing through blogging",
        description = "Creating a blog on your website is one of the most reliable long-term investments and is " +
                "beneficial for several reasons. Blog posts should always be fun, informative and creative, as you " +
                "want them to be shared on social media channels and lead new people to your game. Your game is " +
                "going to get more visibility if you ensure your blog content is shared around the internet."
    ),
    GameMaterialEntity(
        type = pairs[2].first,
        gameProject = pairs[2].second,
        name = "App store optimization for games",
        description = "App store optimization (ASO) is a video game marketing strategy, which after running through " +
                "a series of tactics, allows you to position your game to boost its ranking and visibility. Using " +
                "the right app store marketing tactics, there is a higher chance that your game will be " +
                "discoverable in the app store’s search results and you can subsequently drive " +
                "traffic to your game’s page and convert visitors into players."
    ),
)

fun initGameMaterialTypes() = listOf(
    GameMaterialTypeEntity(
        name = "Infographics",
        description = "Throughout the past few years, any company living up to the trends in the digital marketing " +
                "era has released some sort of infographic. Infographics are highly sharable, catchy on the eye " +
                "and are more fun to read than a generic blog post. But, with the more companies releasing these, " +
                "the competition to stand out continues to increase and companies are left " +
                "searching for a new unique and sharable piece."
    ),
    GameMaterialTypeEntity(
        name = "Gifographics",
        description = "If you’re looking for a type of content to “one up” your infographics, the best option could " +
                "be the gifographic. This is a mix between an interactive and a static infographic. If you don’t " +
                "have the budget to go all out with a custom interactive, a visually moving infographic would be " +
                "your best bet. These will stand out amongst the static graphics and are more likely to be shared " +
                "around the web. After all, if it’s good enough for Google it should be good enough for your business!"
    ),
    GameMaterialTypeEntity(
        name = "Live Streams",
        description = "With today’s technology and how simple it is to live stream anything… why wouldn’t you? " +
                "UStream has been around for quite some time and now companies like Meerkat and Periscope have " +
                "jumped in the mix creating apps that can be launched at the tap of the finger off your smartphone. " +
                "How does this help set the bar above your competitors? This tactic is real time, gives content the " +
                "urgency of watching now, allows viewers to be involved, and is ready to share at the tap of a tweet."
    ),
    GameMaterialTypeEntity(
        name = "Podcasts",
        description = "This one is a throwback that is really starting to find its niche in the content space. Who " +
                "is to thank for that? Money and technology. Today’s consumers are all about finding value, and " +
                "today’s technology is perfect for podcasting. Podcasts are a perfect combination because they are " +
                "relatively low-cost to create and with the variety of recording and playing options, it is " +
                "something almost anyone can do. Not only that, users love the break from reading a blog post or " +
                "digesting a graphic. A podcast is easy for users to listen to and provides a ton of value. " +
                "Additionally, smartphones make podcasts accessible and easy to share. A podcast could be a perfect " +
                "investment for your company if you’re looking for another way to reach your consumers. Not only can " +
                "you offer entertaining and valuable information, but you can reach a new audience that your blog " +
                "articles or infographics are not touching."
    ),
    GameMaterialTypeEntity(
        name = "Advergame",
        description = "An advergame is a gamification technique that sees an online video game promote a particular " +
                "brand, product, or marketing message by integrating it into a game template, created expressly for " +
                "promotional purposes. Advergames now are often commissioned for mobile devices to support other " +
                "media, not replace them."
    ),
    GameMaterialTypeEntity(
        name = "Experiential marketing",
        description = "This can be defined as providing a fully immersive and interactive event that is linked to " +
                "a brand campaign. Experiential marketing, while mostly taking place in physical locations can also " +
                "take place within AR & VR formats as well."
    ),
)
