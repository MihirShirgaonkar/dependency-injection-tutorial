package com.mihir.dagger2.mvvm_n_retrofit.dagger_imp.modules

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mihir.dagger2.mvvm_n_retrofit.room.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {


    @Singleton
    @Provides
    fun getDatabaseModule(context: Context) : FakerDB{
        return Room.databaseBuilder(context,FakerDB::class.java,"fakerdb").build()
    }


}