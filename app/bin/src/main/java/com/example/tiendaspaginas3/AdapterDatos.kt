package com.example.tiendaspaginas3

import android.app.Activity
import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.recyclerDeportesMain
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list.view.*
import com.example.tiendaspaginas3.MainActivity
import android.R
import android.support.v4.content.ContextCompat.getSystemService
import android.support.v7.view.menu.MenuView
import java.util.jar.Attributes


class AdapterDatos(val context: Context, val categorias: List<Categoria>) : RecyclerView.Adapter<AdapterDatos.MyViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AdapterDatos.MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categorias.size
    }

    override fun onBindViewHolder(p0: AdapterDatos.MyViewHolder, p1: Int) {
        val categoria = categorias[p1]
        p0.setData(categoria)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentCategoria: Categoria? = null

        init {
            itemView.setOnClickListener{
                Toast.makeText(context,currentCategoria!!.title +"Click",Toast.LENGTH_SHORT).show()

               // val fragmentoDeportes = FragmentDeportes()
                val layoutManager = LinearLayoutManager(context)
                layoutManager.orientation = LinearLayoutManager.VERTICAL

                val recyclerDeportesMain:RecyclerView = RecyclerView(context,l
                recyclerDeportesMain.layoutManager = layoutManager
                val adapter = AdapterDatosDeportes(context, Supplier.SupplierTwo.deportes)
                recyclerDeportesMain.adapter = adapter
            }
        }
        fun setData(categoria: Categoria?){
            itemView.txvTitle.text = categoria!!.title
            this.currentCategoria = categoria
        }

    }

}