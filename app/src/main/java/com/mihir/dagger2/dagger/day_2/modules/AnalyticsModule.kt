package com.mihir.dagger2.dagger.day_2.modules

import com.mihir.dagger2.day_2.component.AnalyticsService
import com.mihir.dagger2.day_2.component.Mixpanel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class AnalyticsModule {

    @AppScope
    @Binds
    abstract fun getMixpanelModule(mixpanel :Mixpanel) : AnalyticsService
}