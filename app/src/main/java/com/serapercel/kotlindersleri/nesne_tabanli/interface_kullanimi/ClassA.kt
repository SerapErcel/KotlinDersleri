package com.serapercel.kotlindersleri.nesne_tabanli.interface_kullanimi

class ClassA : MyInterface {
    override val degisken: Int = 10


    override fun metod1() {
        println("Metod 1 calisti")
    }

    override fun metod2(): String {
        return "Metod 2 calisti"
    }
}