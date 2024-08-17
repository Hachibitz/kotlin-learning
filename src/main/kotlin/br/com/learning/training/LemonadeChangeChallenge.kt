package br.com.learning.training

class LemonadeChangeChallenge {
    private var fives = 0
    private var tens = 0

    fun lemonadeChange(bills: IntArray): Boolean {
        bills.forEach {
            when {
                it == 5 -> fives++
                it == 10 -> {
                    fives--
                    tens++
                }
                tens > 0 -> {
                    tens--
                    fives--
                }
                else -> fives -= 3
            }

            if (fives < 0) return false
        }
        return true
    }
}

fun main() {
    val lChallenge = LemonadeChangeChallenge()
    print(lChallenge.lemonadeChange(intArrayOf(5,5,5,10,20)))
}