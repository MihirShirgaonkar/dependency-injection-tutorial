package com.mihir.dagger2.dagger.day_1.Modules

import com.mihir.dagger2.dagger.day_1.MessageQuilifier
import com.mihir.dagger2.dagger.day_1.component.UserRegistrationComponent
import com.mihir.dagger2.dagger.day_1.enities.EmailService
import com.mihir.dagger2.dagger.day_1.enities.MessageService
import com.mihir.dagger2.dagger.day_1.enities.NotificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class MessageModule() {


    @MessageQuilifier
    @Provides
    fun getMessageModule() : NotificationService {
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailModule(emailService: EmailService) : NotificationService {
        return emailService
    }


}