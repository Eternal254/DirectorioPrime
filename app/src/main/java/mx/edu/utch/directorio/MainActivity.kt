package mx.edu.utch.directorio

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import mx.edu.utch.directorio.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val contacts = listOf(
            "Juan: 1234567890",
            "María: 9876543210",
            "Carlos: 5555555555"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts)
        listView.adapter = adapter
    }
}
