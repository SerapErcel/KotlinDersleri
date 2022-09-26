fun main() {
    /*  TUR DONUSUMU
        1. Sayisaldan sayisala donusum
        2. Sayisaldan metine donusum
        3. Metinden sayisala donusum
  .toDouble(), toFloat(), toLong(), toInt(), toShort(), toByte(), toChar(), toString()
   */

    //  1. Sayisaldan Sayisala Donusum
    val i = 42
    val d = 78.95
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //  2. Sayisaldan Metine Donusum
    val sonuc3 = i.toString() // "42"
    val sonuc4 = d.toString() // "78.95"
    println(sonuc3)
    println(sonuc4)

    //  3. Metinden Sayisala Donusum
    val yazi = "67.54"
    val sonuc5 = yazi.toDouble()
    println(sonuc5)
    val hataliYazi = "67.54l"
    val sonuc6 = hataliYazi.toDoubleOrNull()

    if (sonuc6 == null) {
        println("Donusum Hatasi Olustu")
    } else {
        println(sonuc6)
    }

    //  Kisa if yapisi
    sonuc6?.let {
        println(sonuc6)
    }


}