package com.mihir.dagger2.dagger.day_1.enities

import com.mihir.dagger2.dagger.day_1.MessageQuilifier
import javax.inject.Inject



class UserRegistrationService @Inject constructor(
    val user : UserRepsitory,
    /*@Named("email")*/ @MessageQuilifier val emailService: NotificationService
) {

    fun registerUserRepo(email: String,pass : String){
        user.registerUser(email,pass)
        emailService.send(email)
    }
}