package com.androidvip.latestandroidtechdemo.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Spinner

import com.androidvip.latestandroidtechdemo.R
import com.androidvip.latestandroidtechdemo.models.CountryModel
import com.androidvip.latestandroidtechdemo.network.DataRepository
import com.androidvip.latestandroidtechdemo.viewmodels.MainVIewLogicModel
import dagger.android.support.DaggerAppCompatActivity
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel : MainVIewLogicModel
    lateinit var repository: DataRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repository= DataRepository()
        mainViewModel= MainVIewLogicModel(repository)
        mainViewModel.getCountryList().observe(this@MainActivity, Observer {

            val model_truck_type = ArrayList<CountryModel>()
            model_truck_type.add(CountryModel("0", "Select Country"))
            if (it != null) {
                model_truck_type.addAll(it)
            }
            val casteAdapter = ArrayAdapter<CountryModel>(this@MainActivity,
                    android.R.layout.simple_list_item_1, model_truck_type)
            casteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            findViewById<Spinner>(R.id.spinner).setAdapter(casteAdapter)
        })

    }

}
