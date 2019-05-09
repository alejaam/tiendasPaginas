package com.example.tiendaspaginas3

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.tiendaspaginas3.Categories.categorias
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Categorias.setText("Categorias");
        context = this
        val layoutManager = LinearLayoutManager(context)

        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerCategorias.layoutManager = layoutManager

        val adapter = AdapterData(context, categorias, ItemListener { categoria ->
            //Aqui recibes el item de la lista al que hiciste click
            Toast.makeText(context,categoria.title,Toast.LENGTH_LONG).show()
            subCategorias.setText(categoria.title);
            val layoutManager = LinearLayoutManager(context)
            layoutManager.orientation = LinearLayoutManager.VERTICAL
            when(categoria.title){
                "Deportes" -> {
                    recyclerSubcategorias.layoutManager = layoutManager
                    val adapter2 = AdapterDatosDeportes(context, Categories.Deportes.deportes)
                    recyclerSubcategorias.adapter = adapter2
                }
                "Joyerias" -> {
                    recyclerSubcategorias.layoutManager = layoutManager
                    val adapter = AdapterDatosJoyerias(context, Categories.Joyeraias.joyerias)
                    recyclerSubcategorias.adapter = adapter
                }
                "Hogar" -> {
                    recyclerSubcategorias.layoutManager = layoutManager
                    val adapter = AdapterDatosHogar(context, Categories.Hogares.hogar)
                    recyclerSubcategorias.adapter = adapter
                }
                "Accesorios" -> {
                    recyclerSubcategorias.layoutManager = layoutManager
                    val adapter = AdapterDatosAccesorios(context, Categories.Accesorios.accesorios)
                    recyclerSubcategorias.adapter = adapter
                }
                "Ropa" -> {
                    recyclerSubcategorias.layoutManager = layoutManager
                    val adapter = AdapterDatosRopa(context, Categories.Ropas.ropas)
                    recyclerSubcategorias.adapter = adapter
                }
                "Jugueterias" -> {
                    recyclerSubcategorias.layoutManager = layoutManager
                    val adapter = AdapterDatosJugueterias(context, Categories.Jugueterias.jugueterias)
                    recyclerSubcategorias.adapter = adapter
                }
            }
        })
        recyclerCategorias.adapter = adapter
    }
}