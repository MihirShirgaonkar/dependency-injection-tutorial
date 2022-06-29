package com.mihir.dagger2.day_2.modules

import com.mihir.dagger2.day_2.entities.EmailService
import com.mihir.dagger2.day_2.entities.MessageService
import com.mihir.dagger2.day_2.entities.NotificarionService2
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationModule() {


    @Named("message")
    @Provides
    fun getMessageModule(retryCount : Int) : NotificarionService2{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailModule() : NotificarionService2{
        return EmailService()
    }


}