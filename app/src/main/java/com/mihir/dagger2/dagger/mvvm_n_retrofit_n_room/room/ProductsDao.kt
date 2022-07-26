package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.models.ProductItem


@Dao
interface ProductsDao {

    @Insert( onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(pl : List<ProductItem>)

    @Query("SELECT * FROM Products")
    suspend fun getProducts() : List<ProductItem>
}