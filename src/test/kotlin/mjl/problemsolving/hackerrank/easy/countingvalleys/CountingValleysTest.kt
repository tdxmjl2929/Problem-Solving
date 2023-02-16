package mjl.problemsolving.hackerrank.easy.countingvalleys

import org.junit.jupiter.api.Test

class CountingValleysTest {

    @Test
    fun test1() {
        val path = "UDDDUDUU"
        val result = countingValleys(path.length, path)
        assert(result == 1)
    }

    @Test
    fun test2() {
        val path = "DDUUDDUDUUUD"
        val result = countingValleys(path.length, path)
        assert(result == 2)
    }
}