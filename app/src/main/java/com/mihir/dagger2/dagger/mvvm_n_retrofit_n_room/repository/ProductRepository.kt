package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.models.ProductItem
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.retrofit.FakerAPI
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.room.FakerDB
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI, private val fakerDB: FakerDB) {

    private val _products = MutableLiveData<List<ProductItem>>()

    val products : LiveData<List<ProductItem>>
    get() = _products

    suspend fun getProducts(){
        val result = fakerAPI.getProducts()
        if (result.isSuccessful && result.body()!=null){
            fakerDB.getProductsDao().insertProducts(result.body()!!)
            _products.postValue(result.body())

        }
    }


}