package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Exercicois_Activity : AppCompatActivity() {

        lateinit var botaoExercicioVoltar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicois)

        botaoExercicioVoltar =findViewById(R.id.btn_exercicios_voltar)

        val bundle = intent.extras

        botaoExercicioVoltar.setOnClickListener {
            finish()
        }
    }
}