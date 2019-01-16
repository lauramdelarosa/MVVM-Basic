package com.delarosa.mvvmbasic.view

import com.delarosa.mvvmbasic.model.TimeRepository
import com.delarosa.mvvmbasic.model.TimeRepositoryImpl
import dagger.Provides

class TimeActivityModule {
    @Provides
    fun providePersonRepository(): TimeRepository = TimeRepositoryImpl()
}