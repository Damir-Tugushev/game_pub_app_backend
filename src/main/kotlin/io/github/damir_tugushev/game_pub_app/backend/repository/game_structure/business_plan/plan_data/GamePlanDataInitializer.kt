package io.github.damir_tugushev.game_pub_app.backend.repository.game_structure.business_plan.plan_data

import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.GamePlanEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataEntity
import io.github.damir_tugushev.game_pub_app.backend.model.game_structure.business_plan.plan_data.GamePlanDataTypeEntity

fun initGamePlanData(vararg pairs: Pair<GamePlanDataTypeEntity, GamePlanEntity>) = listOf(
    GamePlanDataEntity(
        type = pairs[0].first,
        gamePlan = pairs[0].second,
        description = "Most business plan templates will include things like a cover page, table of contents and the " +
                "main sections you need. It will also have pre-formatted pages with placeholder text and charts that " +
                "you can swap out. It takes time to do market research, present growth plans, put together financial " +
                "projections, analyze your customer base, create competitor breakdowns… the list goes on. The last " +
                "thing you want to do is spend precious time formatting the resulting document."
    ),
    GamePlanDataEntity(
        type = pairs[1].first,
        gamePlan = pairs[1].second,
        description = "Business plans need to be understandable at a glance to attract funding. Investors are " +
                "looking for information that will help them understand your business quickly and without much " +
                "effort. This is because there’s a defined type hierarchy, giving more visual weight to the headers " +
                "over the body text. Next, the unique selling points of this business–superior quality products, " +
                "unique glass carving and brass inlays, and excellent service–jump out. Because they’re presented in " +
                "an indented list, they’re easier to see at a glance, which will likely make them more memorable."
    ),
    GamePlanDataEntity(
        type = pairs[2].first,
        gamePlan = pairs[2].second,
        description = "Key statistics like these can go a long way towards convincing your investors that you’re " +
                "worth their time and money. If you’re going to include them within larger paragraphs, make sure " +
                "they stand out by increasing their font weight. To sum up: make your report skimmable. Draw " +
                "attention to important takeaways with indented lists, bolded text, and a clear type hierarchy. " +
                "It’s generally accepted that the ideal line length sits somewhere between 40 and 90 characters per " +
                "line. Any longer or shorter and you’ll find that something feels “off” about your document."
    ),
)

fun initGamePlanDataTypes() = listOf(
    GamePlanDataTypeEntity(
        name = "Executive summary",
        description = "The executive summary is the first and one of the most critical parts of a business " +
                "plan. This summary provides an overview of the business plan as a whole and highlights " +
                "what the business plan will cover. Its often best to write the executive summary last so " +
                "that you have a complete understanding of your plan and can effectively summarize it. " +
                "Your executive summary should include your organization's mission statement and the " +
                "products and services you plan to offer or currently offer. You may also want to include " +
                "why you are starting the company if the business plan is for a new organization."
    ),
    GamePlanDataTypeEntity(
        name = "Business description",
        description = "The next part of a business plan is the business description. This component " +
                "provides a comprehensive description of your business and its goals, products, services " +
                "and target customer base. You should also include details regarding the industry your " +
                "company will serve, and any trends and major competitors within the industry. You should " +
                "also include you and your teams experience in the industry and what sets your company " +
                "apart from the competition in your business description."
    ),
    GamePlanDataTypeEntity(
        name = "Management and organization description",
        description = "This section of your business plan should cover the details of your business " +
                "management and organization strategy. Introduce your company leaders and their " +
                "qualifications and responsibilities within your business. You can also include " +
                "human resources requirements and the legal structure of your company."
    ),
    GamePlanDataTypeEntity(
        name = "Products and services description",
        description = "Use this section to further expand on the details of the products and services your " +
                "company offers that you covered in the executive summary. Include all relevant information " +
                "about your products and services such as how you will manufacture them, how long " +
                "they will last, what needs they will meet and how much it will cost to create them."
    ),
    GamePlanDataTypeEntity(
        name = "Operating plan",
        description = "This part of your business plan should describe how you plan to run your company. " +
                "Include information regarding how and where your company will operate, how many employees " +
                "it will have and all other pertinent details related to your organization operations."
    ),
    GamePlanDataTypeEntity(
        name = "Financial projection and needs",
        description = "The financial section of your business plan should detail how you anticipate " +
                "bringing in revenue and the funding you''ll need to get started. You should include " +
                "your financial statements, an analysis of these statements and a cash flow projection."
    ),
    GamePlanDataTypeEntity(
        name = "Exhibits and appendices",
        description = "The final section of your business plan should include any extra information " +
                "to further support the details outlined in your plan. You can also include " +
                "exhibits and appendices to support the viability of your business plan and " +
                "give investors a clear understanding of the research that backs your plan."
    ),
)
