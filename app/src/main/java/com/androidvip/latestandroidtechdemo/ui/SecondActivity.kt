package com.androidvip.latestandroidtechdemo.ui

import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.*

import com.androidvip.latestandroidtechdemo.R
import com.androidvip.latestandroidtechdemo.models.CountryModel
import com.androidvip.latestandroidtechdemo.models.UserInfo
import com.androidvip.latestandroidtechdemo.network.DataRepository
import com.androidvip.latestandroidtechdemo.viewmodels.MainVIewLogicModel
import com.bumptech.glide.Glide
import dagger.android.support.DaggerAppCompatActivity
import java.lang.Exception
import java.util.ArrayList

class SecondActivity : AppCompatActivity() {

    lateinit var mainViewModel : MainVIewLogicModel
     lateinit var repository: DataRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_lay)
        repository= DataRepository()
        mainViewModel= MainVIewLogicModel(repository)
        showData()
        findViewById<Button>(R.id.button).setOnClickListener {
            mainViewModel.getUserDetailsInputs("61")
        }
        findViewById<ImageView>(R.id.imageView).setOnClickListener {
           startActivity(Intent(applicationContext,FirstActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
       // Log.i("Ff","F")
    }
    fun showData(){
        mainViewModel.getUserDetailsResponse().observe(this@SecondActivity, Observer {
            try {
                if (it != null && it.status.equals("1")) {
                    findViewById<TextView>(R.id.txt_name).text = it.userInfo.userFullname
                    findViewById<TextView>(R.id.txt_email).text = it.userInfo.userEmail
                    findViewById<TextView>(R.id.txt_address).text = it.userInfo.userAddress
                    Glide.with(applicationContext)
                            .load(it.userInfo.userImg)
                            .centerCrop()
                            .placeholder(R.mipmap.ic_launcher)
                            .into(findViewById(R.id.imageView))
                } else {
                    Toast.makeText(applicationContext, it!!.message, Toast.LENGTH_LONG).show()
                }
            }catch (e : Exception){
                e.message
            }
        })

    }

}
