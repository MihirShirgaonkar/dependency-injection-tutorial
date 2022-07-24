package com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.component

import com.mihir.dagger2.mvvm_n_retrofit.MvvmInpActivity
import com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface FakerComponent {

    fun inject(mvvmInpActivity: MvvmInpActivity)
}