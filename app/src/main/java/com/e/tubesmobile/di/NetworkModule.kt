package com.e.tubesmobile.di

import android.content.Context
import com.e.tubesmobile.networks.KomputerApi
import com.e.tubesmobile.networks.PeriferalApi
import com.e.tubesmobile.networks.SmarthphoneApi
import com.skydoves.sandwich.coroutines.CoroutinesResponseCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context:
                            Context
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(
                "https://ppm-api.gusdya.net/api/"
            )
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutinesResponseCallAdapterFactory())
            .build()
    }
    @Provides
    @Singleton
    fun provideKomputerApi(retrofit: Retrofit):
            KomputerApi {
        return retrofit.create(KomputerApi::class.java)
    }

    @Provides
    @Singleton
    fun providePeriferalApi(retrofit: Retrofit):
            PeriferalApi {
        return retrofit.create(PeriferalApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSmartphoneApi(retrofit: Retrofit):
            SmarthphoneApi {
        return retrofit.create(SmarthphoneApi::class.java)
    }
}