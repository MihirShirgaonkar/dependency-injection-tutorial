package com.mihir.dagger2.dagger

import com.mihir.dagger2.MainActivity
import com.mihir.dagger2.Modules.MessageModule
import com.mihir.dagger2.Modules.UserRepositoryModule
import dagger.Component


@Component(modules = [MessageModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}