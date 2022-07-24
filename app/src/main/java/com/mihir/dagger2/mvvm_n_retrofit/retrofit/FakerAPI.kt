package com.mihir.dagger2.mvvm_n_retrofit.retrofit

import com.mihir.dagger2.mvvm_n_retrofit.models.ProductItem
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {


    @GET("products")
    suspend fun getProducts() : Response<List<ProductItem>>


}