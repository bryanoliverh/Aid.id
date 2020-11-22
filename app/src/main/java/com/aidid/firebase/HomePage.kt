package com.aidid.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL, false)
        val donationList = ArrayList<Model>()
        donationList.add(Model(R.drawable.hospital, "Hospital", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."))
        donationList.add(Model(R.drawable.antivirus, "Medic", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."))
        donationList.add(Model(R.drawable.agreement, "Orphanage", "Lorem Ipsum is simply dummy text of the printing and typesetting industry."))

        val donationListAdapter = DonationListAdapter(donationList)

        recyclerView.adapter = donationListAdapter
    }
}