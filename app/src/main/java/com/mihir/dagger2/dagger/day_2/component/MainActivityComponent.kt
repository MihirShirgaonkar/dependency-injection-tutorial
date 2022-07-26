package com.mihir.dagger2.dagger.day_2.component

import com.mihir.dagger2.dagger.day_2.MainActivity2
import com.mihir.dagger2.dagger.day_2.modules.NotificationModule
import com.mihir.dagger2.dagger.day_2.modules.UserDetailModule
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Subcomponent( modules = [NotificationModule::class, UserDetailModule::class])
interface MainActivityComponent {


    fun inject(mainActivity2: MainActivity2)

    @Subcomponent.Builder
    interface Builder {

        fun build() : MainActivityComponent

        fun retrycount1(@BindsInstance @Named("zxc") retryCount: Int) : Builder
        fun retrycount2(@BindsInstance @Named("asd") retryCount: Int) : Builder

}
}