package mjl.problemsolving.hackerrank.easy.twodarrayds

/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    // Write your code here


    /*
    * Hour glass positions
    * Hour Glass one   [0][0],[0][1],[0][2],[1][1],[2,0],[2,1],[2,2]
    * Hour Glass two   [0][1],[0][2],[0][3],[1][2],[2,1],[2,2],[2,3]
    * Hour Glass three [0][2],[0][3],[0][4],[1][3],[2,2],[2,3],[2,4]
    *
    * Pattern [x][y],[x][y+1],[x][y+2],[x+1][y+1],[x+2][y],[x+2][y+1],[x+2][y+2]
    */

    var maxSum = Int.MIN_VALUE //Assign to min int value in case max value is actually negative
    for(x in 0 until arr.size - 2) {
        for(y in 0 until arr.size - 2) {
            val sum = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2]
            if(sum > maxSum) {
                maxSum = sum
            }
        }
    }

    return maxSum
}