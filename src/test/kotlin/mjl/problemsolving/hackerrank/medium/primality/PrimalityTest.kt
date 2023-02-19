package mjl.problemsolving.hackerrank.medium.primality

import org.junit.jupiter.api.Test

class PrimalityTest {

    @Test
    fun test1() {
        val numberToCheck = 12
        val result = primality(numberToCheck)
        assert(result == "Not prime")
    }

    @Test
    fun test2() {
        val numberToCheck = 5
        val result = primality(numberToCheck)
        assert(result == "Prime")
    }

    @Test
    fun test3() {
        val numberToCheck = 7
        val result = primality(numberToCheck)
        assert(result == "Prime")
    }
}