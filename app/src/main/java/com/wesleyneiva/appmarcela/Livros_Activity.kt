package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Livros_Activity : AppCompatActivity() {

    lateinit var botaoConsultaVoltar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livros)

        botaoConsultaVoltar = findViewById(R.id.btn_voltar_consulta)

        val bundle = intent.extras

        botaoConsultaVoltar.setOnClickListener {
            finish()
        }
    }
}