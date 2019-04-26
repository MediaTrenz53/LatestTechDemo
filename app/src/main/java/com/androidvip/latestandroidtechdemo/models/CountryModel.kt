package com.androidvip.latestandroidtechdemo.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CountryModel(
        @SerializedName("country_id")
        @Expose
        private var countryId: String,
        @SerializedName("country_name")
        @Expose
        private var countryName: String) {

    override fun toString(): String {
        return countryName
    }
}