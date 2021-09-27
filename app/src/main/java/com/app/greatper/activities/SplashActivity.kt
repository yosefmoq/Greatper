package com.app.greatper.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.app.greatper.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        object:CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
                finish()
            }
        }.start()
    }
}