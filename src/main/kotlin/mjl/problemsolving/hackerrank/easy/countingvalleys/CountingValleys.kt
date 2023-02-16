package mjl.problemsolving.hackerrank.easy.countingvalleys

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var altitude = 0
    var numberOfValleys = 0
    var isInValley = false

    for(i in 0 until steps) {
        when(path[i]) {
            'D' -> altitude--
            'U' -> altitude++
        }

        if(altitude < 0) {
            isInValley = true
        }
        else if(altitude >= 0) {
            if(isInValley) {
                numberOfValleys++
            }
            isInValley = false
        }
    }

    return numberOfValleys
}