package mjl.problemsolving.hackerrank.easy.jumpingontheclounds

import mjl.problemsolving.hackerrank.easy.jumpingontheclouds.jumpingOnClouds
import org.junit.jupiter.api.Test

class JumpingOnTheCloudsTest {

    @Test
    fun test1() {
        val clouds = arrayOf(0,0,1,0,0,1,0)
        val result = jumpingOnClouds(clouds)
        assert(result == 4)
    }

    @Test
    fun test2() {
        val clouds = arrayOf(0,0,0,1,0,0)
        val result = jumpingOnClouds(clouds)
        assert(result == 3)
    }
}