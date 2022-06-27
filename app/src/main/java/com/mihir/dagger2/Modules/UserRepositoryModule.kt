package com.mihir.dagger2.Modules

import com.mihir.dagger2.enities.FirebaseService
import com.mihir.dagger2.enities.SQLDatabase
import com.mihir.dagger2.enities.UserRepsitory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {


    @Binds
    abstract fun getUserRepository(sqlDatabase: SQLDatabase) : UserRepsitory


}