package com.androidvip.latestandroidtechdemo.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class UserInfo(
@SerializedName("user_id")
@Expose
var userId: String? = null,
@SerializedName("user_email")
@Expose
var userEmail: String? = null,
@SerializedName("user_pwd")
@Expose
var userPwd: String? = null,
@SerializedName("user_fname")
@Expose
var userFname: String? = null,
@SerializedName("user_lname")
@Expose
var userLname: String? = null,
@SerializedName("user_fullname")
@Expose
var userFullname: String? = null,
@SerializedName("user_gender")
@Expose
var userGender: String? = null,
@SerializedName("user_mob")
@Expose
var userMob: String? = null,
@SerializedName("bank_details")
@Expose
var bankDetails: String? = null,
@SerializedName("wallet_id")
@Expose
var walletId: String? = null,
@SerializedName("wallet_balance")
@Expose
var walletBalance: String? = null,
@SerializedName("user_address")
@Expose
var userAddress: String? = null,
@SerializedName("postal_code")
@Expose
var postalCode: String? = null,
@SerializedName("user_city")
@Expose
var userCity: String? = null,
@SerializedName("user_state")
@Expose
var userState: String? = null,
@SerializedName("user_country")
@Expose
var userCountry: String? = null,
@SerializedName("city_name")
@Expose
var cityName: String? = null,
@SerializedName("state_name")
@Expose
var stateName: String? = null,
@SerializedName("country_name")
@Expose
var countryName: String? = null,
@SerializedName("user_type")
@Expose
var userType: String? = null,
@SerializedName("user_img")
@Expose
var userImg: String? = null,
@SerializedName("oauth_uid")
@Expose
var oauthUid: String? = null,
@SerializedName("oauth_provider")
@Expose
var oauthProvider: String? = null,
@SerializedName("work_experience")
@Expose
var workExperience: String? = null,
@SerializedName("exp_type_oftruck")
@Expose
var expTypeOftruck: String? = null,
@SerializedName("medical_status")
@Expose
var medicalStatus: String? = null,
@SerializedName("company_name")
@Expose
var companyName: String? = null,
@SerializedName("user_dob")
@Expose
var userDob: String? = null,
@SerializedName("mob_verified")
@Expose
var mobVerified: String? = null


)