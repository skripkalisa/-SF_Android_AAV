package com.example.filmsearch.di.modules

import com.example.filmsearch.data.MainRepository
import com.example.filmsearch.data.TmdbApi
import com.example.filmsearch.domain.Interactor
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DomainModule {
    @Singleton
    @Binds
    abstract fun provideInteractor(repository: MainRepository) :Interactor
//    abstract fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi) = Interactor(repo = repository, retrofitService = tmdbApi)
}