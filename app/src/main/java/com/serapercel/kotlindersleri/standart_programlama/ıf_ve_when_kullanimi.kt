package com.serapercel.kotlindersleri.standart_programlama

fun main() {
    //  ----- KOSUL YAPISI -----
    //  if - else if - else
    val yas = 17
    val isim = "Serap"

    if (yas >= 18) {
        println("Reşitsiniz")
    } else {
        println("Reşit değilsiniz!")
    }

    if (isim == "Serap") {
        println("Merhaba Ahmet")
    } else if (isim == "Mehmet") {
        println("Merhaba Mehmet")
    } else {
        println("Merhaba")
    }

    val kullaniciAdi = "Admin"
    val sifre = 12345

    if (kullaniciAdi == "Admin" && sifre == 12345) {
        println("Hoş Geldiniiz")
    } else {
        println("Hatali Giris")
    }

    //  when
    val gun = 3
    when (gun) {
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Carsamba")
        4 -> println("Persembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Boyle bir gun yok!")


    }
}