package com.nudriin

// KODE TANPA DSL
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ") // kita perlu menuliskan ini berkali kali pada function
    stringBuilder.append("from ") // kita perlu menuliskan ini berkali kali pada function
    stringBuilder.append("lambda") // kita perlu menuliskan ini berkali kali pada function
    return stringBuilder.toString()
}

// KODE DENGAN DSL
fun buildStringDSL(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val strings = buildString()
//    Kita cukup panggil appendnya saja
    val stringsDSL = buildStringDSL {
        append("Hello ")
        append("From ")
        append("Nudriin")
    }

    println(strings)
    println(stringsDSL)
}

