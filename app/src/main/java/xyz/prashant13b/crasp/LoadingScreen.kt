package xyz.prashant13b.crasp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LoadingScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var prefrence = this.getSharedPreferences("user",0)


        val intent = Intent(this,MainActivity::class.java)
        when(true){
           true->   startActivity(intent)
            else-> Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()

        }

    }
}
