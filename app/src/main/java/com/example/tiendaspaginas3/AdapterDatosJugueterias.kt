package com.example.tiendaspaginas3

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiendaspaginas3.Categories.Deportes.deportes
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterDatosJugueterias(val context: Context, val jugueterias: List<Jugueteria>) : RecyclerView.Adapter<AdapterDatosJugueterias.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatosJugueterias.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return jugueterias.size
    }

    override fun onBindViewHolder(p0: AdapterDatosJugueterias.MyViewHolder, p1: Int) {
        val jugueteria = jugueterias[p1]
        p0.setData(jugueteria)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(categoria: Jugueteria?){
            itemView.txvTitle.text = categoria!!.title
        }
        init {
            itemView.setOnClickListener {
                when(itemView.txvTitle.text){
                    "Lego" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://shop.lego.com")
                        itemView.context.startActivity(intent)
                    }
                    "Hasbro" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://shop.hasbro.com/en-us")
                        itemView.context.startActivity(intent)
                    }
                    "Mattel" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.mattel.com")
                        itemView.context.startActivity(intent)
                    }
                    "Mi Alegria" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","http://www.mialegria.com.mx/home.html")
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }

}