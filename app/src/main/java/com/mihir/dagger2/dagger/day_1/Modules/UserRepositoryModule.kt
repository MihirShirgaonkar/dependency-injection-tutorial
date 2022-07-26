package com.mihir.dagger2.dagger.day_1.Modules

import com.mihir.dagger2.dagger.day_1.enities.SQLDatabase
import com.mihir.dagger2.dagger.day_1.enities.UserRepsitory
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {


    @Binds
    abstract fun getUserRepository(sqlDatabase: SQLDatabase) : UserRepsitory


}