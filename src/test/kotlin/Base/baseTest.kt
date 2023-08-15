// BaseTest.kt
package Base

import Common.basePage
import Common.DriverManager
import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.StringSpec

abstract class BaseTest : StringSpec() {
    protected val baseUrl = "https://ru.wikipedia.org/"
    protected val basePage = basePage()



    init {
        beforeTest {
            basePage.open(baseUrl)
        }

        afterTest {
            basePage.close()
        }
    }
}
