package com.wesleyneiva.appmarcela


import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DatabaseHelper(context: Context): SQLiteOpenHelper(
    context, NOME_BANCO_DADOS, null, 1
) {

    companion object {
        const val NOME_BANCO_DADOS = "listaTarefas.db"
        const val VERSAO = 1
        const val NOME_TABELA_TAREFA = "tarefas"
        const val COLUNA_ID_TAREFA = "id_terefa"
        const val COLUNA_DESCRICAO = "descricao"
        const val COLUNA_DATA_CADASTRO = "data_cadastro"




    }

    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "CREATE TABLE IF NOT EXISTS $NOME_TABELA_TAREFA( " +
                "$COLUNA_ID_TAREFA INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " $COLUNA_DESCRICAO VARCHAR(70)," +
                " $COLUNA_DATA_CADASTRO DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP " +
                "  );"



    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}