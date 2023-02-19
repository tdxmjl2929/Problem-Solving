package mjl.problemsolving.hackerrank.medium.primality

/*
 * Complete the 'primality' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER n as parameter.
 */
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
fun primality(n: Int): String {
    // Write your code here

    //1 and 2 are edge cases that need to be handled individually
    if(n == 1)
        return "Not prime"
    else if (n == 2)
        return "Prime"

    //No number evenly divisible by greater than 1/2 of itself
    //so only need to iterated to n / 2
    for (i in 2..n / 2) {
        if (n.rem(i) == 0) {
            return "Not prime"
        }
    }
    return "Prime"
}