package com.androidvip.latestandroidtechdemo.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Details(

        @SerializedName("status")
        @Expose
        var status: String,
        @SerializedName("request_count")
        @Expose
        var requestCount: String,
        @SerializedName("message")
        @Expose
        var message: String,
        @SerializedName("user_info")
        @Expose
        var userInfo: UserInfo

)