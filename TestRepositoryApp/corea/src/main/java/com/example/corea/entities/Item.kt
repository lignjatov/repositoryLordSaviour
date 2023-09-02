package com.example.corea.entities

open class Item {
    open var itemId: Int? = null;
    var name: String = "";
    var description : String = "";
    var price: Int? = null;
    var pictureName: String = "";
    open var typeId_fk: Int? = null;
}