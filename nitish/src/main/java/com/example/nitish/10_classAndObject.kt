package com.example.nitish
// class is a blueprint of Object
class Account {
    var acc_no:Int=0;
    var name:String=""
    var amount:Float=0.toFloat()

}

fun main(){
    var acc=Account()
    acc.acc_no=12345
    acc.amount=10000f
    acc.name="Mukesh"
    println(acc.name)
}

//Object is instance of class