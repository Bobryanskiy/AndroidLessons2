package com.github.bobryanskiy.androidlessons2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()
        for (i in 1..10) {
            data.addAll(listOf(ItemsViewModel(android.R.drawable.btn_dialog, i.toString(), i.toString()), ItemsViewModel(android.R.drawable.btn_dialog, i.toString(), i.toString())))
        }
        recyclerView.adapter = CustomAdapter(data)
    }
}