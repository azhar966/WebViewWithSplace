package com.zebdul.splacescreen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splaceScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splace_screen)

        Handler().postDelayed({ // call a handller to perform splace scren action
//            make an intent for jump animation to main activity
            var intent = Intent(this@splaceScreen, MainActivity::class.java)
            startActivity(intent)
            finish()  // use finish to prevent back button losses to come back on animation screen
        },1000)  //give time to animation
    }
}