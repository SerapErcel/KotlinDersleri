package com.serapercel.kotlindersleri.standart_programlama

fun main() {
    //  ----- DONGULER -----
    //  Donguler belirli kodlari tekrarli calistirma amacli yapilardir.

    //  Foreach

    for (i in 1..3) {
        println("Dongu 1: $i")
    }

    //  10 ile 20 arasinda 5 er artsin
    for (a in 10..20 step 5) {
        println("Dongu 2: $a")
    }

    //  20 ile 10 arasinda
    for (b in 20 downTo 10) {
        println("Dongu 3: $b")
    }

    //  20 ile 10 arasinda 5 er azalsin
    for (b in 20 downTo 10 step 5) {
        println("Dongu 4: $b")
    }

    //  While
    var sayac = 1
     while (sayac < 6){
         println("Dongu 5: $sayac")
         sayac++
     }

    //  Break: Islemi bitirir
    for (i in 1..5){
        if(i==3){
            break
        }
        println("Dongu 6: $i")
    }

    //  Continue: Islemi pas gecer
    for (i in 1..5){
        if(i==3){
            continue
        }
        println("Dongu 7: $i")
    }
}