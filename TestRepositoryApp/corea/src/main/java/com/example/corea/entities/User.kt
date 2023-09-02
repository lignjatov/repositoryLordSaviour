package com.example.corea.entities

open class User {
    open var userId: Int? = null;
    open var roleId_fk: Int? = null;
    var username: String = "";
    var shaPassword: String = "";
    var gems: Float? = null
    //add email!
}