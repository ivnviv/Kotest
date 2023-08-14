import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.github.bonigarcia.wdm.WebDriverManager
import io.kotest.core.test.TestCase
import kotlinx.coroutines.test.TestResult
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.WebDriver

class GoogleSearchUITest : StringSpec() {

    private lateinit var driver: WebDriver

    init {
        beforeTest {
            WebDriverManager.chromedriver().setup()
            val options = ChromeOptions()
           // options.addArguments("--headless")
            driver = ChromeDriver(options)

            // Открываем страницу Google
            driver.get("https://www.google.com")
        }

        "Google search should return results" {
            // Вводим запрос в поисковую строку
            val searchBox = driver.findElement(By.name("q"))
            searchBox.sendKeys("Kotlin Kotest example")
            searchBox.submit()

           // val resultStats = driver.findElement(By.id("result-stats")).text
           // resultStats.contains("results") shouldBe true
        }

        afterTest {
            driver.quit()
        }
    }
}
