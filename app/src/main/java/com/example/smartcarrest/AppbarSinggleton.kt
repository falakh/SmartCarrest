package com.example.smartcarrest

import android.content.Context
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class AppbarSinggleton {
    companion object {
        fun addAppbar(context :AppCompatActivity ){

            context.supportActionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            context.getSupportActionBar()?.setDisplayShowCustomEnabled(true);
            context.getSupportActionBar()?.setCustomView(R.layout.appbar);
        }
    }
}