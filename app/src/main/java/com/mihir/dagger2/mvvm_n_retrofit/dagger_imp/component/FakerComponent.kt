package com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.component

import android.content.Context
import com.mihir.dagger2.mvvm_n_retrofit.MvvmInpActivity
import com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.modules.DatabaseModule
import com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class,DatabaseModule::class])
interface FakerComponent {

    fun inject(mvvmInpActivity: MvvmInpActivity)


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context) : FakerComponent
    }
}