package com.serapercel.kotlindersleri.standart_programlama

fun main() {
    //  ----- KARSILASTIRMA OPERATORU -----
    val a = 40
    val b = 50

    val x = 90
    val y = 80

    println("a == b : ${a == b}")
    println("a != b : ${a != b}") // ! Tersleme islemidir
    println("a > b : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a < b : ${a < b}")
    println("a <= b : ${a <= b}")

    //  ----- MANTIKSAL OPERATORLER -----
    // OR (VEYA) false-false-> false, diger durumlarda true
    println("a > b || x > y : ${a > b || x > y}")
    // AND (VE) true-true-> true, diger durumlarda false
    println("a > b && x > y : ${a > b && x > y}")


}