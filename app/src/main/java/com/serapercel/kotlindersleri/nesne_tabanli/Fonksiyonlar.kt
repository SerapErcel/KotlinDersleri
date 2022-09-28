package com.serapercel.kotlindersleri.nesne_tabanli

class Fonksiyonlar {

    /*  ----- FONKSIYONLAR -----

    Belirli islemleri temsil eden yapilardir.
    Kullanma amacimiz tekrarlanan kod yapilarinin onune gecmektir.
    fun kelimesi tanimlanirlar.
    Kodun okunmasini kolaylastirir.
    Class icinde yer alan fonksiyonlara denir.
    Ozellikler gibi bulundugu Class veya Structure’dan nesne olusturulursa erisilebilir.
     */

    //  void : sadece islem yapar.
    fun selemla1() {
        val sonuc = "Merhaba Serap"
        println(sonuc)
    }

    //  return : Fonksiyonun kullanildigi yere veri transferi yapar.
    fun selemla2(): String {
        val sonuc = "Merhaba Serap"
        return (sonuc)
    }

    //  Parametre
    fun selamla3(isim: String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1: Int, sayi2: Int): Int {
        return sayi1 + sayi2
    }

    //  Overloading - Asiri Yukleme
    fun carp(sayi1: Int, sayi2: Int) {
        println("Carpma : ${sayi1 * sayi2}")
    }

    fun carp(sayi1: Int, sayi2: Int, isim: String) {
        println("Carpma : ${sayi1 * sayi2} - Islem yapan : $isim")
    }
}