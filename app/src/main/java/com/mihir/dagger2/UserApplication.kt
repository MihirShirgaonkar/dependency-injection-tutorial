package com.mihir.dagger2

import android.app.Application
import com.mihir.dagger2.day_2.component.AppComponent
import com.mihir.dagger2.day_2.component.DaggerAppComponent
import com.mihir.dagger2.day_2.component.MainActivityComponent
import com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.component.DaggerFakerComponent
import com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.component.FakerComponent

class UserApplication() : Application() {

    public lateinit var appComponent: AppComponent


    public lateinit var fakerComponent: FakerComponent


    override fun onCreate() {
        super.onCreate()

       appComponent=DaggerAppComponent.builder().build()

        fakerComponent =DaggerFakerComponent.factory().create(this)


    }
}