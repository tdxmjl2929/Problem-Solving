An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps, for every step it was noted if it was an _uphill_, , or a _downhill_, step. Hikes always start and end at sea level, and each step up or down represents a unit change in altitude. We define the following terms:

*   A _mountain_ is a sequence of consecutive steps _above_ sea level, starting with a step _up_ from sea level and ending with a step _down_ to sea level.
*   A _valley_ is a sequence of consecutive steps _below_ sea level, starting with a step _down_ from sea level and ending with a step _up_ to sea level.

Given the sequence of _up_ and _down_ steps during a hike, find and print the number of _valleys_ walked through.

**Example**

<em>steps</em> = 8 <em>path</em>= <em>[DDUUUUDD]</em>

The hiker first enters a valley units deep. Then they climb out and up onto a mountain units high. Finally, the hiker returns to sea level and ends the hike.

**Function Description**

Complete the _countingValleys_ function in the editor below.

countingValleys has the following parameter(s):

*   _int steps_: the number of steps on the hike
*   _string path_: a string describing the path

**Returns**

*   _int:_ the number of valleys traversed

**Input Format**

The first line contains an integer , the number of steps in the hike.  
The second line contains a single string , of characters that describe the path.

**Constraints**

2 <= <em>steps</em> <= 10<sup>6</sup>

<em>path[i]<em> is an element of {UD}

**Sample Input**


    8
    UDDDUDUU


**Sample Output**


    1


**Explanation**

If we represent `_` as sea level, a step up as `/`, and a step down as `\`, the hike can be drawn as:

    _/\      _
       \    /
        \/\/


The hiker enters and leaves one valley.