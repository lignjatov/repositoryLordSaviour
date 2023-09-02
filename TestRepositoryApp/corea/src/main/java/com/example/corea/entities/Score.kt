package com.example.corea.entities

import java.util.*

open class Score {
    open var levelId_fk : Int? = null;
    open var userId_fk: Int? = null;
    var score: Int? = null;
    var completionDate: Date = Date();
}