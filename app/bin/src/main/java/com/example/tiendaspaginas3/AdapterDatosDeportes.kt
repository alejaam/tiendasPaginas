package com.example.tiendaspaginas3

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterDatosDeportes(val context: Context, val deportes: List<Deporte>) : RecyclerView.Adapter<AdapterDatosDeportes.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatosDeportes.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return deportes.size
    }

    override fun onBindViewHolder(p0: AdapterDatosDeportes.MyViewHolder, p1: Int) {
        val deporte = deportes[p1]
        p0.setData(deporte)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(categoria: Deporte?){
            itemView.txvTitle.text = categoria!!.title
        }
    }

}