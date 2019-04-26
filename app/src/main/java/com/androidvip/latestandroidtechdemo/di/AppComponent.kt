package com.androidvip.latestandroidtechdemo.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules=arrayOf(AndroidInjectionModule::class,ActivitiesModule::class,FragmentModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application:LatestApplication): Builder

        fun build(): AppComponent
        //Test
    }

    fun inject (app:LatestApplication)
}