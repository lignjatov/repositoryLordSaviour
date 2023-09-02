package com.example.core.entities

open class Level {
    open var levelId : Int? = null;
    open var userId_fk: Int? = null;
    open var planetId_fk: Int? = null;
    var name: String = "";
    var levelSettings: String = "";
}