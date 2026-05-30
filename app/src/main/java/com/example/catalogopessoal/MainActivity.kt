package com.example.catalogopessoal

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("CICLO", "onCreate")

        setContentView(R.layout.activity_main)

        // =========================
        // SharedPreferences
        // =========================
        val prefs = getSharedPreferences("dados", MODE_PRIVATE)

        if (!prefs.contains("usuario")) {
            val editor = prefs.edit()
            editor.putString("usuario", "Marcelo")
            editor.putString("ultimo_acesso", "27/05/2026")
            editor.apply()
        }

        val usuario = prefs.getString("usuario", "Visitante")
        val ultimoAcesso = prefs.getString("ultimo_acesso", "Primeiro acesso")

        Log.d("SHARED", "Usuário: $usuario | Último acesso: $ultimoAcesso")

        // =========================
        // RecyclerView + FAB
        // =========================
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val fab = findViewById<FloatingActionButton>(R.id.fabAdd)

        fab.setOnClickListener {
            startActivity(Intent(this, AddItemActivity::class.java))
        }

        carregarDados(recyclerView)
    }

    override fun onResume() {
        super.onResume()

        Log.d("CICLO", "onResume")

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        carregarDados(recyclerView)
    }

    private fun carregarDados(recyclerView: RecyclerView) {
        val db = DBHelper(this)
        val lista = db.listarItens()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(lista)
    }

    override fun onStart() {
        super.onStart()
        Log.d("CICLO", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CICLO", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLO", "onDestroy")
    }
}