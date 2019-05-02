package com.example.smartcarrest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        AppbarSinggleton.addAppbar(this)
        seputar.setOnClickListener {
            val intent =  Intent(this,AboutJantungHenti::class.java)
            startActivity(intent)
        }

        penanganan.setOnClickListener {
            val intent = Intent(this,PenangananHentiJantung::class.java)
            startActivity(intent)
        }

        emergency_contact.setOnClickListener {
            val intent = Intent(this,CallCenter::class.java)
            startActivity(intent)
        }
        chatting.setOnClickListener {
            val intent = Intent(this,ChatActivity::class.java)
            startActivity(intent)
        }
        profille_button.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }




    }
}
