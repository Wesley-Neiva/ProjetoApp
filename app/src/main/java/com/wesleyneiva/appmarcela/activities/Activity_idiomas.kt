package com.wesleyneiva.appmarcela.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wesleyneiva.appmarcela.databinding.ActivityIdiomasBinding


class Activity_idiomas : AppCompatActivity() {


    private val binding by lazy {
        ActivityIdiomasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnVoltarIdioma.setOnClickListener {
            finish()
        }

    }
}