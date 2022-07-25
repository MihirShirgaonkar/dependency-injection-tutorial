package com.mihir.dagger2.mvvm_n_retrofit.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mihir.dagger2.mvvm_n_retrofit.models.ProductItem


@Dao
interface ProductsDao {

    @Insert
    suspend fun insertProducts(pl : List<ProductItem>)

    @Query("SELECT * FROM Products")
    suspend fun getProducts() : List<ProductItem>
}