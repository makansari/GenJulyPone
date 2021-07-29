package com.example.genjulypone

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("mytag","Activity Created")

        buttonSubmit.setOnClickListener {


           /* var un = editTextUsername.text.toString()
              //Toast.makeText(this,"username is $un",Toast.LENGTH_LONG).show()
              textViewUsername.setText(un)

            var myIntent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("keyun", un)
            startActivity(myIntent)*/

            /*var i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8338888083"))
            startActivity(i)*/

            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://yahoo.com"))
            startActivity(i)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("mytag","Activity Started")

    }

    override fun onResume() {
        super.onResume()
        Log.w("mytag","Activity resume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag","Activity paused")

    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag","Activity stopped")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag","Activity destroyed")

    }
}