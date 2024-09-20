package com.nudriin

// Lambda expression, biasa disebut dengan anonymous function
// atau function literal

//Contohnya
val message :(String) -> String = { name: String ->
    "Hello $name"
}
val message2 = { println("Hello From Lambda") }

// Menambah parameter message
val printMessage = { message: String -> println(message) }

fun main() {
    val result = message("Nurdin")
    println(result)

    message2()

    printMessage("Hello my name is nudriin")
}