package com.mihir.dagger2.mvvm_n_retrofit.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mihir.dagger2.mvvm_n_retrofit.models.ProductItem
import com.mihir.dagger2.mvvm_n_retrofit.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI) {

    private val _products = MutableLiveData<List<ProductItem>>()

    val products : LiveData<List<ProductItem>>
    get() = _products

    suspend fun getProducts(){
        val result = fakerAPI.getProducts()
        if (result.isSuccessful && result.body()!=null){
            _products.postValue(result.body())
        }
    }


}