package com.abhinav.jdm

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var titlename: String? = "JDM"
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.Preferences_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.activity_main)

        titlename=sharedPreferences.getString("title","JDM")

        title=titlename
    }
}