package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.retrofit

import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.models.ProductItem
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {


    @GET("products")
    suspend fun getProducts() : Response<List<ProductItem>>


}