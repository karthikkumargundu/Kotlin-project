package com.example.demo

import java.util.*

fun main(args: Array<String>) {
    // InputStream to get Input
    var reader = Scanner(System.`in`)

    //Input Integer Value
    println("Enter Year : ")
    var year = reader.nextInt();

    // checking leap year condition
    val isleap = if (year % 4 == 0){
        if (year % 100 == 0) {
            // Century Year must be divisible by 400 for Leap year
            year % 400 == 0
        } else true
    } else false;

    println("$year is ${if (isleap) "Leap Year" else "Not a Leap Year"} ")
}