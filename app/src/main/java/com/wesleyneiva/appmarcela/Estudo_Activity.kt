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
    lateinit var btnADDTodo: Button
    lateinit var cbBox: CheckBox
    lateinit var rvTodos: RecyclerView
    lateinit var etTodo: EditText


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

        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnADDTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }


        botaoEstudoVoltar = findViewById(R.id.btn_estudar_voltar)
        val bundle = intent.extras

        botaoEstudoVoltar.setOnClickListener {
            finish()
        }
    }
}