package com.example.aravinth.samplemap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun viewSearch(v:View){
        val i= Intent(this,MapsActivity::class.java)
        startActivity(i)

    }

    fun searchMap(v: View){
        val i= Intent(this,Main2Activity::class.java)
        startActivity(i)

    }


}
