package com.example.testrepositoryapp.repositories

import com.example.core.entities.UserResponse
//ako maknete ovo onda bude radilo, ali nemrete ništa
import com.example.ws.WsDataSource

//Ovdje puca kada pokušaš importat uopće išta iz modula
class UserRepository {
    //metoda putem koje bi se pozivale stvari iz web servisa
    fun getUserData(): List<UserResponse> {
        //marko ovdje nije potreban jer ovaj servis poteže sve, ali lagano se zamijeni
        //var userData = WsDataSource().loadUser("marko")
    }
}