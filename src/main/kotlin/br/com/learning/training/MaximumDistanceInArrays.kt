package br.com.learning.training

import kotlin.math.abs

class MaximumDistanceInArrays {
    fun maxDistance(arrays: List<List<Int>>): Int {
        var minVal = arrays[0][0]
        var maxVal = arrays[0][arrays[0].lastIndex]
        var maxDistance = 0

        for (i in 1..<arrays.size) {
            val currentArray = arrays[i]
            val curMin = currentArray[0]
            val curMax = currentArray[currentArray.lastIndex]

            maxDistance = maxOf(maxDistance, abs(curMax - minVal), abs(maxVal - curMin))

            minVal = minOf(minVal, curMin)
            maxVal = maxOf(maxVal, curMax)
        }

        return maxDistance
    }
}

fun main() {
    val maximumDistanceInArrays = MaximumDistanceInArrays()
    val input: List<List<Int>> = listOf(
        listOf(1, 4),
        listOf(0, 5)
    )
    println(maximumDistanceInArrays.maxDistance(input))
}