package com.serapercel.kotlindersleri.nesne_tabanli.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() // Kalitimdan dolayi degildir, kendi metoduna eristi
    memeli.sesCikar() // Kalitim yoluyla ust sinifin metodunu calistirdi
    kedi.sesCikar() // Kalitim yoluyla ust sinifin metodunu override etti kendi metonudu calistirdi
    kopek.sesCikar() // Kalitim yoluyla ust sinifin metodunu override etti kendi metonudu calistirdi
}