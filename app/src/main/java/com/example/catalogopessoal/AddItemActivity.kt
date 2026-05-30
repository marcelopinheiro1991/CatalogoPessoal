package com.example.catalogopessoal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import androidx.appcompat.app.AppCompatActivity

class AddItemActivity : AppCompatActivity() {override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_add_item)
    val edtTitulo = findViewById<EditText>(R.id.edtTitulo)

    val edtDescricao = findViewById<EditText>(R.id.edtDescricao)

    val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

    val btnSalvar = findViewById<Button>(R.id.btnSalvar)
    btnSalvar.setOnClickListener {

        val titulo = edtTitulo.text.toString()

        val descricao = edtDescricao.text.toString()

        val avaliacao = ratingBar.rating

        val db = DBHelper(this)

        db.inserirItem(
            titulo,
            descricao,
            avaliacao
        )

        finish()
    }    }
}