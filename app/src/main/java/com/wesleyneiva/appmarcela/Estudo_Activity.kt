package com.wesleyneiva.appmarcela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.wesleyneiva.appmarcela.databinding.ActivityEstudoBinding


class Estudo_Activity : AppCompatActivity() {


    //private lateinit var binding: ActivityEstudoBinding
    // lateinit var botaoEstudoVoltar: Button
    private val binding by lazy {
        ActivityEstudoBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityEstudoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("Portugês", false),
            Todo("Treinamento de inglês por meia hora", false),
            Todo("Estudar Programação ", false),


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




        binding.btnEstudarVoltar.setOnClickListener {
            finish()
        }


        /*
                botaoEstudoVoltar = findViewById(R.id.btn_estudar_voltar)
                val bundle = intent.extras

                botaoEstudoVoltar.setOnClickListener {
                    finish()
                }*/
    }
}