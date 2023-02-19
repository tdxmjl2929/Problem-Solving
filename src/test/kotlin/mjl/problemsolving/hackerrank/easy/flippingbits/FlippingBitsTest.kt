package mjl.problemsolving.hackerrank.easy.flippingbits

import org.junit.jupiter.api.Test

class FlippingBitsTest {

    @Test
    fun test1() {
        val valueToFlip =2147483647L
        val result = flippingBits(valueToFlip)
        assert(result == 2147483648)
    }

    @Test
    fun test2() {
        val valueToFlip = 1L
        val result = flippingBits(valueToFlip)
        assert(result == 4294967294)
    }

    @Test
    fun test3() {
        val valueToFlip = 0L
        val result = flippingBits(valueToFlip)
        assert(result == 4294967295)
    }
}