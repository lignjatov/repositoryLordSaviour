package com.example.wsa

import com.example.corea.entities.UserResponse
import com.example.corea.DataSource

//ovdje možeš definirati što svaka od onih interface metoda treba raditi za određeni source
class WsDataSourcea : DataSource {
    override fun loadUser(username: String) : List<UserResponse> {
        return WsDataSourceCallera().loadUserData()
    }

}