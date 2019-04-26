package com.androidvip.latestandroidtechdemo.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.androidvip.latestandroidtechdemo.models.CountryModel
import com.androidvip.latestandroidtechdemo.models.Details
import com.androidvip.latestandroidtechdemo.network.DataRepository
import javax.inject.Inject

class MainVIewLogicModel(var repository: DataRepository) : ViewModel() {

    companion object {
        var counytryList=MutableLiveData<ArrayList<CountryModel>>();
        var userinfo=MutableLiveData<Details>();

    }

    fun getCountryList() : LiveData<ArrayList<CountryModel>>{
        if(counytryList.value.isNullOrEmpty()) {
            repository.getCountry()
        }
        return counytryList
    }

    fun getUserDetailsResponse() : LiveData<Details>{
        return  userinfo
    }

    fun getUserDetailsInputs( user_id : String) =repository.getUserDet(user_id)

}