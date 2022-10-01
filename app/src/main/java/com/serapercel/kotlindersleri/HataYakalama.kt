package com.serapercel.kotlindersleri

/* ----- EXCEPTION HATA AYIKLAMA -----

try - catch derleme sirasinda olusabilecek hatalarda kullanilir.
Kotlin input - output islemleri icin kullanilir.
Yani veri alisveris islemlerinde kullanilir.
 */

fun main() {
    val x = 10
    val y = 0

    try {
        println("Sonuc : ${x/y}")
        println("Islem Bitti")
    }catch (e:java.lang.Exception){
        println("Ikinci Sayi Sifir Olamaz!")
    }

    /* Compile Error- Derleyici Hatasi
    Derleme oncesi yakalanan hatalar.
    Ornegin: karakter hatalari, syntax hatalari
     */
    val a =10
    //a = "asdf"
}