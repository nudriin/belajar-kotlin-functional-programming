package com.nudriin

fun main(){
    // Member References
    fun count(valueA: Int, valueB
    : Int): Int {
        return valueA + valueB
    }
    val sum: (Int, Int) -> Int = ::count // reference menggunakan "::"
    val result = sum(2, 2)
    println(result)

    // FUNCTION REFERENCES
    fun isEvenNumber(number: Int) = number % 2 == 0
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber) // reference function

    println(evenNumbers)

    // PROPERTY REFERENCES
    var message = "Kotlin"
        println(::message.name)

}
