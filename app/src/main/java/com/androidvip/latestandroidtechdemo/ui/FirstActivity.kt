package com.androidvip.latestandroidtechdemo.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

import com.androidvip.latestandroidtechdemo.R
import com.androidvip.latestandroidtechdemo.models.CountryModel
import com.androidvip.latestandroidtechdemo.models.UserInfo
import com.androidvip.latestandroidtechdemo.network.DataRepository
import com.androidvip.latestandroidtechdemo.viewmodels.MainVIewLogicModel
import dagger.android.support.DaggerAppCompatActivity
import java.lang.Exception
import java.util.ArrayList
import javax.inject.Inject

class FirstActivity : DaggerAppCompatActivity() {
      @Inject
      lateinit var mainViewModel : MainVIewLogicModel
    //lateinit var mainViewModel : MainVIewLogicModel
     //lateinit var repository: DataRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_lay)
        //repository= DataRepository()
       /// mainViewModel= MainVIewLogicModel(repository)
        mainViewModel.getUserDetailsInputs("1")
        showData()


    }
    fun showData(){
        mainViewModel.getUserDetailsResponse().observe(this@FirstActivity, Observer {
            try {
                if (it != null && it.status.equals("1")) {
                    findViewById<TextView>(R.id.txt_name).text = it.userInfo.userFullname
                    findViewById<TextView>(R.id.txt_email).text = it.userInfo.userEmail
                    findViewById<TextView>(R.id.txt_address).text = it.userInfo.userAddress
                } else {
                    Toast.makeText(applicationContext, it!!.message, Toast.LENGTH_LONG).show()
                }
            }catch (e : Exception){
                e.message
            }
        })

    }

}
