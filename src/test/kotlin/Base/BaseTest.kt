// BaseTest.kt
package Base

import Common.BasePage
import Common.DriverManager
import Pages.ArticlePage
import Pages.SearchPage
import Pages.SearchResultsPage
import io.kotest.core.spec.style.StringSpec

abstract class BaseTest : StringSpec() {
    val searchPage = SearchPage(DriverManager.getDriver())
    val articlePage = ArticlePage(DriverManager.getDriver())


    private val baseUrl = "https://ru.wikipedia.org/"
    private val basePage = BasePage()

    init {
        beforeTest {
            basePage.open(baseUrl)
        }

        afterTest {
            basePage.close()
        }
    }
    //fun getCurrentUrl(): String{
        //return DriverManager.getDriver().currentUrl
   // }
}
