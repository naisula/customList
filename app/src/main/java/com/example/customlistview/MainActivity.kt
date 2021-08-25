package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<Model>()






        list.add(Model("image1", "image1 description", R.drawable.image1))
        list.add(Model("image2", "image2 description", R.drawable.image2))
        list.add(Model("image3", "image3 description", R.drawable.image3))
        list.add(Model("image4", "image4 description", R.drawable.image4))
        list.add(Model("image5", "image5 description", R.drawable.image5))
        listView.adapter = MyAdapter(this, R.layout.row, list)
        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(this@MainActivity, "You have clicked image 1", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "You have clicked image 2", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "You have clicked image 3", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivity, "You have clicked image 4", Toast.LENGTH_SHORT)
                    .show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivity, "You have clicked image 5", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}