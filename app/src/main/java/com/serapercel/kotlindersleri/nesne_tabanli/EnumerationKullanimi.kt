package com.serapercel.kotlindersleri.nesne_tabanli

fun main() {
    ucretHesapla(43, KonserveBoyut.ORTA)
}

fun ucretHesapla(adet: Int, boyut: KonserveBoyut) {
    when (boyut) {
        KonserveBoyut.KUCUK -> println("Ucret : ${30 * adet}")
        KonserveBoyut.ORTA -> println("Ucret : ${80 * adet}")
        KonserveBoyut.BUYUK -> println("Ucret : ${140 * adet}")
    }
}