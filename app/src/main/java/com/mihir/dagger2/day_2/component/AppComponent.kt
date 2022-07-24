package com.mihir.dagger2.day_2.component

import com.mihir.dagger2.day_1.component.UserRegistrationComponent
import com.mihir.dagger2.day_2.MainActivity2
import com.mihir.dagger2.day_2.modules.AnalyticsModule
import com.mihir.dagger2.day_2.modules.AppScope
import dagger.Component
import javax.inject.Singleton


@AppScope
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getMainActivityComponent() : MainActivityComponent.Builder




}