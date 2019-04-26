package com.androidvip.latestandroidtechdemo.network


import android.util.Log
import com.androidvip.latestandroidtechdemo.models.CountryModel
import com.androidvip.latestandroidtechdemo.models.Details
import com.androidvip.latestandroidtechdemo.viewmodels.MainVIewLogicModel
import retrofit2.Call
import retrofit2.Callback
import java.util.ArrayList
import javax.inject.Inject

class DataRepository @Inject constructor() {

    fun getCountry() {
        try {
            RetrofitClient.apiService.getCountryList().enqueue(object : Callback<ArrayList<CountryModel>> {
                override fun onResponse(call: Call<ArrayList<CountryModel>>, response: retrofit2.Response<ArrayList<CountryModel>>) {
                    try {
                        Log.i("d","F")
                        MainVIewLogicModel.counytryList.postValue(response.body())
                    } catch (er: Exception) {
                        er.message
                    }}

                override fun onFailure(call: Call<ArrayList<CountryModel>>, t: Throwable) {
                    call.cancel()
                }
            })
        } catch (er: Exception) {
            er.message
        }

    }


    fun getUserDet(user :String) {
        try {
            RetrofitClient.apiService.getDetails(user).enqueue(object : Callback<Details> {
                override fun onResponse(call: Call<Details>, response: retrofit2.Response<Details>) {
                    try {
                        Log.i("d","F")
                        MainVIewLogicModel.userinfo.postValue(response.body())
                    } catch (er: Exception) {
                        er.message
                    }}

                override fun onFailure(call: Call<Details>, t: Throwable) {
                    call.cancel()
                }
            })
        } catch (er: Exception) {
            er.message
        }

    }
}