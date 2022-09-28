package com.serapercel.kotlindersleri.nesne_tabanli

fun main() {
    val f = Fonksiyonlar()
    f.selemla1()

    val gelenSonuc = f.selemla2()
    println("Gelen sonuc : $gelenSonuc")

    f.selamla3("Kasim")

    val gelenToplam = f.toplama(10, 20)
    println("Gelen toplam : $gelenToplam")

    f.carp(2, 4)
    f.carp(1, 3, "Serap")

    //val sonuc = 5.carpi(2)
    val sonuc = 5 carpi 2
    println("Gelen : $sonuc")
}

//  Extension function
//  this = bulundugu sinifi temsil eder, Swift-self
/*
    fun Int.carpi(sayi: Int): Int {
        return this * sayi
    }
 */
infix fun Int.carpi(sayi: Int): Int {
    return this * sayi
}