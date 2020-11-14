package com.aidid.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_results.*
import kotlinx.android.synthetic.main.activity_results.*

class activity_results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        recyclerView_results.layoutManager = LinearLayoutManager(this)
        recyclerView_results.adapter = MainAdapter()
    }
}