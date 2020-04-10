package com.mbarros64.imdb.api

import com.mbarros64.imdb.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "bf6364260d432f315b13d934ef455aeb",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}