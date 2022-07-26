package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.models.ProductItem

@Database(entities = [ProductItem::class], version = 1, exportSchema = false)
abstract class FakerDB : RoomDatabase() {

    abstract fun getProductsDao() : ProductsDao
}