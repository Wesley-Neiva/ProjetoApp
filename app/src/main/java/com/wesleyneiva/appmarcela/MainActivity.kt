package com.wesleyneiva.appmarcela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnExercicios: Button
    lateinit var btnDevocional: Button
    lateinit var btnAgenda: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExercicios = findViewById(R.id.btn_exercicios)
        btnExercicios.setOnClickListener {
            val intent = Intent(
                this, Exercicois_Activity::class.java
            )
            startActivity(intent)

        }
        btnDevocional = findViewById(R.id.btn_devocional)
        btnDevocional.setOnClickListener {
            val intent = Intent(
                this, Devocional_Activity::class.java)
            startActivity(intent)

        }

        btnAgenda = findViewById(R.id.btn_agenda)
        btnAgenda.setOnClickListener {
            val intent = Intent(
                this, Agenda_activity::class.java
            )
            startActivity(intent)
        }



    }
}