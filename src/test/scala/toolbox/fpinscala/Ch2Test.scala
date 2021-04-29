package toolbox.fpinscala

import org.scalatest.FunSuite

class Ch2Test extends FunSuite {

    test("isSortedShouldReturnTrueForSorted") {
        assert(Ch2.isSorted(Array(1, 2, 3, 4), (x: Int, y: Int) => x < y))
    }

    test("isSortedShouldReturnFalseForUnsorted") {
        assert(!Ch2.isSorted(Array(4, 3, 2, 1), (x: Int, y: Int) => x < y))
    }

    test("partialGivenFunctionLiteralShouldReturnExpected") {
        val partiallyApplied = Ch2.partial(1, (a: Int, b: Char) => (a + b).toChar.toString)
        assert("d" == partiallyApplied.apply('c'))
    }

    test("testCompose") {

    }

    test("testFib") {

    }

    test("testCurry") {

    }

    test("testUncurry") {

    }

}
