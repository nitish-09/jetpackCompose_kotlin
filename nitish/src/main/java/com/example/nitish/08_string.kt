package com.example.nitish

fun main() {
    var s1:String="Hello kotlin"
    var s2:String="Welcome to Kotlin"

    println(s1[0])  ///elements in string are accessed by indexing operation string[index]

    println(s2.length)  //.length is used for size of the string

    println(s1 + " "+s2)  // '+' operator is used for concatenation

    println(s1.get(7))   // it returns the character at given index

    println(s2.subSequence(3,11))  //it returns the new character sequence


}