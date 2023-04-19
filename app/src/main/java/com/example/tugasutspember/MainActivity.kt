package com.example.tugasutspember

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: adapter
    lateinit var listData: ArrayList<datclass>

    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 1)
        recycle.layoutManager = layoutManager
        recycleAdapter = adapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(datclass("Anggrek", "Tanaman Hias", "Kalimantan", R.drawable.anggrek))
        listData.add(datclass("Bugenfil", "Tanaman Hias", "Amerika Selatan", R.drawable.bugenfil))
        listData.add(datclass("Daisy", "Tanaman Hias", "Tiongkok", R.drawable.daisy))
        listData.add(datclass("Melati", "Tanaman Hias", "Asia Selatan", R.drawable.melati))
        listData.add(datclass("Sakura", "Tanaman Hias", "Korea", R.drawable.sakura))
        listData.add(datclass("Sepatu", "Tanaman Hias", "Asia Timur", R.drawable.sepatu))
        listData.add(datclass("Tulip", "Tanaman Hias", "Asia Tengah", R.drawable.tulip))
        listData.add(datclass("Mawar Merah", "Tanaman Hias", "Dataran Cina, Timur tengah", R.drawable.merah))
        listData.add(datclass("Mawar Putih", "Tanaman Hias", "Yunani Kuno", R.drawable.putih))
        listData.add(datclass("Matahari", "Tanaman Hias", "Amerika", R.drawable.matahari))
        listData.add(datclass("Anggrek", "Tanaman Hias", "Kalimantan", R.drawable.anggrek))
        listData.add(datclass("Bugenfil", "Tanaman Hias", "Amerika Selatan", R.drawable.bugenfil))
        listData.add(datclass("Daisy", "Tanaman Hias", "Tiongkok", R.drawable.daisy))
        listData.add(datclass("Melati", "Tanaman Hias", "Asia Selatan", R.drawable.melati))
        listData.add(datclass("Sakura", "Tanaman Hias", "Korea", R.drawable.sakura))
        listData.add(datclass("Sepatu", "Tanaman Hias", "Asia Timur", R.drawable.sepatu))
        listData.add(datclass("Tulip", "Tanaman Hias", "Asia Tengah", R.drawable.tulip))
        listData.add(datclass("Mawar Merah", "Tanaman Hias", "Dataran Cina, Timur tengah", R.drawable.merah))
        listData.add(datclass("Mawar Putih", "Tanaman Hias", "Yunani Kuno", R.drawable.putih))
        listData.add(datclass("Matahari", "Tanaman Hias", "Amerika", R.drawable.matahari))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.gridid ->{
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}
