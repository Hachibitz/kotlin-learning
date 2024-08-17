package br.com.learning.training

private val res = ArrayList<List<Int>>()
private val retrievedCandidates = ArrayList<Int>()

class CombinationSum2Challenge {

}

fun main() {
    combinationSum2(listOf(10,1,2,7,6,1,5).toIntArray(), 8)
}

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    candidates.forEach { retrievedCandidates.add(it) }
    retrievedCandidates.sort()

    backtrack(ArrayList<Int>(), 0, target)
    println(res)
    return res
}

private fun backtrack(cur: ArrayList<Int>, pos: Int, target: Int) {
    when {
        target == 0 -> res.add(ArrayList(cur))
        target <= 0 -> return
    }

    var previousExecutionValue: Int = -1
    for(i in pos..<retrievedCandidates.size) {
        if(retrievedCandidates[i] == previousExecutionValue) continue

        cur.add(retrievedCandidates[i])
        backtrack(cur, i+1, target-retrievedCandidates[i])
        cur.removeAt(cur.lastIndex)
        previousExecutionValue = retrievedCandidates[i]
    }
}