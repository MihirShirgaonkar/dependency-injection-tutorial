package com.mihir.dagger2.mvvm_n_retrofit.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mihir.dagger2.mvvm_n_retrofit.models.ProductItem

@Database(entities = [ProductItem::class], version = 1, exportSchema = false)
abstract class FakerDB : RoomDatabase() {

    abstract fun getProductsDao() : ProductsDao
}