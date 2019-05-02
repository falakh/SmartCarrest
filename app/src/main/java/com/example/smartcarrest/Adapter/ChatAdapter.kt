package com.example.smartcarrest.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.example.smartcarrest.ChatDetail
import com.example.smartcarrest.Pojo.SingglePeoplePojo
import com.example.smartcarrest.R
import kotlinx.android.synthetic.main.singgle_people.view.*

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

     var data: ArrayList<SingglePeoplePojo>
    var context : Context
    constructor(data: ArrayList<SingglePeoplePojo>,context: Context):super(){
        this.data = data
        this.context = context
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.singgle_people, parent, false)
        return ChatViewHolder(view,context)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.setPeople(data[position])
    }


    class ChatViewHolder(itemView: View,var context:Context) : RecyclerView.ViewHolder(itemView) {
     public fun setPeople( people : SingglePeoplePojo){
         itemView.user_tittle.text = people.name
         itemView.layout_singgle_people.setOnClickListener {
             val intent = Intent(this.context,ChatDetail::class.java)
             this.context.startActivity(intent)
         }
     }

    }
}


