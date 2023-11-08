package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Estudo_Activity : AppCompatActivity() {


    lateinit var botaoEstudoVoltar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estudo)



        botaoEstudoVoltar = findViewById(R.id.btn_estudar_voltar)
        val bundle = intent.extras

        botaoEstudoVoltar.setOnClickListener {
            finish()
        }
    }
}