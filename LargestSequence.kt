fun largestSequence(list :List<Int>): List<Int>{
    var sum = list.sum()
    var sequence = list
    for(startIndex in list.indices){
        for(elemCount in 1 until (list.size-startIndex)) {
            val endIndex = startIndex + elemCount
            val tempList = list.slice(startIndex..endIndex)
            val tempSum = tempList.sum()
            if(tempSum >= sum){
                sum = tempSum
                sequence = tempList
            }
        }
    }
    return sequence
}

fun main() {
    println(largestSequence(listOf(1, 2, -4, 5, -2, 0, 4)))
}
