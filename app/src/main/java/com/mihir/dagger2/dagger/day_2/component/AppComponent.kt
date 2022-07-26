package com.mihir.dagger2.dagger.day_2.component

import com.mihir.dagger2.dagger.day_2.modules.AnalyticsModule
import com.mihir.dagger2.dagger.day_2.modules.AppScope
import dagger.Component


@AppScope
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getMainActivityComponent() : MainActivityComponent.Builder




}