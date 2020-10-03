package com.example.capitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_botonhonduras()
        click_botoncostarica()
        click_botonelsalvador()
        click_botonguatemala()
        click_botonnicaragua()
        click_botonpanama()
        click_botonbelice()
    }
    fun click_botonhonduras(){
        bthonduras.setOnClickListener(){
          Toast.makeText(applicationContext, "La capital es tegucigalpa", Toast.LENGTH_SHORT).show()
        }
    }
    fun click_botoncostarica(){
        btcostarica.setOnClickListener(){
            Toast.makeText(applicationContext, "La capital es San José0", Toast.LENGTH_SHORT).show()
        }
    }
    fun click_botonelsalvador(){
        btelsalvador.setOnClickListener(){
            Toast.makeText(applicationContext, "la capital es San Salvador", Toast.LENGTH_SHORT).show()
        }
    }
    fun click_botonguatemala(){
        btguatemala.setOnClickListener(){
            Toast.makeText(applicationContext, "la capital es Ciudad de Guatemala", Toast.LENGTH_SHORT).show()
        }
    }
    fun click_botonnicaragua(){
        btnicaragua.setOnClickListener(){
            Toast.makeText(applicationContext, "la capital es Managua", Toast.LENGTH_SHORT).show()
        }
    }
    fun click_botonpanama(){
        btpanama.setOnClickListener(){
            Toast.makeText(applicationContext, "la capital es Ciudad de Panama", Toast.LENGTH_SHORT).show()
        }
    }
    fun click_botonbelice(){
        btbelice.setOnClickListener(){
            Toast.makeText(applicationContext, "la capital es Belmopan", Toast.LENGTH_SHORT).show()
        }
    }
}