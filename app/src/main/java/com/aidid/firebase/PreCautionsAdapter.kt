package com.aidid.firebase

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PreCautionsAdapter(var precautionsList: ArrayList<Model>):RecyclerView.Adapter<PreCautionsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreCautionsAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        return precautionsList.size
    }

    override fun onBindViewHolder(holder: PreCautionsAdapter.ViewHolder, position: Int) {
        val symptomsModel = precautionsList[position]
        holder.bind(symptomsModel)
    }

    class ViewHolder(inflater: LayoutInflater,viewGroup: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_symptoms,viewGroup,false)) {

        fun bind(precautionsModel: Model) {
            val symptomsText = itemView.findViewById<TextView>(R.id.txtSymptoms)
            val symptomsTextDetail = itemView.findViewById<TextView>(R.id.txtSymptomsDetail)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(precautionsModel.imageview)
            symptomsText.text = precautionsModel.symptomsText
            symptomsTextDetail.text = precautionsModel.symptomsDetail
        }
    }
}