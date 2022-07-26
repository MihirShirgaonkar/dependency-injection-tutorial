package com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.dagger_imp.modules

import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.Utils.Constants
import com.mihir.dagger2.dagger.mvvm_n_retrofit_n_room.retrofit.FakerAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun getRetrofitModule() : Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build()
    }

    @Singleton
    @Provides
    fun providesFakerAPI(retrofit: Retrofit) : FakerAPI {
        return retrofit.create(FakerAPI::class.java)
    }


}