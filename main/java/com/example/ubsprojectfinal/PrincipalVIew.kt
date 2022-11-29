package com.example.ubsprojectfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PrincipalVIew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_view)

        getSupportActionBar()?.hide();
    }
}