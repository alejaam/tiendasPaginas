package com.example.tiendaspaginas3

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiendaspaginas3.Categories.Deportes.deportes
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterDatosRopa(val context: Context, val ropas: List<Ropa>) : RecyclerView.Adapter<AdapterDatosRopa.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatosRopa.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ropas.size
    }

    override fun onBindViewHolder(p0: AdapterDatosRopa.MyViewHolder, p1: Int) {
        val ropa = ropas[p1]
        p0.setData(ropa)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(categoria: Ropa?){
            itemView.txvTitle.text = categoria!!.title
        }
        init {
            itemView.setOnClickListener {
                when(itemView.txvTitle.text){
                    "Pull&Bear" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.pullandbear.com")
                        itemView.context.startActivity(intent)
                    }
                    "Bershka" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.bershka.com")
                        itemView.context.startActivity(intent)
                    }
                    "ZARA" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://m.zara.com")
                        itemView.context.startActivity(intent)
                    }
                    "Stradivarius" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.stradivarius.com")
                        itemView.context.startActivity(intent)
                    }
                    "FOREVER 21" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.forever21.com")
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }

}