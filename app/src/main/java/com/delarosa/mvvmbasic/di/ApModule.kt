package com.delarosa.mvvmbasic.di

import android.content.Context
import com.delarosa.mvvmbasic.MVVMAplication
import dagger.Provides
import javax.inject.Singleton

class AppModule {
    @Provides
    @Singleton
    fun provideApplicationContext(app: MVVMAplication): Context = app
}
