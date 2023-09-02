package com.example.ws

import com.example.core.DataSource
import com.example.core.entities.UserResponse

class WsDataSource : DataSource {
    override fun loadUser(username: String) : List<UserResponse> {
        return WsDataSourceCaller().loadUserData()
    }

}