package com.mihir.dagger2

import android.app.Application
import com.mihir.dagger2.day_2.component.AppComponent
import com.mihir.dagger2.day_2.component.DaggerAppComponent
import com.mihir.dagger2.day_2.component.MainActivityComponent

class UserApplication() : Application() {

    public lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

       appComponent=DaggerAppComponent.builder().build()


    }
}