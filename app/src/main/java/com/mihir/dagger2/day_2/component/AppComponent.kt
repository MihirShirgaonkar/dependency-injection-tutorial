package com.mihir.dagger2.day_2.component

import com.mihir.dagger2.day_2.MainActivity2
import com.mihir.dagger2.day_2.modules.AnalyticsModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getAnalytics() : AnalyticsService




}