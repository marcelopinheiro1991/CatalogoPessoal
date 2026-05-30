package com.example.catalogopessoal


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val lista: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val titulo = view.findViewById<TextView>(R.id.txtTitulo)
        val descricao = view.findViewById<TextView>(R.id.txtDescricao)
        val avaliacao = view.findViewById<TextView>(R.id.txtAvaliacao)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = lista[position]

        holder.titulo.text = item.titulo
        holder.descricao.text = item.descricao
        holder.avaliacao.text = "⭐ ${item.avaliacao}"
    }

    override fun getItemCount(): Int = lista.size
}