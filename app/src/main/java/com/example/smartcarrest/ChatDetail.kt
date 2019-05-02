package com.example.smartcarrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smartcarrest.Adapter.ChatDetailAdapter
import com.example.smartcarrest.Pojo.MessagePojo
import com.example.smartcarrest.Pojo.User
import kotlinx.android.synthetic.main.activity_chat_detail.*

class ChatDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_detail)
        list_chat_detail.layoutManager = LinearLayoutManager(this)

        var pesan = ArrayList<MessagePojo>()
        pesan.add(MessagePojo(1, "Halo"))
        pesan.add(MessagePojo(2, "Hai"))
        pesan.add(MessagePojo(1,"Nama kamu siapa ?"))
        pesan.add(MessagePojo(2,"Nama saya azmiya"))
        var user = (User(pesan,2,"Azmiya"))
        list_chat_detail.adapter = ChatDetailAdapter(pesan,user)

    }
}
