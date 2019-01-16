package com.delarosa.mvvmbasic.view

import com.delarosa.mvvmbasic.model.TimeRepositoryImpl
import com.delarosa.mvvmbasic.viewModel.TimeViewModel
import dagger.Module
import dagger.Provides

@Module
class TimeActivityModule {
    @Provides
    fun provideTimeViewModel() = TimeViewModel(TimeRepositoryImpl())
}