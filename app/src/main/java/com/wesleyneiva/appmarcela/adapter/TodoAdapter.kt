package com.wesleyneiva.appmarcela.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wesleyneiva.appmarcela.R
import com.wesleyneiva.appmarcela.model.Todo


class TodoAdapter(
    var todos: MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {


    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val btnDelete: Button = itemView.findViewById(R.id.btnDelete)

        init {
            // Configurar o clique do botão de exclusão
            btnDelete.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    // Remover o item da lista
                    todos.removeAt(position)
                    // Notificar o adaptador sobre a remoção
                    notifyItemRemoved(position)
                }
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }



    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        with(holder.itemView) {
            findViewById<TextView>(R.id.tvTitle).text = todos[position].title
            findViewById<CheckBox>(R.id.cbDone).isChecked = todos[position].isChecked


        }


    }

    override fun getItemCount(): Int {
        return todos.size
    }


}