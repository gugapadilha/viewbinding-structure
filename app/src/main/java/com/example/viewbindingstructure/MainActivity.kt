package com.example.viewbindingstructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindingstructure.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //referência direta pro xml
    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //pegando a raiz do xml -contraintLayout da activity_main (tela)
    }

    override fun onStart() {
        super.onStart()

        this.binding.btnContador.setOnClickListener {
            contador++
            this.binding.tvContador.text = "Contador: $contador"
        }

    }
}