package com.serapercel.kotlindersleri.nesne_tabanli.paket2

import com.serapercel.kotlindersleri.nesne_tabanli.paket1.A
//  * = hepsi

//class B {
class B : A(){

    fun metod(){

        //val a = A()
        println(publicDegisken)
        println(varsayilanDegisken)
        println(protectedDegisken)
    }
}