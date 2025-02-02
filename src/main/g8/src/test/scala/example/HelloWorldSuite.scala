package example

import frege.run8.Thunk
import munit.FunSuite

class HelloWorldSuite extends FunSuite {

  test("multiply") {

    val obtained = HelloWorld.multiply(6, 7)
    val expected = 42

    assertEquals(obtained, expected)
  }

  test("showWork") {

    val x = Thunk.`lazy`(6)
    val y = Thunk.`lazy`(7)

    val obtained = HelloWorld.showMultiply(x, y)
    val expected = "6 * 7 = 42"

    assertEquals(obtained, expected)
  }

}
