package com.aidid.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(){
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        auth = FirebaseAuth.getInstance()

        val fragment1 = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment, fragment1)
        transaction.commit()

        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.nav_home, R.id.nav_Profile
        )
            .build()
        setupActionBarWithNavController(navController, appBarConfiguration)
        nav_bottom.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.option_menu, menu)
            return true
    }
        override fun onOptionsItemSelected(item: MenuItem): Boolean
        {
            when(item.itemId)
           {
               R.id.logout->{
               auth.signOut()
               Intent(this@HomeActivity, LoginActivity::class.java).also {
                   it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                   startActivity(it)
               }
            return true
           }
                R.id.settings->
                {
                    Intent(this@HomeActivity, SettingsActivity::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)
                    }
                    return true
                }
            else -> return true
           }

        }
}


