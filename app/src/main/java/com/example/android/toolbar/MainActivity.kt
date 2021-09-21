package com.example.android.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.android.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Ozon"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)

        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.sync -> {
                binding?.textView?.text = "Sync"
                Toast.makeText(this, "Sync", Toast.LENGTH_LONG).show()
            }
            R.id.save -> {
                binding?.textView?.text = "Save"
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                binding?.textView?.text = "Search"
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }
            R.id.delete -> {
                binding?.textView?.text = "Delete"
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}