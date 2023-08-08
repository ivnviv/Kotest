import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


@AnnotationSpec.Test
class MyTest : StringSpec({

    "addition test444" {
        val result = 2 + 3
        result shouldBe 5
    }

    "subtraction test" {
        val result = 8 - 3
        result shouldBe 5
    }
})





