package com.serapercel.kotlindersleri.nesne_tabanli.interface_kullanimi

/*  ----- INTERFACE -----

Birden fazla interface olabilir.
Kalitim gibi sonuna parantez () koyulmaz.
Taslak olusturmak seklinde dusunulebilir.
Interface'ler siniflara ozellik katar.
 */

fun main() {
    val a = ClassA()
    println(a.degisken)
    a.metod1()
    println(a.metod2())
}