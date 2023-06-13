package com.example.nitish

fun main() {
    var cars= arrayOf("BMW","Ford","Volvo","Thar")  //arrayOf is used to create an array
    println(cars.size)  //.size is used for find the length

    println(cars[2])  //array[index] is used to acces the array
    cars[3]="Maruti"  // modify the array

    for(car in cars){
        print(car+" ")
    }
println()
    if("Thar" in cars) {  // in operator is used for check element exist in array or not
        println("Thar exist in cars")
    }
    else
    {
        println("Thar doesn't exist in cars")
    }

}