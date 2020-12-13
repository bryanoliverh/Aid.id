package com.aidid.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.firebase.auth.FirebaseAuth
class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_settings)

        etUserSupport.setOnClickListener {
            var intent = Intent(this@SettingsActivity, UsersupportActivity::class.java)
            startActivity(intent)
        }
        etTNC.setOnClickListener {
            var intent = Intent(this@SettingsActivity, TncActivity::class.java)
            startActivity(intent)
        }
        etabout.setOnClickListener {
            var intent = Intent(this@SettingsActivity, AboutusActivity::class.java)
            startActivity(intent)
        }
        etNotifications.setOnClickListener {
            var intent = Intent(this@SettingsActivity, NotificationsActivity::class.java)
            startActivity(intent)
        }
    }}
