// ArticleSearchTest.kt
import Base.BaseTest
import Common.DriverManager
import io.kotest.core.spec.style.StringSpec
import org.openqa.selenium.By

class ArticleSearchTest : BaseTest() {
    val searchBox = DriverManager.getDriver().findElement(By.xpath("//input[@class = 'vector-search-box-input']"))

    init {
        "Type 'Kotlin programming language' in the search input" {

            searchBox.sendKeys("Kotlin programming language")
            searchBox.submit()

            // Ваши проверки
        }
    }
}
