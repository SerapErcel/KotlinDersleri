package com.serapercel.kotlindersleri.nesne_tabanli.composition

fun main() {
    val k1 = Kategoriler(1, "Dram")
    val k2 = Kategoriler(2, "Bilim Kurgu")

    val y1 = Yonetmenler(1, "Quentin Tarantino")
    val y2 = Yonetmenler(2, "Christopher Nolan")

    // Composition
    val f1 = Filimler(1, "Django", 2013, k1, y1)

    println("Film id: ${f1.film_id}")
    println("Film ad: ${f1.film_adi}")
    println("Film yil: ${f1.film_yil}")
    println("Film kategori: ${f1.kategori.kategori_ad}")
    println("Film yonetmen: ${f1.yonetmen.yonetmen_ad}")

}