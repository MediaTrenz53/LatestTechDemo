package com.androidvip.latestandroidtechdemo.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.androidvip.latestandroidtechdemo.R

class ThirdActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_lay)

        findViewById<Button>(R.id.btn_first).setOnClickListener {
            startActivity(Intent(applicationContext,FirstActivity::class.java))
        }

        findViewById<Button>(R.id.btn_second).setOnClickListener {
            startActivity(Intent(applicationContext,SecondActivity::class.java))
        }
    }
}