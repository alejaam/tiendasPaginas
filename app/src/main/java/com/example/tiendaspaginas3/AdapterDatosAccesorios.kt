package com.example.tiendaspaginas3

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiendaspaginas3.Categories.Deportes.deportes
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterDatosAccesorios(val context: Context, val accesorios: List<Accesorio>) : RecyclerView.Adapter<AdapterDatosAccesorios.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatosAccesorios.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return accesorios.size
    }

    override fun onBindViewHolder(p0: AdapterDatosAccesorios.MyViewHolder, p1: Int) {
        val accesorio = accesorios[p1]
        p0.setData(accesorio)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(categoria: Accesorio?){
            itemView.txvTitle.text = categoria!!.title
        }
        init {
            itemView.setOnClickListener {
                when(itemView.txvTitle.text){
                    "Steren" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.steren.com.mx")
                        itemView.context.startActivity(intent)
                    }
                    "AliExpress" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.aliexpress.com")
                        itemView.context.startActivity(intent)
                    }
                    "Amazon" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.amazon.com.mx")
                        itemView.context.startActivity(intent)
                    }
                    "Ebay" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.ebay.com")
                        itemView.context.startActivity(intent)
                    }
                    "Mercado Libre" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.mercadolibre.com.mx")
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }

}