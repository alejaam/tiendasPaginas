package com.example.tiendaspaginas3

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiendaspaginas3.Categories.Deportes.deportes
import com.example.tiendaspaginas3.Categories.Joyeraias.joyerias
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterDatosJoyerias(val context: Context, val joyerias: List<Joyeria>) : RecyclerView.Adapter<AdapterDatosJoyerias.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatosJoyerias.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return joyerias.size
    }

    override fun onBindViewHolder(p0: AdapterDatosJoyerias.MyViewHolder, p1: Int) {
        val joyeria = joyerias[p1]
        p0.setData(joyeria)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(categoria: Joyeria?){
            itemView.txvTitle.text = categoria!!.title
        }
        init {
            itemView.setOnClickListener {
                when(itemView.txvTitle.text){
                "Gucci" -> {
                    val intent = Intent(itemView.context, VerPagina::class.java)
                    intent.putExtra("Pagina","https://www.gucci.com")
                    itemView.context.startActivity(intent)
                }
                "Graff" -> {
                    val intent = Intent(itemView.context, VerPagina::class.java)
                    intent.putExtra("Pagina","https://www.graff.com")
                    itemView.context.startActivity(intent)
                }
                "Bvulgari" -> {
                    val intent = Intent(itemView.context, VerPagina::class.java)
                    intent.putExtra("Pagina","https://www.bvlgari.com")
                    itemView.context.startActivity(intent)
                }
                "Cristal" -> {
                    val intent = Intent(itemView.context, VerPagina::class.java)
                    intent.putExtra("Pagina","https://www.cristaljoyas.com")
                    itemView.context.startActivity(intent)
                }
            }
            }
        }
    }

}