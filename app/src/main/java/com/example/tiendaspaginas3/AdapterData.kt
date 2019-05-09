package com.example.tiendaspaginas3

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AdapterData(private val context: Context, private val categories: List<Categoria>, private val listener: ItemListener) : RecyclerView.Adapter<AdapterData.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val categoria = categories[position]

        holder.txvTitle.text = categoria.title

        holder.itemView.setOnClickListener {
            listener.onItemSelected(categoria)

        }
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val txvTitle: TextView = itemView.findViewById(R.id.txvTitle)
    }
}