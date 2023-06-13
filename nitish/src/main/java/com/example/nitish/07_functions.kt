package com.example.nitish

fun main() {
    sayHello() //calling function

    message("i'm busy rn")

    var ans=sum(2,8)
    println("sum of 2 and 8 is $ans")
}

fun sayHello() {  //no argument and no return type
    println("hello there!")
}
fun message(s:String){ // argument without return type
    println(s)
}
fun sum(a:Int, b:Int):Int{  // argument with return type
    return a+b
}

