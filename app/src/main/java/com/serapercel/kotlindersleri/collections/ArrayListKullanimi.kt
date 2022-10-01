package com.serapercel.kotlindersleri.collections

/*  ----- ARRAYLIST -----
Ayni turde verileri tutar.
Index numaralari 0'dan baslar.
Diger dillerde: List, Array
 */

fun main() {
    // Tanimlama
    val meyveler = ArrayList<String>()

    // Veri Ekleme
    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    // Veri Guncelleme
    meyveler[0] = "Karpuz"
    println(meyveler)

    // Insert
    meyveler.add(1, "Portakal")
    println(meyveler)

    // Okuma
    println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut : ${meyveler.count()}")
    println("Boyut : ${meyveler.size}")
    println("Bos Kontrol : ${meyveler.isEmpty()}")
    println("Iceriyor Mu? : ${meyveler.contains("Cilek")}")

    // Ters Cevir
    meyveler.reverse()
    println(meyveler)

    // Alfabetik Sirala
    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler) { // For each
        println("Sonuc : $meyve")
    }

    for ((index, meyve) in meyveler.withIndex()) { // Swift -> enumerated()
        println("Sonuc : $index : $meyve")
    }

    // Belirli index verisini siler
    meyveler.removeAt(2)
    println(meyveler)

    // Tamamen Temizler
    meyveler.clear()
    println(meyveler)

}