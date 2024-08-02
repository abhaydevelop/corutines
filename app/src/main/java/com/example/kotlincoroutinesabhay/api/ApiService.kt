package com.mindorks.retrofit.coroutines.data.api

import com.example.kotlincoroutinesabhay.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}