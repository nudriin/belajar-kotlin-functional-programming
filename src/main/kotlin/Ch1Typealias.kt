package com.nudriin


//    Membuat function sebagai Tipedata
    typealias Sayhello = (name: String) -> String
fun main() {
    val sayHello: Sayhello = { name -> "Hello $name my name is nudriin"}
//    Menggunakan functionnya
    val result = sayHello.invoke("Elon")
    val result2 = sayHello("Mark")
    println(result)
    println(result2)
}