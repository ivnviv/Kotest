import Base.BaseTest
import Common.DriverManager
import Pages.SearchPage
import Pages.SearchResultsPage
import io.kotest.matchers.shouldBe

class ArticleSearchTest : BaseTest() {
    init {
        "Search results should contain relevant article links" {
            val searchPage = SearchPage(DriverManager.getDriver())
            searchPage.typeSearchQuery("Kotlin is a programming language")

            val searchResultsPage = SearchResultsPage(DriverManager.getDriver())
            val articleLinks = searchResultsPage.getArticleLinks()

            // Проверяем, что хотя бы одна ссылка содержит ваш запрос
            articleLinks.any { it.text.contains("Kotlin", ignoreCase = true) } shouldBe true
        }
    }
}
