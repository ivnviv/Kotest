package Pages

import Common.DriverManager
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class SearchPage(private val driver: WebDriver) {
    //private val baseUrl = "https://ru.wikipedia.org/"
    val searchBox = DriverManager.getDriver().findElement(By.xpath("//input[@class = 'vector-search-box-input']"))

    fun typeSearchQuery(query: String) {
        searchBox.sendKeys(query)
        searchBox.submit()
    }

}