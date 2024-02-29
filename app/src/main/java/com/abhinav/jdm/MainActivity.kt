package com.abhinav.jdm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var titlename: String? = "JDM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent!=null){
            titlename=intent.getStringExtra("NAME")
        }

        title=titlename
    }
}