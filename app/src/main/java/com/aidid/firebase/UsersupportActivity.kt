package com.aidid.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.activity_tnc.*
import kotlinx.android.synthetic.main.activity_usersupport.*

class UsersupportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usersupport)

        icbacksetusersup.setOnClickListener {
            val intent = Intent(this@UsersupportActivity, SettingsActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            finish()
        }
    }
}