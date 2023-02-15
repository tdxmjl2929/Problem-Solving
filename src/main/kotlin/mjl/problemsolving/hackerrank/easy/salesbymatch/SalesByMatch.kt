package mjl.problemsolving.hackerrank.easy.salesbymatch

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    var numberOfPairs = 0
    ar.groupBy { it }.forEach {
        numberOfPairs += it.value.size.div(2)
    }
    return numberOfPairs
}