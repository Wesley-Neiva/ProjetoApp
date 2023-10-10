package com.wesleyneiva.appmarcela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAcessar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAcessar = findViewById(R.id.btn_exercicios)
        btnAcessar.setOnClickListener {
            val intent = Intent(
                this, Exercicois_Activity::class.java)
                startActivity(intent)

        }
    }
}