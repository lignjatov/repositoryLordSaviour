package com.example.ws

import android.util.Log
import com.example.core.entities.UserResponse
import retrofit.*
import ws.MyWebservice

class WsDataSourceCaller {
    val BASE_URL = "http://cortex.foi.hr/game-bot/api/v1/"
    lateinit var retrofit : Retrofit
    fun getInstance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun loadUserData(): List<UserResponse>{
        lateinit var userData: List<UserResponse>
        val retrofitInstance = getInstance()
        val retro = retrofitInstance.create(MyWebservice::class.java)
        val userCaller = retro.getUserCaller()
        userCaller.enqueue(object : Callback<List<UserResponse>> {
            override fun onResponse(response: Response<List<UserResponse>>?, retrofit: Retrofit?) {
                userData = response!!.body()
            }

            override fun onFailure(t: Throwable?) {
                Log.d("ERROR IN WS:","Failure getting data")
            }
        })
        return userData
    }
}