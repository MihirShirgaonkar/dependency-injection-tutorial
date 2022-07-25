package com.mihir.dagger2.mvvm_n_retrofit.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Products")
data class ProductItem(
    val category: String,
    val description: String,

    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val image: String,
    val price: Double,

    val title: String
)