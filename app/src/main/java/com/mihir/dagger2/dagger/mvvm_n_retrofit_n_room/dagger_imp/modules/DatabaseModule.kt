package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.modules

import android.content.Context
import androidx.room.Room
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.room.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {


    @Singleton
    @Provides
    fun getDatabaseModule(context: Context) : FakerDB {
        return Room.databaseBuilder(context, FakerDB::class.java,"fakerdb").build()
    }


}