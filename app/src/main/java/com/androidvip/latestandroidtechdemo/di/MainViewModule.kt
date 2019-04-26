package com.androidvip.latestandroidtechdemo.di

import com.androidvip.latestandroidtechdemo.network.DataRepository
import com.androidvip.latestandroidtechdemo.viewmodels.MainVIewLogicModel
import dagger.Module
import dagger.Provides

@Module
class MainViewModule {
    /*@Provides
    fun provideDatRepository() :DataRepository{
        return DataRepository()
    }*/

    @Provides
    fun provideMainViewLogic(): MainVIewLogicModel {
        return MainVIewLogicModel(DataRepository())
    }


}