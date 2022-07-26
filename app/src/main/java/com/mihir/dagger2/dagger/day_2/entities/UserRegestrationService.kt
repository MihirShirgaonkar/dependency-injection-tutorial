package com.mihir.dagger2.dagger.day_2.entities

import javax.inject.Inject
import javax.inject.Named

class UserRegestrationService @Inject constructor(
    @Named("message") val notificarionService2: NotificarionService2,
    val userDetailService: UserDetailService
) {

    fun registerUser(name: String,email : String,msg : String){
        userDetailService.saveUser(name,email)
        notificarionService2.send(msg)
    }
}