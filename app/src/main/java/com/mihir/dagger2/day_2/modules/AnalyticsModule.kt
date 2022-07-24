package com.mihir.dagger2.day_2.modules

import com.mihir.dagger2.day_2.component.AnalyticsService
import com.mihir.dagger2.day_2.component.Mixpanel
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AnalyticsModule {

    @AppScope
    @Binds
    abstract fun getMixpanelModule(mixpanel :Mixpanel) : AnalyticsService
}