package com.serapercel.kotlindersleri.nesne_tabanli.kalitim

//  ----- KALITIM (Inheritance) -----

/*
    Bir siniftan baska bir sinif turetmek icin kulllanilir.
    Siniflar icin gecerlidir. Super class open kelimesi ile tanımlanir.
    Bir sinifin tek kalitimi olabilir.
    Ust sinif: superClass
    alt sinif: subClass
 */

fun main() {
    val topkapiSarayi = Saray(5, 100)
    val bogazVilla = Villa(true, 30)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)
}