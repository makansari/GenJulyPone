package com.example.genjulypone

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

            var i = IntentFilter("android.intent.action.AIRPLANE_MODE")
            var MAR = MyActionReceiver()
            registerReceiver(MAR,i)

        
        buttonStart.setOnClickListener {

            var i = Intent(this, MyService::class.java)
            startService(i)

        }

        buttonStop.setOnClickListener {
            var i = Intent(this, MyService::class.java)
            stopService(i)
        }

 /*     var result =  intent.extras?.getString("keyun")

        Toast.makeText(this, result,Toast.LENGTH_LONG).show()
        textViewSecondRes.setText(result)*/
    }
}