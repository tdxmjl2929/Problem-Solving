package mjl.problemsolving.hackerrank.easy.repeatedstring

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    val numberOfAsInSingleString =  s.toList().count { it.toLowerCase() == 'a' }
    val lastParitalStringNumOfCharacters = n.rem(s.length).toInt()
    val numberOfAsInLastPartialString = when(lastParitalStringNumOfCharacters) {
        0 -> 0
        else -> s.substring(0, lastParitalStringNumOfCharacters).toList().count { it.toLowerCase() == 'a' }
    }

    return (numberOfAsInSingleString * (n / s.length)) + numberOfAsInLastPartialString
}