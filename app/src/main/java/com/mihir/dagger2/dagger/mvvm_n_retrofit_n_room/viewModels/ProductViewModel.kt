package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.models.ProductItem
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductViewModel @Inject constructor(private val repository: ProductRepository, private val randomize: Randomize) : ViewModel() {

    val productsList : LiveData<List<ProductItem>> = repository.products

    init {

        viewModelScope.launch{
        repository.getProducts()

        }
    }




    }
public class Randomize @Inject constructor() {

    fun toDoAction() {
        Log.d("MyTag", "toDoAction: ")
    }
}
