// basePage.kt
package Common

class BasePage() {
    fun open(url: String) {
        DriverManager.getDriver().get(url)
    }

    fun close() {
        DriverManager.quitDriver()
    }

}
