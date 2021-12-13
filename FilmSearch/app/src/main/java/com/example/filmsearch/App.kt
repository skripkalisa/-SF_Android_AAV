package com.example.filmsearch

import android.app.Application
import com.example.filmsearch.di.AppComponent
import com.example.filmsearch.di.DaggerAppComponent
import com.example.filmsearch.di.modules.DatabaseModule
import com.example.filmsearch.di.modules.DomainModule
import com.example.filmsearch.di.modules.RemoteModule

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.builder()
            .remoteModule(RemoteModule())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()

    }

    companion object {
        lateinit var instance: App
            private set
    }
}