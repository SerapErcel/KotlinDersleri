package com.serapercel.kotlindersleri.nesne_tabanli.override_kullanimi

/*  ----- OVERRIDING -----
    Kalitimda ust sinifin metodlarini alt siniflarda tekrar kullanilir.
    Override edilecek metoda open kelimesi eklenir.
    Overloading ile overridin farki: Override kalitim gerektirir.

*/
open class Hayvan {
    open fun sesCikar() {
        println("Sesim Yok")
    }
}