package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Activity_idiomas : AppCompatActivity() {

    lateinit var botaoIdiomaVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idiomas)


        botaoIdiomaVoltar = findViewById(R.id.btn_voltar_idioma)
        val bundle = intent.extras

        botaoIdiomaVoltar.setOnClickListener {
            finish()
        }

    }
}