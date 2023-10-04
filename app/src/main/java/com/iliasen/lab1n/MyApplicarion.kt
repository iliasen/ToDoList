package com.iliasen.lab1n
import android.app.Application
// import org.koin.android.ext.android.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
/*        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(myModule)) // здесь нужно указать имя вашего модуля
        }*/
    }
}


