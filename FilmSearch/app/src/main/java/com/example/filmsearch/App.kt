package com.example.filmsearch

import com.example.filmsearch.di.AppComponent
import com.example.filmsearch.di.DaggerAppComponent

class App : TestStorage() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.create()

        // Testing storage. Safe to delete
        testStorage()
    }


    companion object {
        lateinit var instance: App
            private set
    }
}