package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.modules

import androidx.lifecycle.ViewModel
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.viewModels.ProductViewModel
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.viewModels.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
@InstallIn(SingletonComponent::class)
@Module
abstract class ViewModelModules {

    @Binds
    @ClassKey(ProductViewModel::class)
    @IntoMap
    abstract fun getProductViewModel(productViewModel: ProductViewModel) : ViewModel

    @Binds
    @ClassKey(SampleViewModel::class)
    @IntoMap
    abstract fun getSampleViewModel(samp: SampleViewModel) : ViewModel

}