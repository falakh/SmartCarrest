package com.example.smartcarrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_call_center.*

class CallCenter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_center)
        AppbarSinggleton.addAppbar(this);
        val dataTelp = ArrayList<String>()
        dataTelp.add("PSC 119")
        dataTelp.add("RSSA")
        dataTelp.add("RS Panti Waluyo")
        dataTelp.add("Temukan Faskes Terdekat")
        list_telp.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dataTelp)
    }
}
