package com.example.copy_instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btMainProfileEdit.setOnClickListener {
            val nextIntent = Intent(this, SecondActivity::class.java)
            startActivity(nextIntent)
        }
    }
}
