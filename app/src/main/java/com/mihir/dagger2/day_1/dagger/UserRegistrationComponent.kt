package com.mihir.dagger2.day_1.dagger

import com.mihir.dagger2.day_1.MainActivity
import com.mihir.dagger2.day_1.Modules.MessageModule
import com.mihir.dagger2.day_1.Modules.UserRepositoryModule
import dagger.Component


@Component(modules = [MessageModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}