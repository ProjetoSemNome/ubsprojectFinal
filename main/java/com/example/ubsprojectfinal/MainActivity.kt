package com.example.ubsprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity() {
    lateinit var bt_login: Button
    lateinit var bt_registrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide()

        bt_registrar.setOnClickListener {
            setContentView(R.layout.activity_register_view)
        }
    }

}