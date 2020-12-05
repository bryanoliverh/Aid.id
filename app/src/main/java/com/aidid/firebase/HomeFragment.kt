package com.aidid.firebase

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_get_started.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.menulayout.view.*
import kotlin.collections.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class HomeFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    //var adapter : ItemAdapter? = null
    //var itemlist =  ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*itemlist.add(Item("Hospital", "For the Healty world !", R.drawable.hospital))
        itemlist.add(Item("Orphanage", "For the World the better one !", R.drawable.agreement))
        itemlist.add(Item("Antivirus", "For the New Normal !", R.drawable.antivirus))

        adapter = ItemAdapter(this, itemlist)*/

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    /*class ItemAdapter : BaseAdapter{

        var itemlist = ArrayList<Item>()
        var context:Context? = null

        constructor(itemlist: ArrayList<Item>, context: Context?) : super() {
            this.itemlist = itemlist
            this.context = context
        }

        override fun getCount(): Int {
            return itemlist.size
        }

        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        @SuppressLint("ViewHolder", "InflateParams")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val item = this.itemlist[position]
            val inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val itemview = inflater.inflate(R.layout.menulayout,null)
            itemview.imageView10.setImageResource(item.image!!)
            itemview.textView10.text = item.name!!
            return itemview
        }

    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        view.hospital.setOnClickListener { view ->
            inflater.inflate(R.layout.activity_hospital,container, false)
        }

        view.orphanage.setOnClickListener { view ->
            Log.d("Orphanage", "Selected")
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}