import Pages.ArticlePage
import Base.BaseTest
import Common.DriverManager
import Pages.SearchPage
import Pages.SearchResultsPage
import io.kotest.matchers.equals.shouldNotBeEqual
import io.kotest.matchers.shouldBe

 class ChangeLanguageTest : BaseTest() {
    init {

        "Article page should be able to switch language" {
            val searchPage = SearchPage(DriverManager.getDriver())
            searchPage.typeSearchQuery("Kotlin")
            val articlePage = ArticlePage(DriverManager.getDriver())

            //val originLang: String = getCurrentUrl()
            articlePage.clickToChangeLanguage()
            //val switchedLang: String = getCurrentUrl()


              //originLang shouldNotBeEqual switchedLang
        }
    }

}