package com.wesleyneiva.appmarcela.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.wesleyneiva.appmarcela.R


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