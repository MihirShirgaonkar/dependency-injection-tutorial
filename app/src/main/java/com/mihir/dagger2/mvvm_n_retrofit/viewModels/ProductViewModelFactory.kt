package com.mihir.dagger2.mvvm_n_retrofit.viewModels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mihir.dagger2.mvvm_n_retrofit.repository.ProductRepository
import javax.inject.Inject

class ProductViewModelFactory @Inject constructor(private val map: Map<Class<*>, @JvmSuppressWildcards ViewModel>) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }
}



