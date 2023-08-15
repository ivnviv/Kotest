// DriverManager.kt
package Common

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

object DriverManager {
    private var driver: WebDriver? = null

    init {
        WebDriverManager.chromedriver().setup()
        val options = ChromeOptions()
        driver = ChromeDriver(options)
    }

    fun getDriver(): WebDriver {
        if (driver == null) {
            throw IllegalStateException("Driver not initialized")
        }
        return driver!!
    }

    fun quitDriver() {
        driver?.quit()
        driver = null
    }
}