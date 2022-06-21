package com.example.barapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "  ARCA DE NOE"
        actionBar.subtitle = "   Adopta una mascota ♥"
        actionBar.setIcon(R.drawable.ic_pet2)
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
        val vista = findViewById<TextView>(R.id.tvText)
        registerForContextMenu(vista)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        if (v?.id == R.id.tvText) {
            menu!!.add(0,Menu.FIRST,Menu.NONE,"CANARIO")
            menuInflater.inflate(R.menu.contextual_menu, menu)
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        super.onContextItemSelected(item)
        when (item.itemId) {
            R.id.miEl1 -> Toast.makeText(this, "Gato", Toast.LENGTH_SHORT).show()
            R.id.miEl2 -> Toast.makeText(this, "Perro", Toast.LENGTH_SHORT).show()
            R.id.miEl3 -> Toast.makeText(this, "Serpiente", Toast.LENGTH_SHORT).show()
            R.id.miSEl1 -> Toast.makeText(this, "Tortuga", Toast.LENGTH_SHORT).show()
            R.id.miSEl2 -> Toast.makeText(this, "Conejo", Toast.LENGTH_SHORT).show()
            R.id.miSEl3 -> Toast.makeText(this, "Hamster", Toast.LENGTH_SHORT).show()

        }
        return false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.pet -> Toast.makeText(this, "Pet Clicked", Toast.LENGTH_SHORT).show()
            R.id.search -> Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
            R.id.favorite -> Toast.makeText(this, "Favorite Clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}