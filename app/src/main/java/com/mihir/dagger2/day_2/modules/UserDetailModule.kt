package com.mihir.dagger2.day_2.modules

import com.mihir.dagger2.day_2.entities.SQLDatabase
import com.mihir.dagger2.day_2.entities.UserDetailService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class UserDetailModule {


    @Binds
    abstract fun getSQLModule(sqlDatabase: SQLDatabase) :UserDetailService


}