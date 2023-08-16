import Base.BaseTest
import Common.BasePage
import Common.DriverManager
import Pages.SearchResultsPage
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.equals.shouldNotBeEqual
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNot


class ChangeLanguageTest : BaseTest() {

    init {
        "Article page should be able to switch language" {
            searchPage.typeSearchQuery("Kotlin")
            //val originLang: String = getCurrentUrl()
            articlePage.changeLanguageButton
           // val switchedLang: String = getCurrentUrl()

            // Проверяем, что урлы не совпадают, а значит язык изменился
          //  originLang shouldNotBeEqual switchedLang
        }
    }

}