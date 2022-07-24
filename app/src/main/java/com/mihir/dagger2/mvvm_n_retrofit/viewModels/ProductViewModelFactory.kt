package com.mihir.dagger2.mvvm_n_retrofit.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mihir.dagger2.mvvm_n_retrofit.repository.ProductRepository
import javax.inject.Inject

class ProductViewModelFactory @Inject constructor(private val repository: ProductRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductViewModel(repository) as T
    }
}