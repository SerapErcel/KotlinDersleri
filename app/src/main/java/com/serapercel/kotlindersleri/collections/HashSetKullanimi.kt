package com.serapercel.kotlindersleri.collections

/* ----- HASH SET -----
ArrayList ile ayni ozelliklere sahiptir.
HashSet'e veri aktarildiginda icerik karistilir.
Ayni veriden bir tane daha eklemez.
Mutable: uzerinde degisiklik yapilir.
setof: uzerinden sadece veri okunur
 */
fun main() {
    // Tanimlama
    val meyveler = HashSet<String>()

    // Veri Ekleme
    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)

    meyveler.add("Elma")
    println(meyveler)
    meyveler.add("Amasya Elmasi")
    println(meyveler)

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler) {
        println("Sonuc : $m")
    }

    for ((i, m) in meyveler.withIndex()) {
        println("$i. -> $m")
    }

    // Silme
    meyveler.remove("Elma")
    println(meyveler)
    meyveler.clear()
    println(meyveler)

}