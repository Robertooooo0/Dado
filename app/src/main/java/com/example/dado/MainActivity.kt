package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var lblNumero: TextView
    lateinit var imgDado: ImageView
    lateinit var btnLanzaDado: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lblNumero= findViewById(R.id.txtNombre)
        imgDado=findViewById(R.id.imgDado)
        btnLanzaDado = findViewById(R.id.btnLanzaDado)
    }

    fun lanzaDado(v: View){
        Log.d("Dadoapp","se presiono")
        val numeroAleatorio = Random.nextInt(6)+1
        lblNumero.text = numeroAleatorio.toString()
        val imagenAponer = when (numeroAleatorio){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgDado.setImageResource(imagenAponer)
    }
}