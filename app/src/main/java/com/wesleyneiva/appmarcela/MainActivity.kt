package com.wesleyneiva.appmarcela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnExercicios: Button
    lateinit var btnDevocional: Button
    lateinit var btnAgenda: Button
    lateinit var btnConsulta: Button
    lateinit var btnEstudar: Button
    lateinit var btnIdioamas: Button


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

        btnConsulta = findViewById(R.id.btn_consulta)
        btnConsulta.setOnClickListener {
            val intent = Intent(
                this, Consulta_Activity::class.java
            )
            startActivity(intent)
        }

        btnEstudar = findViewById(R.id.btn_estudar)
        btnEstudar.setOnClickListener {
            val intent = Intent(
                this, Estudo_Activity::class.java
            )
            startActivity(intent)
         }

        btnIdioamas = findViewById(R.id.btn_idioma)
        btnIdioamas.setOnClickListener {
            val intent = Intent(
                this, Activity_idiomas::class.java
            )
            startActivity(intent)
        }

    }
}