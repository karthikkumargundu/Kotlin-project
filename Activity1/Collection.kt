package com.example.demo

fun main(args: Array<String>){
    var myArray = Array<Int>(5){0}

    for(element in myArray){
        println(element)
    }
}