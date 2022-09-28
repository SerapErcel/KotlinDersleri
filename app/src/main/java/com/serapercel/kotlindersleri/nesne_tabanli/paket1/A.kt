package com.serapercel.kotlindersleri.nesne_tabanli.paket1

open class A {

    // public : Her yerden erisilebilir
    var varsayilanDegisken = 1
    public var publicDegisken = 2

    // private : Sadece sinif icinden erisilebilir
    private var privateDegisken = 3

    // protected : Kalitim yoluyla erisim izni verir
    protected var protectedDegisken = 4

}