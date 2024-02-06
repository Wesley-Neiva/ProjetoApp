package com.wesleyneiva.appmarcela.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wesleyneiva.appmarcela.R

class Devocional_Activity : AppCompatActivity() {


        lateinit var botaoVoltarDevocional: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devocional)

        botaoVoltarDevocional = findViewById(R.id.btn_devocional_voltar)

        val bundle = intent.extras

        botaoVoltarDevocional.setOnClickListener {
            finish()
        }


    }
}