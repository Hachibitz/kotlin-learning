package br.com.learning.training

import java.util.*


fun main() {
    smallestDistancePair(intArrayOf(1,6,1), 3)
}

fun smallestDistancePair(nums: IntArray, k: Int): Int {
    Arrays.sort(nums)

    var left = 0
    var right = nums[nums.size-1]-nums[0]
    while(left < right) {
        val mid = (left+right)/2
        if(isSmallPairs(nums, k, mid)) right = mid else left = mid+1
    }

    println(left)
    return left
}

fun isSmallPairs(nums: IntArray, k: Int, mid: Int): Boolean {
    var count = 0
    var left = 0

    for (right in 1..< nums.size) {
        while((nums[right]-nums[left])>mid) left++
        count += right-left;
    }

    return count>=k
}