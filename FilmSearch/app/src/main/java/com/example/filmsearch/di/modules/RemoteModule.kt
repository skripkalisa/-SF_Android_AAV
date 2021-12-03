package com.example.filmsearch.di.modules

import com.example.filmsearch.BuildConfig
import com.example.filmsearch.data.ApiConstants
import com.example.filmsearch.data.TmdbApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
abstract class RemoteModule {
    @Binds
    @Singleton
    abstract fun provideOkHttpClient(okHttpClient : OkHttpClient): OkHttpClient


    @Binds
    @Singleton
    abstract fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit

    @Binds
    @Singleton
    abstract fun provideTmdbApi(retrofit: Retrofit): TmdbApi
}