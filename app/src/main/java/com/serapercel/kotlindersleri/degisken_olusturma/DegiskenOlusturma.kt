fun main() {
    //ilk etkilesim
    println("Hello World")

    /*  ---DEGISKENLER--
        Degiskenler hafizada gecici olarak saklanan degerleri temsil eder.
        Kotlin dilinde degisken tanımlamak için tür belirtmeye gerek yoktur.
        Degisken Belirteci + Degisken Adı + Atama Operatörü(=) + Degisken Degeri
     */
    var yas = 34
    var boy : Int = 160

    /*  ISIM VERME KURALLARI
    - Case sensitive
    - Rakamla Baslayamaz
    - @, $ ve % kullanılamaz
    - camelCase -> retVal
     */

    var ogrenciAdi = "Serap"
    var ogrenciYas = 22
    var ogrenciBoy = 1.62
    var ogrenciBasHarf = 'S'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamEdiyorMu)

    var urun_id:Int = 3416
    var urun_adi:String = "Kol Saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 49999.9
    var urun_tedarikci:String = "Rolex"


    //  println ile degisken yazdirma
    println("Urun id: $urun_id")
    println("Urun adi: $urun_adi")
    println("Urun adet: $urun_adet")
    println("Urun fiyat: $urun_fiyat ")
    println("Urun tedarikci: $urun_tedarikci")

    var a = 10
    var b = 20

    println("$a x $b : ${ a * b }")

    /*  SABITLER - CONSTANT - final/Swift: let
    Hafıza yönetimi adına avantajlıdır.Mümkünse val tercih edilir.
    */

    //  degistirilebilir - var
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)
    //  degistirilemez - val
    val numara = 30
    println(numara)
    //numara = 100 HATA

    /*  TYPE SAFETY - TUR GUVENLIGI
    Olusturdugunuz degiskene farkli turdeki degiskeni atayamazsiniz.
    Bu sebeple tur donusumleri gerceklestirilir.
     */

}