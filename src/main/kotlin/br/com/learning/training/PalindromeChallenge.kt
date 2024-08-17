package br.com.learning.training

fun main() {

    println(isPalindrome("civic")) //true
    println(isPalindrome(" civIc")) //true
    println(isPalindrome("arara")) //true
    println(isPalindrome("araRa ")) //true
    println(isPalindrome("teste1")) //false
    println(isPalindrome("A man, a plan, a canal: Panama")) //true
    println(isPalindrome(""))
}

fun isPalindrome(str: String): Boolean {
    val adjustedStr = removeNonAlphaNumericChars(str).lowercase()
    if(adjustedStr.isEmpty()) return true

    val finalChar = adjustedStr.subSequence(adjustedStr.length-1, adjustedStr.length)
    val firstChar = adjustedStr.subSequence(0, 1)
    var result = finalChar.equals(firstChar)
    var inverseStr = ""

    if(result) inverseStr = getInverseString(adjustedStr)

    result = inverseStr.equals(adjustedStr)

    return result
}

fun getInverseString(str: String): String {
    return str.reversed()
}

fun removeNonAlphaNumericChars(str: String): String {
    return str.replace(Regex("[^a-zA-Z0-9]"), "") //remove non alpha numeric
}