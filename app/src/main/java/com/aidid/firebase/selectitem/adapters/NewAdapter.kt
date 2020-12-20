package com.aidid.firebase.selectitem.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aidid.firebase.R
import com.aidid.firebase.selectitem.models.NewModel

class NewAdapter(var Newlist: ArrayList<NewModel>):RecyclerView.Adapter<NewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        return Newlist.size
    }

    override fun onBindViewHolder(holder: NewAdapter.ViewHolder, position: Int) {
        val symptomsModel = Newlist[position]
        holder.bind(symptomsModel)
    }

    class ViewHolder(inflater: LayoutInflater,viewGroup: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.row_items,viewGroup,false)) {

        fun bind(newModel: NewModel) {
            val symptomsText = itemView.findViewById<TextView>(R.id.textkhusus1)
            val symptomsTextDetail = itemView.findViewById<TextView>(R.id.textkhusus2)
            val imageView = itemView.findViewById<ImageView>(R.id.khususitem)
            imageView.setImageResource(newModel.image)
            symptomsText.text = newModel.name
            symptomsTextDetail.text = newModel.desc
        }
    }
}