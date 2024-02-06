package com.wesleyneiva.appmarcela



import com.wesleyneiva.appmarcela.model.Tarefa

interface ITarefaDAO {

    fun salvar(tarefa: Tarefa): Boolean
    fun atualizar(tarefa: Tarefa): Boolean
    fun remover(tarefa: Int): Boolean
    fun listar(): List<Tarefa>


}