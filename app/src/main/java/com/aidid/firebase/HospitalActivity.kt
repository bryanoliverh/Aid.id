package com.aidid.firebase

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.aidid.firebase.selectitem.adapters.NewAdapter
import com.aidid.firebase.selectitem.models.NewModel
import kotlinx.android.synthetic.main.activity_hospital2.*

class HospitalActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital2)

        hospitalrecycler.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val newList = ArrayList<NewModel>()
        newList.add(NewModel("Title1", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title2", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title3", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title4", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title5", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title6", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title7", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title8", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title9", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title10", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title11", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title12", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title113", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title14", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title15", "Lorem Ipsum Dolor Domet", R.drawable.clean))
        newList.add(NewModel("Title16", "Lorem Ipsum Dolor Domet", R.drawable.cough))

        val symptomsAdapter = NewAdapter(newList)
        hospitalrecycler.adapter = symptomsAdapter
    }
}