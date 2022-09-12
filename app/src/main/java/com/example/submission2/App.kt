package com.example.submission2

import android.app.Application
import com.example.submission2.core.di.*
import com.example.submission2.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(networkModule)
            modules(localModule(this@App))
            modules(dataSourceModule)
            modules(viewmodelModule)
            modules(repositoryModule)
            modules(useCaseModule)
        }
    }
}