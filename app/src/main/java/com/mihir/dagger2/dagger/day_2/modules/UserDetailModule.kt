package com.mihir.dagger2.dagger.day_2.modules

import com.mihir.dagger2.dagger.day_2.entities.SQLDatabase
import com.mihir.dagger2.dagger.day_2.entities.UserDetailService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class UserDetailModule {


    @Binds
    abstract fun getSQLModule(sqlDatabase: SQLDatabase) : UserDetailService


}