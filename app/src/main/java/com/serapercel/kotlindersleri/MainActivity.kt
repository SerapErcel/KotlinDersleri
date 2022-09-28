package com.serapercel.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.serapercel.kotlindersleri.nesne_tabanli.Araba

class MainActivity : AppCompatActivity() {
    var str: String? = null

    //  ----- LATEINIT -----
    /*  lateinit var : once tanimlama yap, sonra deger aktar
      var ile kullanilir, val ile kullanilmaz
      Global degisken olustururken degiskene hic bir deger vermeden olusturmak icindir.
     */
    lateinit var str1: String

    /*
        lateinit var sayi:Int
        primitive type: Int, Double, Boolean (String harici) etc.
        bunlar referans tip degildir. Dolayisiyle lateinit kullanilamaz
     */
    lateinit var araba: Araba


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}