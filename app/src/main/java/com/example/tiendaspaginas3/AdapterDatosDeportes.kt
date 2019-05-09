package com.example.tiendaspaginas3

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ver_pagina.*
import kotlinx.android.synthetic.main.item_list.view.*
import android.support.v4.content.ContextCompat.startActivity
import java.security.AccessController.getContext


class AdapterDatosDeportes(val context: Context, val deportes: List<Deporte>) : RecyclerView.Adapter<AdapterDatosDeportes.MyViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return deportes.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        val deporte = deportes[p1]
        p0.setData(deporte)
        p0.txvTitle.text = deporte.title

        /*p0.itemView.setOnClickListener {
            listener.onItemSelected(deporte)
        }*/
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentDeporte = null
        fun setData(categoria: Deporte?){
            itemView.txvTitle.text = categoria!!.title
        }
        val txvTitle: TextView = itemView.findViewById(R.id.txvTitle)
        init {
            itemView.setOnClickListener {
                Toast.makeText(context,itemView.txvTitle.text,Toast.LENGTH_SHORT).show()

                when(itemView.txvTitle.text){
                    "Nike" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.nike.com/mx/")
                        itemView.context.startActivity(intent)
                    }
                    "Adidas" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.adidas.com")
                        itemView.context.startActivity(intent)
                    }
                    "Marti" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.marti.com/mx/")
                        itemView.context.startActivity(intent)
                    }
                    "Puma" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.puma.com")
                        itemView.context.startActivity(intent)
                    }
                    "Rebook" -> {
                        val intent = Intent(itemView.context, VerPagina::class.java)
                        intent.putExtra("Pagina","https://www.rebook.mx")
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }

}