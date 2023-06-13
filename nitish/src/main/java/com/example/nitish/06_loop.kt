package com.example.nitish

fun main() {

    // for loop increment
    for(i in 1..5) {
        println(i)
    }

    //for loop decrement
    for(i in 5 downTo 1) {
        println(i)
    }
    // while loop
    var i=1
    while(i<=5)
    {
        println(i)
        i++
    }

    //do while loop
    var j=5
    do{
        println(j)
        j--
    } while(j>=1)
}