package mjl.problemsolving.hackerrank.easy.flippingbits

fun flippingBits(n: Long): Long {
    // Write your code here
    val bits = n.toString(2).padStart(32, '0')
    var flippedValue: Long = 0

    for(i in bits.indices) {
        if(bits[i] == '0') {
            var bitValue: Long = 1
            for(j in i until 31) {
                //Maximum of 31 times since initial value accounts for first bit
                bitValue *= 2
            }
            flippedValue+=bitValue
        }
    }

    return flippedValue
}