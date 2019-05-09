package com.example.tiendaspaginas3

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiendaspaginas3.Categories.Deportes.deportes
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterDatosHogar(val context: Context, val hogares: List<Hogar>) : RecyclerView.Adapter<AdapterDatosHogar.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatosHogar.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }
    override fun getItemCount(): Int {
        return hogares.size
    }
    override fun onBindViewHolder(p0: AdapterDatosHogar.MyViewHolder, p1: Int) {
        val hogar = hogares[p1]
        p0.setData(hogar)
    }
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(categoria: Hogar?){
            itemView.txvTitle.text = categoria!!.title
        }
        init {
            itemView.setOnClickListener {
                when(itemView.txvTitle.text){
                    "Home Deppot" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","http://www.homedepot.com.mx")
                        itemView.context.startActivity(intent)
                    }
                    "Walmart" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.walmart.com.mx")
                        itemView.context.startActivity(intent)
                    }
                    "Linio" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.marti.mx")
                        itemView.context.startActivity(intent)
                    }
                    "Liverpool" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.liverpool.com.mx")
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }
}