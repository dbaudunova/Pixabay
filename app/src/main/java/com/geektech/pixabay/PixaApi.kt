package com.geektech.pixabay

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {

    @GET("/api/")
    fun getImage(
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 3,
        @Query("key") key: String = "34803719-e29c1e55c86c7989c5528df7f"
    ): Call<PixaModel>
}