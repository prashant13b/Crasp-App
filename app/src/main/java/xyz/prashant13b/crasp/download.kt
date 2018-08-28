package xyz.prashant13b.crasp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit



class download : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_download)


        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build()

        GithubS

    }
}
