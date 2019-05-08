package com.example.tiendaspaginas3

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_fragment_deportes.*

class MainActivity : AppCompatActivity() {
    val myFragmentDeportes = getFragmentManager().findFragmentByTag("FragmentDeportes")
    val fragmentoDeportes = FragmentDeportes()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerCategorias.layoutManager = layoutManager

        val adapter = AdapterDatos(this, Supplier.categorias)
        recyclerCategorias.adapter = adapter

    }
    fun mostrarFragmentDeportes(view: View){
        val fragmentoDeportes = FragmentDeportes()
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerDeportesMain.layoutManager = layoutManager

        val adapter = AdapterDatosDeportes(this, Supplier.SupplierTwo.deportes)
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
