package com.example.filmsearch.di.modules

import com.example.filmsearch.data.MainRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DatabaseModule {
    @Binds
    @Singleton
    abstract fun provideRepository(repository: MainRepository): MainRepository
}
