package com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.modules

import androidx.lifecycle.ViewModel
import com.mihir.dagger2.mvvm_n_retrofit.viewModels.ProductViewModel
import com.mihir.dagger2.mvvm_n_retrofit.viewModels.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

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