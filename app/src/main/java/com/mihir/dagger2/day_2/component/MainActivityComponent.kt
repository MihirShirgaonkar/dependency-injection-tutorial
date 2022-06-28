package com.mihir.dagger2.day_2.component

import com.mihir.dagger2.day_2.MainActivity2
import com.mihir.dagger2.day_2.modules.NotificationModule
import com.mihir.dagger2.day_2.modules.UserDetailModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationModule::class,UserDetailModule::class])
interface MainActivityComponent {


    fun inject(mainActivity2: MainActivity2)

    @Component.Factory
    interface Factory {

    fun create(@BindsInstance retryCount: Int): MainActivityComponent
}
}