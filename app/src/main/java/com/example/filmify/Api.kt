package com.example.filmify

import com.example.filmify.modelData.SearchData
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("search?q=chicken")
    fun getFoods(): Call<SearchData>
}