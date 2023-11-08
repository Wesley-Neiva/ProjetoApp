package com.wesleyneiva.appmarcela

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.accessibility.AccessibilityViewCommand.SetTextArguments
import java.time.LocalDate
import java.time.format.DateTimeFormatter
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


    lateinit var botaoAgendaVoltar: Button
    lateinit var botaoMarqueDia: Button
    lateinit var horaTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)

        pickDate()


        botaoAgendaVoltar = findViewById(R.id.btn_agenda_voltar)

        intent.extras


        botaoAgendaVoltar.setOnClickListener {
            finish()

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
        botaoMarqueDia = findViewById(R.id.btnMarcarDia)
        botaoMarqueDia.setOnClickListener {

            getDateTimeCalendar()

            DatePickerDialog(this, this, year, month, day).show()

        }

    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        savedDay = dayOfMonth
        savedMonth = month
        savedYear = year

        getDateTimeCalendar()

        TimePickerDialog(this, this, hour, minute, true).show()

    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        savedHour = hourOfDay
        savedMinute = minute

        horaTexto = findViewById(R.id.tvHoraTexto)
        horaTexto.text =
            "$savedDay/$savedMonth/$savedYear\n$savedHour h:$savedMinute m"

    }

}


