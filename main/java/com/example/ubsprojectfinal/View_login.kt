package com.example.ubsprojectfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class View_login : AppCompatActivity() {
    lateinit var cadastro: TextView
    lateinit var Principalview: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        cadastro = findViewById(R.id.text_cadastro)
        Principalview = findViewById(R.id.btEntrar)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_login)
        getSupportActionBar()?.hide();

        Principalview.setOnClickListener {
            val view = Intent(this, PrincipalVIew::class.java)
            startActivity(view)

        }
        cadastro.setOnClickListener {
            setContentView(R.layout.activity_register_view)
        }
    }
}