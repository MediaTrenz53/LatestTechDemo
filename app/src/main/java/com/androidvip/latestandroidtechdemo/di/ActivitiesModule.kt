package com.androidvip.latestandroidtechdemo.di

import com.androidvip.latestandroidtechdemo.ui.FirstActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules =[MainViewModule::class])
    abstract fun bindFirstActivity() : FirstActivity
}