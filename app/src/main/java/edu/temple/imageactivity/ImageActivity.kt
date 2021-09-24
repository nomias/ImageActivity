package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recView = findViewById<RecyclerView>(R.id.recyclerView)
        val imgView = findViewById<ImageView>(R.id.imageView)
        val imgDesc = findViewById<TextView>(R.id.imageDesc)
        recView.layoutManager = GridLayoutManager(this,4)
    }
}