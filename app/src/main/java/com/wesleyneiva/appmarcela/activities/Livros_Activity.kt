package com.wesleyneiva.appmarcela.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wesleyneiva.appmarcela.databinding.ActivityLivrosBinding

class Livros_Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLivrosBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarToolbar()


    }

    private fun inicializarToolbar() {
        val toolbar = binding.includeToolbarLivro.tbPrincipal
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Voltar"
            setDisplayHomeAsUpEnabled(true)
        }
    }
}