package com.serapercel.kotlindersleri.nesne_tabanli.composition

//  ----- COMPOSITION -----
// Baska siniflardan(class) olusmus nesneler bir sinifin degiskeni olabilir.

class Filimler(
    var film_id: Int,
    var film_adi: String,
    var film_yil: Int,
    // Composition
    var kategori: Kategoriler,
    var yonetmen: Yonetmenler
)