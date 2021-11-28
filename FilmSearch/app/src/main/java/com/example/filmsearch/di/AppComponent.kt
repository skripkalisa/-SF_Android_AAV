package com.example.filmsearch.di

import com.example.filmsearch.di.modules.DatabaseModule
import com.example.filmsearch.di.modules.DomainModule
import com.example.filmsearch.di.modules.RemoteModule
import com.example.filmsearch.viewmodel.HomeFragmentViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {
    //метод для того, чтобы появилась внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
}