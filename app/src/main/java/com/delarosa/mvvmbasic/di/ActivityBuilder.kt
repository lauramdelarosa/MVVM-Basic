package com.delarosa.mvvmbasic.di

import com.delarosa.mvvmbasic.view.TimeActivity
import com.delarosa.mvvmbasic.view.TimeActivityModule
import dagger.android.ContributesAndroidInjector

abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(TimeActivityModule::class)])
    abstract fun bindTimeActivity(): TimeActivity
}