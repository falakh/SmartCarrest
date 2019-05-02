package com.example.smartcarrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smartcarrest.Adapter.ChatAdapter
import com.example.smartcarrest.Pojo.SingglePeoplePojo
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
//        Log.d("chat","chatting")
        var data = ArrayList<SingglePeoplePojo>()

        data.add(SingglePeoplePojo("Doni"))
        data.add(SingglePeoplePojo("Azmiya"))
        data.add(SingglePeoplePojo("Samuel"))
        data.add(SingglePeoplePojo("Putri"))

        list_chat.layoutManager = LinearLayoutManager(this)
        list_chat.adapter = ChatAdapter(data,this)
    }
}
