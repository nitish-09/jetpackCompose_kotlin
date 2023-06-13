package com.example.nitish


fun main() {
    val car=Car()
    println("Car color: &(car.color) model: &(car.model)")
    car.drive()

    var bike=Bike( "Red","Bullet")
    println("Bike color: &(bike.color) model: &(bike.model)")
    bike.drive()
}

class Car(color:String="Black",model:String="Xmdl") {   //Secondary constructor
    var color=color
    var model=model

    fun drive() {
        println("Vrooommmmmm.........Vroooommmmm")
    }
}


class Bike(var color:String,var model:String) {   // Primary constructor
    var colorr=color
    var modell=model

    fun drive() {
        println("Brooommmmmm.........Broooommmmm")
    }
}