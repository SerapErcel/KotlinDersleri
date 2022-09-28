package com.serapercel.kotlindersleri.nesne_tabanli

fun main() {
    //  -----NULLABLE-----
    /*
        Değişkeni ?  ile tanımlamalıyız.
        Tanimlandiktan sonra kullanilirken ? İşareti kullanılırsa null hatasindan
        kaynakli olabilecek cokmelerden korunur.
        Tanımlandıktan sonra kullanılırken !! Isareti kullanilirsa bu degiskenin
        null olabilecegini belirtmis oluruz.
     */
    var mesaj = "Merhaba"
    var str: String? = null
    //str = "Merhaba"

    /*  Yontem 1: Only safe -> ?
        Eger str null ise hata olusmaz. Hata olusmaz.
        Null degilse calismaya devam eder. Güvenlidir.
     */
    println("Yontem 1: ${str?.trim()}")

    /*  Yontem 2: Non-null assert -> !!
        Eger emin oldugunuz degisken ise kullanilabilir.
        Sorumluluk bizde. Hata alma ihtimali var.
     */
    //println("Yontem 2: ${str!!.trim()}")

    //  Yontem 3: Null kontrol
    if (str != null) {
        println("Yontem 3: ${str.trim()}")
    } else {
        println("str nulldur")
    }

    //  Yontem 4: let kontrol
    str?.let {
        println("Yontem 4 : ${str.trim()}")
    }


}