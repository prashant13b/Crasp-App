package xyz.prashant13b.crasp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var prefrence = this.getSharedPreferences("user",0)

        val login = findViewById(R.id.login) as Button



        login.setOnClickListener{
            val username = findViewById(R.id.username) as EditText
            val password = findViewById(R.id.password) as EditText

            var value: String
            Toast.makeText(this,prefrence.getString("user",""),Toast.LENGTH_SHORT).show()

            value = if(username.text.toString() == "prashant13b" && password.text.toString()== "root")  "true" else "false"



            if(value == "true") {
                var editor = prefrence.edit()
                editor.putString("user","prashant13b")
                editor.apply()
            }


        }
    }
}
