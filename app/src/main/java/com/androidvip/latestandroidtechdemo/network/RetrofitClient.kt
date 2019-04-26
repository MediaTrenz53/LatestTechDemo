package com.androidvip.latestandroidtechdemo.network

/**
 * Created by Sahil Kamboj (sahilkamboj9595@gmail.com)
 * in "DrivaPartner" Project
 * on 05/09/18 4:59 PM.
 */

import java.util.concurrent.TimeUnit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private  var retrofit: Retrofit? =null

    val apiService: ServiceAPI
        get() = getClient(ApiURLs.MAIN_URL)!!.create(ServiceAPI::class.java)

    fun getClient(baseUrl: String): Retrofit? {
        if (retrofit == null) {
            val okHttpClient = OkHttpClient.Builder()
                    .connectTimeout(5, TimeUnit.MINUTES)
                    .readTimeout(5, TimeUnit.MINUTES)
                    .build()

            retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }
}
