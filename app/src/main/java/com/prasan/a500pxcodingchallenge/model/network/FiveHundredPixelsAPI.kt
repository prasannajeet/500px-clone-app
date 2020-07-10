package com.prasan.a500pxcodingchallenge.model.network

import com.prasan.a500pxcodingchallenge.model.datamodel.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FiveHundredPixelsAPI {

    @GET("/v1/photos")
    suspend fun getPopularPhotos(
        @Query("apiKey") key: String,
        @Query("feature") popular: String
    ): Response<PhotoResponse>
}