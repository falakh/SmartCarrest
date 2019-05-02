package com.example.smartcarrest.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smartcarrest.Pojo.MessagePojo
import com.example.smartcarrest.Pojo.User
import com.example.smartcarrest.R
import kotlinx.android.synthetic.main.chat_detail_send.view.*
import kotlinx.android.synthetic.main.chat_detail_view.view.*

class ChatDetailAdapter : RecyclerView.Adapter<ChatDetailAdapter.ChatDetailViewHolder> {
    private val VIEW_TYPE_MESSAGE_SENT = 1
    private val VIEW_TYPE_MESSAGE_RECEIVED = 2
    private var mMessagePojoList: List<MessagePojo>
    private var user: User

    constructor(mMessagePojoList: List<MessagePojo>, user: User) : super() {
        this.user = user
        this.mMessagePojoList = mMessagePojoList

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatDetailViewHolder {
        Log.d("VIEW TYPE",viewType.toString())
        if (viewType == VIEW_TYPE_MESSAGE_SENT) {
            val view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_detail_send, parent, false);
            return ChatDetailViewHolder(view);
        } else{
            val view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_detail_view, parent, false);
            return ChatDetailViewHolder(view);
        }
    }

    override fun getItemViewType(position: Int): Int {
        val message = mMessagePojoList.get(position)

        return if (!(message.senderId == user.id)) {
            VIEW_TYPE_MESSAGE_SENT
        } else {
            VIEW_TYPE_MESSAGE_RECEIVED
        }
    }

    override fun getItemCount(): Int {
        return mMessagePojoList?.count()
    }

    override fun onBindViewHolder(holder: ChatDetailViewHolder, position: Int) {
        holder.setText(getItemViewType(position),mMessagePojoList[position].pesan)
    }

    class ChatDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       public fun setText(type : Int,pesan :String){
            if(type == 1){
                itemView.text_message_send.text = pesan
            }else{
                itemView.text_message_recive.text = pesan
            }
        }
    }
}