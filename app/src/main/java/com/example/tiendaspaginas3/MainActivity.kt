package com.example.tiendaspaginas3

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val myFragmentDeportes = supportFragmentManager.findFragmentByTag("FragmentDeportes")
    val fragmentoDeportes = FragmentDeportes()
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this

        val manager = supportFragmentManager
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerCategorias.layoutManager = layoutManager

        val adapter = AdapterData(context, Supplier.categorias, object:ItemListener {
            override fun onItemSelected(categoria: Categoria) {
                //Aqui recibes el item de la lista al que hiciste click
                Toast.makeText(context, categoria.title, Toast.LENGTH_SHORT).show()
            }
        })

        recyclerCategorias.adapter = adapter
    }

    fun mostrarFragmentDeportes(view: View){
        val fragmentoDeportes = FragmentDeportes()
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerDeportesMain.layoutManager = layoutManager

        val adapter = AdapterDatosDeportes(context, Supplier.SupplierTwo.deportes)
        recyclerDeportesMain.adapter = adapter

        /*if (myFragmentDeportes == null || !fragmentoDeportes.isVisible){
            val manager = supportFragmentManager
            val transaccion = manager.beginTransaction()
            transaccion.replace(R.id.layoutTiendas,fragmentoDeportes)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }*/
    }
}