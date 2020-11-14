package com.aidid.firebase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.hospital_row.view.*

/**
 * Created by Abraham Kristanto on 14/11/2020
 */

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    // Array dari nama Hospital
    val hospitalNames = listOf("Hospital 1", "Hospital 2", "Hospital 3")

    // Number Of Items
    override fun getItemCount(): Int {
        return hospitalNames.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.hospital_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val hospitalName = hospitalNames.get(position)
        holder?.view?.textView_hospital_name?.text = hospitalName
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view)  {

}