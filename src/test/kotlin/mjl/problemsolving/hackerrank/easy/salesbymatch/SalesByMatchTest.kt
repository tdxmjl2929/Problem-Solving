package mjl.problemsolving.hackerrank.easy.salesbymatch

import org.junit.jupiter.api.Test

class SalesByMatchTest {

    @Test
    fun test1() {
        val socks = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        val result = sockMerchant(socks.size, socks)
        assert(result == 3)
    }

    @Test
    fun test2() {
        val socks = arrayOf(10, 20, 20, 10, 10, 10, 20, 10, 20)
        val result = sockMerchant(socks.size, socks)
        assert(result == 4)
    }

    @Test
    fun test3() {
        val socks = arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)
        val result = sockMerchant(socks.size, socks)
        assert(result == 4)
    }
}