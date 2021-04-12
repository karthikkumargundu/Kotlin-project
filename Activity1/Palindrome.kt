package com.example.demo
import java.util.*
import kotlin.collections.ArrayList
//Function to check Palindrome Number
fun findPalindrome(number: Long): Boolean {
    var isPalindromeNumber = false
    var sum : Long= 0
    var tempNum = number

    while (tempNum > 0) {
        val r = tempNum % 10
        sum = sum * 10 + r
        tempNum /= 10
    }
    if (sum == number) {
        isPalindromeNumber = true
    }
    return isPalindromeNumber
}


//Main Function, Entry Point of Program
fun main(arg: Array<String>) {
    //Input Stream
    val sc = Scanner(System.`in`)

    //Input Start of Range
    print("Enter Start of Range  : ")
    val start: Long = sc.nextLong()

    //Input End of Range
    print("Enter End of Range  : ")
    val end: Long = sc.nextLong()

    //Declare Mutable List to hold Palindromes
    val list: MutableList<Long> = ArrayList()

    //iterate through loop start to end to find Palindrome in Range
    for (i in start..end) {
        if (findPalindrome(i)) {
            list.add(i)
        }
    }

    println("Palindrome Numbers from $start to $end  : $list")
}