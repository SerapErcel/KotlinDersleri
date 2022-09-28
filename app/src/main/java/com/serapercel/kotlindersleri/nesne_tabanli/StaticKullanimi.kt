package com.serapercel.kotlindersleri.nesne_tabanli

fun main() {
    /*
    val a = ASinifi() // Tek nesne
    println(a.x)
    a.metod()
    // ASinifi() = Sanal nesne (virtual object)

    println(ASinifi().x) // Birinci sanal nesne
    ASinifi().metod() // Ikinci sanal nesne
     */

    println(ASinifi.x)
    ASinifi.metod()
}