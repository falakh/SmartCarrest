package com.example.smartcarrest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_penanganan_henti_jantung.*

class PenangananHentiJantung : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penanganan_henti_jantung)
        AppbarSinggleton.addAppbar(this)
        pertolongan_pertama_button.setOnClickListener {
            val intent = Intent(this,PertolonganPertama::class.java)
            startActivity(intent)
        }
    }
}
