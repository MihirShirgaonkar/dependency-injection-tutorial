package com.mihir.dagger2.day_1.Modules

import com.mihir.dagger2.day_1.MessageQuilifier
import com.mihir.dagger2.day_1.enities.EmailService
import com.mihir.dagger2.day_1.enities.MessageService
import com.mihir.dagger2.day_1.enities.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MessageModule(private val count : Int) {


    @MessageQuilifier
    @Provides
    fun getMessageModule() : NotificationService {
        return MessageService(count)
    }

    @Named("email")
    @Provides
    fun getEmailModule(emailService: EmailService) : NotificationService {
        return emailService
    }


}