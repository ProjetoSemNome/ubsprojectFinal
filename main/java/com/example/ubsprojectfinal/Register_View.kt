package com.example.ubsprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class Register_View : AppCompatActivity() {
    lateinit var login:TextView
    lateinit var Cadastrar: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_view)
        getSupportActionBar()?.hide();

        login = findViewById(R.id.text_login)
        Cadastrar = findViewById(R.id.button)

    }

}