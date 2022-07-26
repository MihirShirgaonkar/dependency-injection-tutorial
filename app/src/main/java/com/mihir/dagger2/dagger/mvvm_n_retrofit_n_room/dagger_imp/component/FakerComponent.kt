package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.component

import android.content.Context
import androidx.lifecycle.ViewModel
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.MvvmInpActivity
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.modules.DatabaseModule
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.modules.NetworkModule
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.modules.ViewModelModules
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class, ViewModelModules::class])
interface FakerComponent {

    fun inject(mvvmInpActivity: MvvmInpActivity)

    fun getMap() :Map<Class<*>,ViewModel>


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context) : FakerComponent
    }
}