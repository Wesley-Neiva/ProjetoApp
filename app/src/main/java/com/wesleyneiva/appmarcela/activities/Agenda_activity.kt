package com.wesleyneiva.appmarcela.activities

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import com.wesleyneiva.appmarcela.databinding.ActivityAgendaBinding
import java.util.Calendar


class Agenda_activity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {

    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0

    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0
    var savedHour = 0
    var savedMinute = 0


    private val binding by lazy {
        ActivityAgendaBinding.inflate(layoutInflater)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarToolbar()
        pickDate()



    }

    private fun inicializarToolbar() {
        val toolbar = binding.includeToolbarAgenda.tbPrincipal
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = ""
            setDisplayHomeAsUpEnabled(true)
        }
    }


    fun getDateTimeCalendar() {
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)
    }

    fun pickDate() {

        binding.btnMarcarDia.setOnClickListener {

            getDateTimeCalendar()

            DatePickerDialog(this, this, year, month, day).show()


            val marcarAgenda = binding.editTextAgenda.text.toString()
            binding.textTarefaCard.text = marcarAgenda

            binding.editTextAgenda.text?.clear()

        }

    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay = dayOfMonth
        savedMonth = month + 1
        savedYear = year

        getDateTimeCalendar()

        TimePickerDialog(this, this, hour, minute, true).show()

    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        savedHour = hourOfDay
        savedMinute = minute


        binding.textDataCard.text =
            "$savedDay/$savedMonth /$savedYear  $savedHour h:$savedMinute min"

    }

}


