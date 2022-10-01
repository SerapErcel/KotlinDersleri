package com.serapercel.kotlindersleri.collections

/*  ----- HASMAP -----

Swift : Dictionary
Key - value iliskisi kullanir
key ile verileri aliriz
mutable olmazsa map uzerinde degisiklik yapilamaz
 */

fun main() {

    // Tanimlama
    val iller = HashMap<Int, String>()

    // Veri Ekleme
    iller.put(16, "Bursa")
    iller[34] = "Istanbul"
    println(iller)

    // Veri Okuma
    println(iller[16])
    println(iller.get(34))

    // Guncelleme
    iller[16] = "Yeni Bursa"
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    // Okuma
    for ((anahtar, deger) in iller) {
        println("$anahtar -> $deger")
    }

    // Silme
    iller.remove(34)
    println(iller)
    iller.clear()
    println(iller)
}