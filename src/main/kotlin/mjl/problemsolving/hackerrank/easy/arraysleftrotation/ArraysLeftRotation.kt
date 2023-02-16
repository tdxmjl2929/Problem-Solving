package mjl.problemsolving.hackerrank.easy.arraysleftrotation

/*
 * Complete the 'rotLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER d
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    // Write your code here
    if(d == a.size) {
        return a
    }

    var numberOfRotations = 0
    while(numberOfRotations < d) {
        val rotatedValue = a[0]
        for (i in 0 until a.lastIndex) {
            a[i] = a[i+1]
        }
        a[a.lastIndex] = rotatedValue
        numberOfRotations++
    }

    return a
}