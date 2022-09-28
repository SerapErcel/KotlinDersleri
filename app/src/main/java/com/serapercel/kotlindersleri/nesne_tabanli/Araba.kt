package com.serapercel.kotlindersleri.nesne_tabanli

//  ----- NESNE TABANLI PROGRAMLAMA -----

/*
    Nesneleri soyutlayarak yazilim projlerine yansitiriz.
    Birden çok kez kullanim icin nesneler soyutlanarak bilgisayar
    koduna donusturulur.

    Sinif (class), Nesne (object)
    Nesneler siniflarin somutlastirilmis halleridir.
    Nesnelerin durumu (state) ve davranis bicimleri (behaviour) vardir.
 */

data class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {

    //  Constructor - init: Siniftan nesne olusturuldugu anda calisir.
    init {
        println("Araba sinifindan nesne olusturuldu")
    }

    fun calistir() { //Side effect : yan etki
        calisiyorMu = true
        hiz = 5
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    //  Disardan deger aldigimiz parametreli fonksiyon
    fun hizlan(kacKm: Int) {
        hiz += kacKm
    }

    fun yavasla(kacKm: Int) {
        hiz -= kacKm
    }

    fun bilgiAl() {
        println("----------------")
        println("Renk : ${renk}")
        println("Hiz : ${hiz}")
        println("Calisiyor Mu? : ${calisiyorMu}")
    }
}