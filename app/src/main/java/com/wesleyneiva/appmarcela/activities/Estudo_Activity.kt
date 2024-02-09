package com.wesleyneiva.appmarcela.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.wesleyneiva.appmarcela.adapter.TodoAdapter
import com.wesleyneiva.appmarcela.databinding.ActivityEstudoBinding
import com.wesleyneiva.appmarcela.model.Todo


class Estudo_Activity : AppCompatActivity() {


    private val binding by lazy {
        ActivityEstudoBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarToolbar()

        var todoList = mutableListOf(
            Todo("Portugês", false),
            Todo("Treinamento de inglês", false),



            )
        val adapter = TodoAdapter(todoList)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)



        binding.btnAddTodo.setOnClickListener {
            val title = binding.etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
            binding.etTodo.setText("") //limpar a tela ao digitar um número

        }


    }

    private fun inicializarToolbar() {
        val toolbar = binding.includeToolbarEstudos.tbPrincipal
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Voltar"
            setDisplayHomeAsUpEnabled(true)
        }

    }
}