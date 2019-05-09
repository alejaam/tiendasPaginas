package com.example.tiendaspaginas3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.R.*
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ver_pagina.*
import kotlinx.android.synthetic.main.activity_ver_pagina.view.*


class VerPagina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_pagina)
        val verPagina = findViewById<WebView>(R.id.verPagina)
        val objetoIntent: Intent = intent
        var pagina = objetoIntent.getStringExtra("Pagina")
        verPagina.settings.javaScriptEnabled = true
        verPagina.settings.javaScriptCanOpenWindowsAutomatically = true

        verPagina.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        verPagina.loadUrl(pagina)
    }
}
