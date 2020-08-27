package com.example.designerpatterns

import android.app.Application
import android.content.Context

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        setContext(applicationContext)
    }

    companion object {
        private lateinit var CONTEXT: Context

        private fun setContext(context: Context) {
            synchronized(App::class.java) {
                if (!::CONTEXT.isInitialized) {
                    CONTEXT = context
                }
            }
        }

        fun getContext() = CONTEXT
    }
}