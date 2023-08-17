package Pages

import Common.DriverManager
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class ArticlePage(private val driver: WebDriver) {
    val changeLanguageButton = DriverManager.getDriver().findElement(By.xpath("//*[@id=\"p-logo\"]/a"))


    fun clickToChangeLanguage(){
        changeLanguageButton.click()
    }

}