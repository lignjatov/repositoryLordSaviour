package com.example.core.entities

//ukoliko je tip 'skin', kolicina ne smije biti veca od 1
open class Inventory {
    open var itemId_fk : Int? = null;
    open var userId_fk: Int? = null;
    var quantity: Int? = null;
}