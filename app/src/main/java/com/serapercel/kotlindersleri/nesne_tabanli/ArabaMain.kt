package com.serapercel.kotlindersleri.nesne_tabanli

fun main() {

    //  Nesne Olusturma
    val bmw = Araba("Kirmizi", 0, false)

    //  Veri Okuma Islemi
    bmw.bilgiAl()
    /*
        println("Renk : ${bmw.renk}")
        println("Hiz : ${bmw.hiz}")
        println("Calisiyor Mu? : ${bmw.calisiyorMu}")
     */

    //  Veri Atama Islemi
    bmw.hiz = 10
    bmw.calisiyorMu = true
    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(55)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz", 100, true)
    /*
        println("Renk : ${sahin.renk}")
        println("Hiz : ${sahin.hiz}")
        println("Calisiyor Mu? : ${sahin.calisiyorMu}")
     */
    sahin.bilgiAl()


}