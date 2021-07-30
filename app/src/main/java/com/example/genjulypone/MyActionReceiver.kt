package com.example.genjulypone

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context,"PHONE AIRPLANE", Toast.LENGTH_LONG).show()


    }

}