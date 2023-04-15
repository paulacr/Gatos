package com.androidmentoria.gatos

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class GatoActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gato)

        val button: Button = findViewById(R.id.botaDetalheGato)
        button.setOnClickListener {
            val intent = Intent(this, GatoDetalheActivity::class.java)
            startActivity(intent)
        }
    }
}