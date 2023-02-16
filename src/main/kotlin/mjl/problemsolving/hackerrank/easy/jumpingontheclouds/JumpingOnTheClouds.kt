package mjl.problemsolving.hackerrank.easy.jumpingontheclouds

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var numberOfJumps = -1
    var index = 0

    while(index < c.size) {
        if(index + 2 < c.size && c[index + 2] == 0) {
            index+=2
        }
        else {
            index++
        }
        numberOfJumps++
    }

    return numberOfJumps
}