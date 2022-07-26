package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.viewModels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SampleViewModel @Inject constructor(private val randomize: Randomize) : ViewModel() {

    init {
        randomize.toDoAction()
    }
}