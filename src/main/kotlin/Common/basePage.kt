// basePage.kt
package Common

class basePage {
    fun open(url: String) {
        DriverManager.getDriver().get(url)
    }

    fun close() {
        DriverManager.quitDriver()
    }
}
