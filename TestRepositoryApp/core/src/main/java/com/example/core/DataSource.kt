package com.example.core

import com.example.core.entities.UserResponse

interface DataSource {
    fun loadUser(username : String) : List<UserResponse>
}