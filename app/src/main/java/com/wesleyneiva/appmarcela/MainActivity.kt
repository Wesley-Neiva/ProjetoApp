package com.wesleyneiva.appmarcela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnExercicios: Button
    //lateinit var btnDevocional: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExercicios = findViewById(R.id.btn_exercicios)
        btnExercicios.setOnClickListener {
            val intent = Intent(
                this, Exercicois_Activity::class.java
            )


        }
        /*btnDevocional = findViewById(R.id.btn_devocional)
        btnDevocional.setOnClickListener {
            val intent1 = Intent(
                this, Devocional_Activity::class.java)

        }*/

        startActivity(intent)


    }
}