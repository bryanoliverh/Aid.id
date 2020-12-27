package com.aidid.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aidid.firebase.selectitem.adapters.RewardAdapter
import kotlinx.android.synthetic.main.activity_rewards.*

annotation class RewardsActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)

        postToList()

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RewardAdapter(titlesList, descList, imagesList)

    }
    private fun addToList(title: String, description: String, image: Int) {
        titlesList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        addToList("10% Starbucks Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("20% Starbucks Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("30% Starbucks Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("40% Starbucks Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("10% Zara Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("10% Domino's Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("10% Planet Sports Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("10% Topman Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)
        addToList("10% Lacoste Gift Coupon","Lorem Ipsum is simply dummy text of the printing and typesetting industry.", R.drawable.map_logo)

//            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
//        }
    }
}