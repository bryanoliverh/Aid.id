package com.aidid.firebase

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DonationListAdapter (var donationList: ArrayList<Model>):RecyclerView.Adapter<DonationListAdapter.ViewHolder>(){
    class ViewHolder(inflater: LayoutInflater,viewGroup: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.donationlist, viewGroup,false)){

        fun bind(model: Model) {
            val donationText = itemView.findViewById<TextView>(R.id.imageView1)
            val donarionTextDetail = itemView.findViewById<TextView>(R.id.Lorem1)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(model.imageview)
            donationText.text = model.donationText
            donarionTextDetail.text = model.donationDetail
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DonationListAdapter.ViewHolder{

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: DonationListAdapter.ViewHolder, position: Int) {
        val donationModel = donationList[position]
        holder.bind(donationModel)
    }

    override fun getItemCount(): Int {
        return donationList.size
    }
}