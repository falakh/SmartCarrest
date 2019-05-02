package com.example.smartcarrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        AppbarSinggleton.addAppbar(this)
        alamat.setText("JL ALAMAT NO 3")
        alamat.isEnabled = false
        alamat.isFocusable= false
        pekerjaan.setText("Mahasiswa")
        pekerjaan.isEnabled = false
        pekerjaan.isFocusable= false
        kontak.setText("0897755678")
        kontak.isEnabled  = false
        kontak.isFocusable= false
    }
}
