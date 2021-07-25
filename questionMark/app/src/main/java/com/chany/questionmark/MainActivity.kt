package com.chany.questionmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value : String? = null
        val value2 : String? ="A"

        Log.d("MainActivity", value2)

    }
}