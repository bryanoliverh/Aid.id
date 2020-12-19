package com.aidid.firebase

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_new_home.*
import kotlinx.android.synthetic.main.activity_new_home.toolbar
import org.json.JSONObject

class NewHomeActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_home)
        setSupportActionBar(toolbar)
        auth = FirebaseAuth.getInstance()

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)
        val symptomsList = ArrayList<Model>()
        symptomsList.add(Model(R.drawable.cough,"Dry Cough","Lorem Ipsum is simply dummy text of the printing and typesetting industry."))
        symptomsList.add(Model(R.drawable.fever,"Fever","Lorem Ipsum is simply dummy text of the printing and typesetting industry."))
        symptomsList.add(Model(R.drawable.pain,"Head Ache","Lorem Ipsum is simply dummy text of the printing and typesetting industry."))

        val symptomsAdapter = SymptomsAdapter(symptomsList)

        recyclerView.adapter = symptomsAdapter

        recyclerViewPrecautions.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)
        val precautionsList = ArrayList<Model>()
        precautionsList.add(Model(R.drawable.soap,"Hand Wash","Lorem Ipsum is simply dummy text of the printing and typesetting industry."))
        precautionsList.add(Model(R.drawable.hone,"Stay Home","Lorem Ipsum is simply dummy text of the printing and typesetting industry."))
        precautionsList.add(Model(R.drawable.distance,"Social Distance","Lorem Ipsum is simply dummy text of the printing and typesetting industry."))

        val precautionsAdapter = PreCautionsAdapter(precautionsList)

        recyclerViewPrecautions.adapter = precautionsAdapter

        txtViewSymptoms.setOnClickListener {
            var intent = Intent(this@NewHomeActivity,SymptomsActivity::class.java)
            startActivity(intent)
        }

        txtViewPrecautions.setOnClickListener {
            var intent = Intent(this@NewHomeActivity,PreCautionActivity::class.java)
            startActivity(intent)
        }

        txtViewDonation.setOnClickListener{
            var intent = Intent(this@NewHomeActivity, MainSelectItem::class.java)
                startActivity(intent)
        }

        getGlobalData()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {

        when(item.itemId)
        {
            R.id.logout->{
                auth.signOut()
                Intent(this@NewHomeActivity, LoginActivity::class.java).also {
                    it.flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(it)
                }
                return true
            }
            R.id.settings-> {
                Intent(this@NewHomeActivity, SettingsActivity::class.java).also {
                    it.flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(it)
                }
                return true
            }
            R.id.Profileopt-> {
                Intent(this@NewHomeActivity, HomeActivity::class.java).also {
                    it.flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(it)
                }
                return true
            }
            R.id.Reward-> {
                Intent(this@NewHomeActivity, RewardsActivity::class.java).also {
                    it.flags = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(it)
                }
                return true
            }
            else -> return true
        }

    }

    fun getGlobalData(){
        val url:String ="https://corona.lmao.ninja/v3/covid-19/countries/indonesia"

        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener<String> {

                var jsonObject = JSONObject(it.toString())

                //now set values in textview
                txtInfected.text = jsonObject.getString("cases")
                txtRecoverd.text = jsonObject.getString("recovered")
                txtDeceased.text = jsonObject.getString("deaths")

            },
            Response.ErrorListener {
                Toast.makeText(this@NewHomeActivity,it.toString(), Toast.LENGTH_LONG).show()
                txtInfected.text = "-"
                txtRecoverd.text = "-"
                txtDeceased.text = "-"

            }
        )

        val requestQueue = Volley.newRequestQueue(this@NewHomeActivity)
        requestQueue.add(stringRequest)
    }
}
