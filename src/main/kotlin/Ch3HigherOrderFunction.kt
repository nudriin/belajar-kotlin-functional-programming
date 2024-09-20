package com.nudriin

fun main() {
    printResult(10 ,sum)
//     bisa juga seperti ini
    printResult(20, {data -> data + data + data })
}

// memanggil function sum sebagai parameter
fun printResult(nilai: Int, sum: (Int) -> Int) {
    val result = sum(nilai)
    println(result)
}

// memmbuat function sum yang nantinya akan digunakan sebagai parameter
var sum: (Int) -> Int = { nilai -> nilai + nilai }

// INLINE FUNCTION
inline fun printResultInline(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}