package com.mihir.dagger2.dagger.day_2.modules

import com.mihir.dagger2.dagger.day_2.entities.EmailService
import com.mihir.dagger2.dagger.day_2.entities.MessageService
import com.mihir.dagger2.dagger.day_2.entities.NotificarionService2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named
@InstallIn(ActivityComponent::class)
@Module
class NotificationModule() {


    @Named("message")
    @Provides
    fun getMessageModule(@Named("zxc") retryCount : Int,@Named("asd") retryCount2 : Int) : NotificarionService2 {
        return MessageService(retryCount,retryCount2)
    }

    @Named("email")
    @Provides
    fun getEmailModule() : NotificarionService2 {
        return EmailService()
    }


}