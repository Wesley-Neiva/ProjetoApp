package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager


class Estudo_Activity : AppCompatActivity() {

    lateinit var botaoEstudoVoltar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estudo)

        var todoList = mutableListOf(
            Todo("Português",false),
            Todo("Inglês",false),
            Todo("Matemática",false),
            Todo("Direito Administrativo",false)


        )
        val adapter = TodoAdapter(todoList)


        botaoEstudoVoltar = findViewById(R.id.btn_estudar_voltar)
        val bundle = intent.extras

        botaoEstudoVoltar.setOnClickListener {
            finish()
        }
    }
}