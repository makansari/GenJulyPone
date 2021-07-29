package com.example.genjulypone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

      var result =  intent.extras?.getString("keyun")

        Toast.makeText(this, result,Toast.LENGTH_LONG).show()
        textViewSecondRes.setText(result)
    }
}