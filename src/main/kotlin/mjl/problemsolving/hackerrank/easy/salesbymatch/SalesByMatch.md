There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

**Example**


There is one pair of color and one of color . There are three odd socks left, one of each color. The number of pairs is .

**Function Description**

Complete the _sockMerchant_ function in the editor below.

sockMerchant has the following parameter(s):

*   _int n:_ the number of socks in the pile
*   _int ar\[n\]:_ the colors of each sock

**Returns**

*   _int:_ the number of pairs

**Input Format**

The first line contains an integer , the number of socks represented in .  
The second line contains space-separated integers, , the colors of the socks in the pile.

**Constraints**

*   1 <= n <= 100
*   1 <= <em>ar[i]</em> <= 100 where 0 <= <em>i</em> < <em>n</em>

**Sample Input**

    STDIN                       Function
    -----                       --------
    9                           n = 9
    10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]


**Sample Output**

    3


**Explanation**

![sock.png](https://s3.amazonaws.com/hr-challenge-images/25168/1474122392-c7b9097430-sock.png)

There are three pairs of socks.