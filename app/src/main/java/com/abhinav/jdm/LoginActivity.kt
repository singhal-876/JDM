package com.abhinav.jdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title="Login"

        val login=findViewById<Button>(R.id.login_button)

        login.setOnClickListener {
            val userpn=findViewById<EditText>(R.id.user_pn).text.toString()
            val userpass=findViewById<EditText>(R.id.user_pass).text.toString()
            if (userpn.isEmpty() || userpass.isEmpty()) {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Login Successfull",Toast.LENGTH_SHORT).show()
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}