package com.abhinav.jdm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title="Login"

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
                        intent.putExtra("NAME",nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[1] -> {
                        nameofJDM="GTR"
                        intent.putExtra("NAME",nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[2] -> {
                        nameofJDM="BMW"
                        intent.putExtra("NAME",nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[3] -> {
                        nameofJDM="Mazda"
                        intent.putExtra("NAME",nameofJDM)
                        startActivity(intent)
                    }
                    validPassword[4] -> {
                        nameofJDM="Honda"
                        intent.putExtra("NAME",nameofJDM)
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
}