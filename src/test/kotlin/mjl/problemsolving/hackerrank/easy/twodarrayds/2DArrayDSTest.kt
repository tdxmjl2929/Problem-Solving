package mjl.problemsolving.hackerrank.easy.twodarrayds

import org.junit.jupiter.api.Test

class `2DArrayDSTest` {

    @Test
    fun test1() {
        val arr = arrayOf(
            arrayOf(1,1,1,0,0,0),
            arrayOf(0,1,0,0,0,0),
            arrayOf(1,1,1,0,0,0),
            arrayOf(0,0,2,4,4,0),
            arrayOf(0,0,0,2,0,0),
            arrayOf(0,0,1,2,4,0),
        )
        val result = hourglassSum(arr)
        assert(result == 19)
    }

    @Test
    fun test2() {
        val arr = arrayOf(
            arrayOf(1,1,1,0,0,0),
            arrayOf(0,1,0,0,0,0),
            arrayOf(1,1,1,0,0,0),
            arrayOf(0,9,2,-4,-4,0),
            arrayOf(0,0,0,-2,0,0),
            arrayOf(0,0,-1,-2,-4,0),
        )
        val result = hourglassSum(arr)
        assert(result == 13)
    }
}