package com.serapercel.kotlindersleri.collections

fun main() {
    val u1 = Urunler(1, "PC", 18000)
    val u2 = Urunler(2, "TV", 7000)
    val u3 = Urunler(3, "Saat", 13000)

    val urunlerListesi = ArrayList<Urunler>()
    urunlerListesi.add(u1)
    urunlerListesi.add(u2)
    urunlerListesi.add(u3)

    for (urun in urunlerListesi) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

    // Siralama - Sorting

    println("Urun fiyati artan : ")
    val siralama1 = urunlerListesi.sortedWith(compareBy { it.fiyat }) // ASC
    for (urun in siralama1) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

    println("Urun fiyati azalan : ")
    val siralama2 = urunlerListesi.sortedWith(compareByDescending { it.fiyat }) //DESC
    for (urun in siralama2) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

    println("Urun adi artan : ")
    val siralama3 = urunlerListesi.sortedWith(compareBy { it.ad })
    for (urun in siralama3) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

    println("Urun adi azalan : ")
    val siralama4 = urunlerListesi.sortedWith(compareByDescending { it.ad })
    for (urun in siralama4) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

    // Filtreleme
    println("Filtreleme 1")
    val filtreleme1 = urunlerListesi.filter { it.ad.contains("T") }
    for (urun in filtreleme1) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

    println("Filtreleme 2")
    val filtreleme2 = urunlerListesi.filter { it.fiyat > 10000 && it.fiyat < 15000 }
    for (urun in filtreleme2) {
        println("Id : ${urun.id} - Ad : ${urun.ad} - Fiyat : ${urun.fiyat} ")
    }

}