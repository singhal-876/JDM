package com.abhinav.jdm

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.Preferences_file_name), Context.MODE_PRIVATE)
        val isLoggedIn=sharedPreferences.getBoolean("isLoggedIn",false)
        setContentView(R.layout.activity_login)

        if (isLoggedIn){
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val login=findViewById<Button>(R.id.login_button)
        val validUserPN="0123456789"
        val validPassword=arrayOf("Supra","GTR","BMW","Mazda","Honda")

        login.setOnClickListener {
            val userpn=findViewById<EditText>(R.id.user_pn).text.toString()
            val userpass=findViewById<EditText>(R.id.user_pass).text.toString()
            val intent=Intent(this,MainActivity::class.java)
            val nameofJDM: String

            if(userpn==validUserPN){
                when (userpass) {
                    validPassword[0] -> {
                        nameofJDM="Supra"
                        savedPreferences(nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[1] -> {
                        nameofJDM="GTR"
                        savedPreferences(nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[2] -> {
                        nameofJDM="BMW"
                        savedPreferences(nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[3] -> {
                        nameofJDM="Mazda"
                        savedPreferences(nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[4] -> {
                        nameofJDM="Honda"
                        savedPreferences(nameofJDM)
                        startActivity(intent)
                    }
                }
            }
            else if (userpn.isEmpty() || userpass.isEmpty()) {
                Toast.makeText(this, "Please enter credentials", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Incorrect Credentials",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    private fun savedPreferences(title: String){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
        sharedPreferences.edit().putString("title", title).apply()
    }

}