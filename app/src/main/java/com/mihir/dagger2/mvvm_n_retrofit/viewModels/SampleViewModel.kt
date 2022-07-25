package com.mihir.dagger2.mvvm_n_retrofit.viewModels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SampleViewModel @Inject constructor(private val randomize: Randomize) : ViewModel() {

    init {
        randomize.toDoAction()
    }
}