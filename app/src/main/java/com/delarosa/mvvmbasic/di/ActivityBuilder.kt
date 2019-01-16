package com.delarosa.mvvmbasic.di

import com.delarosa.mvvmbasic.view.TimeActivity
import com.delarosa.mvvmbasic.view.TimeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(TimeActivityModule::class)])
    abstract fun bindTimeActivity(): TimeActivity
}