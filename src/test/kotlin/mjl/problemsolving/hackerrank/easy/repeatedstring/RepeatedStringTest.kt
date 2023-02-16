package mjl.problemsolving.hackerrank.easy.repeatedstring

import org.junit.jupiter.api.Test

class RepeatedStringTest {

    @Test
    fun test1() {
        val s = "aba"
        val n = 10L
        val result = repeatedString(s, n)
        assert(result == 7L)
    }

    @Test
    fun test2() {
        val s = "a"
        val n = 1000000000000
        val result = repeatedString(s, n)
        assert(result == 1000000000000)
    }
}