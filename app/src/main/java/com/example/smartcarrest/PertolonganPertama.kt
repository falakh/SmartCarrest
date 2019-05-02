package com.example.smartcarrest

import android.hardware.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pertolongan_pertama.*
import android.content.Intent
import android.util.Log


class PertolonganPertama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertolongan_pertama)
        ar_button.setOnClickListener{
            val intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }




}
