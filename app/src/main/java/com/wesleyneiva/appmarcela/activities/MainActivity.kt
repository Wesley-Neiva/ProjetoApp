package com.wesleyneiva.appmarcela.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wesleyneiva.appmarcela.R
import com.wesleyneiva.appmarcela.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.cvExercicios.setOnClickListener {
            val intent = Intent(
                this, Exercicois_Activity::class.java
            )
            startActivity(intent)

        }

        binding.cvDevocional.setOnClickListener {
            val intent = Intent(
                this, Devocional_Activity::class.java
            )
            startActivity(intent)


        }


        binding.cvAgenda.setOnClickListener {
            val intent = Intent(
                this, Agenda_activity::class.java
            )
            startActivity(intent)
        }


        binding.cvEstudo.setOnClickListener {
            val intent = Intent(
                this, Estudo_Activity::class.java
            )
            startActivity(intent)
        }


        binding.cvLivro.setOnClickListener {
            val intent = Intent(
                this, Livros_Activity::class.java
            )
            startActivity(intent)
        }


        binding.cvIdioma.setOnClickListener {
            val intent = Intent(
                this, Activity_idiomas::class.java
            )
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_adicionar -> {
                Toast.makeText(this,"Adicionar", Toast.LENGTH_LONG).show()
            }
            R.id.item_sair -> {
                Toast.makeText(this,"Sair", Toast.LENGTH_LONG).show()
        }
            R.id.item_configurações -> {
                Toast.makeText(this, "Configuração", Toast.LENGTH_LONG).show()
            }
            }
        return true
    }


}