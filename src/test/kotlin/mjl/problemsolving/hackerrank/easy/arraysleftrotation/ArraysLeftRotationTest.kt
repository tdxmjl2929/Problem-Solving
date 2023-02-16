package mjl.problemsolving.hackerrank.easy.arraysleftrotation

import org.junit.jupiter.api.Test

class ArraysLeftRotationTest {

    @Test
    fun test1() {
        val arr = arrayOf(1,2,3,4,5)
        val numOfRotations = 4
        val result = rotLeft(arr, numOfRotations)
        assert(result.joinToString(" ") == "5 1 2 3 4")
    }

    @Test
    fun test2() {
        val arr = arrayOf(41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51)
        val numOfRotations = 10
        val result = rotLeft(arr, numOfRotations)
        assert(result.joinToString(" ") == "77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77")
    }

    @Test
    fun test3() {
        val arr = arrayOf(33,47,70,37,8,53,13,93,71,72,51,100,60,87,97)
        val numOfRotations = 13
        val result = rotLeft(arr, numOfRotations)
        assert(result.joinToString(" ") == "87 97 33 47 70 37 8 53 13 93 71 72 51 100 60")
    }
}