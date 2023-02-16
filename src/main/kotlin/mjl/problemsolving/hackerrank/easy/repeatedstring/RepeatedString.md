There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter `a`'s in the first letters of the infinite string.

**Example**

<em>s = 'abcac'</em></br>
<em>n = 10</em>

The substring we consider is , the first characters of the infinite string. There are occurrences of `a` in the substring.

**Function Description**

Complete the _repeatedString_ function in the editor below.

repeatedString has the following parameter(s):

*   _s:_ a string to repeat
*   _n:_ the number of characters to consider

**Returns**

*   _int:_ the frequency of `a` in the substring

**Input Format**

The first line contains a single string, .  
The second line contains an integer, .

**Constraints**

1 <= |<em>s</em>| <= 100</br>
1 <= <em>n</em> <= 10<sup>12</sup></br>
For <em>25%</em> of the test cases, <em>n</em> <= 10<sup>6</sup>


**Sample Input**


**Sample Input 0**

    aba
    10


**Sample Output 0**

    7


**Explanation 0**  
The first letters of the infinite string are `abaabaabaa`. Because there are `a`'s, we return .

**Sample Input 1**

    a
    1000000000000


**Sample Output 1**

    1000000000000


**Explanation 1**  
Because all of the first <em>n</em>=1000000000000 letters of the infinite string are `a`, we return 1000000000000.