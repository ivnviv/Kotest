import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain


@AnnotationSpec.Test
class MyTest : StringSpec({

    "addition test444" {
        val result = 2 + 3
        result shouldBe 5
    }

    "subtraction testjjj" {
        val result = 8 - 3
        result shouldBe 5
    }
    "one more test"{
        val name = "Vanya"
        name shouldContain "a"
    }
})





