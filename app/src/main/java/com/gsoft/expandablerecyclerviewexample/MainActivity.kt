package com.gsoft.expandablerecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gsoft.expandablerecyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // view binding for the activity
    private lateinit var binding: ActivityMainBinding

    // get reference to the adapter class
    private var data = ArrayList<dato>()
    private lateinit var rvAdapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // define layout manager for the Recycler view
        binding.rvPrueba.layoutManager = LinearLayoutManager(this)

        // attach adapter to the recycler view
        rvAdapter = RvAdapter(data)
        binding.rvPrueba.adapter = rvAdapter

        // create new objects
        // add some row data
        val data1 = dato(
            "Java",
            false
        )

        val data2 = dato(
            "Kotlin",
            false
        )

        val data3 = dato(
            "Dart",
            false
        )

        val data4 = dato(
            "Swift",
            false
        )

        // add items to list
        data.add(data1)
        data.add(data2)
        data.add(data3)
        data.add(data4)


        rvAdapter.notifyDataSetChanged()

    }


}