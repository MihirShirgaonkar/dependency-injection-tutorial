package com.mihir.dagger2

import com.mihir.dagger2.enities.EmailService
import com.mihir.dagger2.enities.NotificationService
import com.mihir.dagger2.enities.UserRepsitory
import javax.inject.Inject



class UserRegistrationService @Inject constructor(
    val user : UserRepsitory,
    /*@Named("email")*/ @MessageQuilifier val emailService: NotificationService) {

    fun registerUserRepo(email: String,pass : String){
        user.registerUser(email,pass)
        emailService.send(email)
    }
}