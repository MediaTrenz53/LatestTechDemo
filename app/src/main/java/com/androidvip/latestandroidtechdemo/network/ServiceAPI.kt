package com.androidvip.latestandroidtechdemo.network

import com.androidvip.latestandroidtechdemo.models.CountryModel
import com.androidvip.latestandroidtechdemo.models.Details
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceAPI {

    @GET(ApiURLs.COUNTRY_LIST_DRIVA)
    fun getCountryList() : Call<ArrayList<CountryModel>>

    @FormUrlEncoded
    @POST(ApiURLs.DEMO_API)
    fun getDetails(@Field("user_id") user_id : String) : Call<Details>

}