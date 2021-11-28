package com.example.filmsearch

import android.app.Application
import com.example.filmsearch.di.AppComponent



class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.create()
    }


    companion object {
        lateinit var instance: App
            private set
    }
}




