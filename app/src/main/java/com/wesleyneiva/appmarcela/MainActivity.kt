package com.wesleyneiva.appmarcela

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    lateinit var cvExercicios: CardView
    lateinit var cvDevocional: CardView
    lateinit var cvAgenda: CardView
    lateinit var cvEstudo: CardView
    lateinit var cvLivro: CardView
    lateinit var cvIdioamas: CardView



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cvExercicios = findViewById(R.id.cvExercicios)
        cvExercicios.setOnClickListener {
            val intent = Intent(
                this, Exercicois_Activity::class.java
            )
            startActivity(intent)

        }
        cvDevocional = findViewById(R.id.cvDevocional)
        cvDevocional.setOnClickListener {
            val intent = Intent(
                this, Devocional_Activity::class.java)
            startActivity(intent)

        }

       cvAgenda = findViewById(R.id.cvAgenda)
        cvAgenda.setOnClickListener {
            val intent = Intent(
                this, Agenda_activity::class.java
            )
            startActivity(intent)
        }

       cvEstudo = findViewById(R.id.cvEstudo)
        cvEstudo.setOnClickListener {
            val intent = Intent(
                this, Estudo_Activity::class.java
            )
            startActivity(intent)
        }

        cvLivro = findViewById(R.id.cvLivro)
        cvLivro.setOnClickListener {
            val intent = Intent(
                this, Livros_Activity::class.java
            )
            startActivity(intent)
         }

       cvIdioamas = findViewById(R.id.cvIdioma)
        cvIdioamas.setOnClickListener {
            val intent = Intent(
                this, Activity_idiomas::class.java
            )
            startActivity(intent)
        }

    }
}