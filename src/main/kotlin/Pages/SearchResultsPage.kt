package Pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class SearchResultsPage (private val driver: WebDriver) {
    fun getArticleLinks(): List<WebElement> {
        return driver.findElements(By.xpath("//ul[@class='mw-search-results']/li//a"))
    }
}