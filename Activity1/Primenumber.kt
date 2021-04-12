package com.example.demo

import java.util.*

fun main(args: Array<String>)
{

    var n : Int
    var sc = Scanner(System.`in`)

    print("Enter a number")
    n = sc.nextInt()

    for (i in 2..n)
    {
        var a = 1
        var b = 2
        while (b < i)
            {
                if (i % b == 0)
                    {
                        a = 0
                        break
                     }
                 b++
             }
        if (a == 1)
            {
                 println("Prime Number:$i")
            }
    }
}