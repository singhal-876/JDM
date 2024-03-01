package com.abhinav.jdm

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var titlename: String? = "JDM"
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.Preferences_file_name), MODE_PRIVATE)
        setContentView(R.layout.activity_main)

        titlename=sharedPreferences.getString("title","JDM")
        title=titlename

        val logout=findViewById<Button>(R.id.logout_button)
        logout.setOnClickListener {
            Toast.makeText(this,"You have been logged out successfully",Toast.LENGTH_SHORT).show()
            val intent=Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}