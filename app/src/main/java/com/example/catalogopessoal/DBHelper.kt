package com.example.catalogopessoal

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) :
    SQLiteOpenHelper(context, "catalogo.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("""
            CREATE TABLE itens (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                titulo TEXT,
                descricao TEXT,
                avaliacao REAL
            )
        """)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS itens")
        onCreate(db)
    }

    fun inserirItem(titulo: String, descricao: String, avaliacao: Float) {

        val db = writableDatabase

        val values = ContentValues().apply {
            put("titulo", titulo)
            put("descricao", descricao)
            put("avaliacao", avaliacao)
        }

        db.insert("itens", null, values)

        db.close()
    }

    fun listarItens(): ArrayList<Item> {

        val lista = ArrayList<Item>()

        val db = readableDatabase

        val cursor = db.rawQuery("SELECT * FROM itens", null)

        while (cursor.moveToNext()) {

            val item = Item(
                cursor.getString(1),
                cursor.getString(2),
                cursor.getFloat(3)
            )

            lista.add(item)
        }

        cursor.close()
        db.close()

        return lista
    }
}