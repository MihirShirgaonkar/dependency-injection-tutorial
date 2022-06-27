package com.mihir.dagger2.Modules

import com.mihir.dagger2.MessageQuilifier
import com.mihir.dagger2.enities.EmailService
import com.mihir.dagger2.enities.MessageService
import com.mihir.dagger2.enities.NotificationService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MessageModule {


    @MessageQuilifier
    @Provides
    fun getMessageModule() : NotificationService{
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailModule(emailService: EmailService) : NotificationService {
        return emailService
    }


}