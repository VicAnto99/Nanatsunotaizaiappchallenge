package edu.itesm.nanatsunotaizaiappchallenge

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val cien = 1000.toLong()
        val timer = object: CountDownTimer(6000, 1) {
            override fun onTick(millisUntilFinished: Long) {
                cuenta.text = (millisUntilFinished/cien).toString()
            }
            override fun onFinish() {
                cuenta.text = "Yokoso ようこそ :)"
            }
        }
        timer.start()
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 7000)
    }
}