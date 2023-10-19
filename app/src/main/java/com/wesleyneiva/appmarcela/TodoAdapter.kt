package com.wesleyneiva.appmarcela

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    var todos: List<Todo>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {


    inner class TodoViewHolder(itemView: View): RecyclerView.ViewHolder(
        itemView){
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val cbDone: CheckBox = itemView.findViewById(R.id.cbDone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        val mensagem =todos[position]
        holder.tvTitle.text = mensagem.title
        holder.cbDone.isChecked = mensagem.isChecked



        }

        }




