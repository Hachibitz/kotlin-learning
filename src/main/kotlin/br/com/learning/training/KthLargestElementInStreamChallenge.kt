package br.com.learning.training

import java.util.*

class KthLargestElementInStreamChallenge {

}

class KthLargest(k: Int, nums: IntArray) {

    private val minHeap = PriorityQueue<Int>()
    private val kSize = k;

    init {
        nums.forEach { minHeap.add(it) }
        updateMinHeap()
    }

    fun add(`val`: Int): Int {
        minHeap.add(`val`)
        updateMinHeap()

        return minHeap.peek()
    }

    private fun updateMinHeap() {
        while (minHeap.size > kSize) {
            minHeap.poll()
        }
    }
}