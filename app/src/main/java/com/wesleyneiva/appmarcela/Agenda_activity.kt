package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Agenda_activity : AppCompatActivity() {

    lateinit var botaoAgendaVoltar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        botaoAgendaVoltar = findViewById(R.id.btn_agenda_voltar)

        val bundle = intent.extras

        botaoAgendaVoltar.setOnClickListener {
            finish()
        }
    }
}