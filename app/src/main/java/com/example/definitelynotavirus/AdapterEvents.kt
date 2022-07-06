package com.example.definitelynotavirus

import android.media.metrics.Event
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.definitelynotavirus.data.Events
import com.example.definitelynotavirus.databinding.ItemEventBinding

class AdapterEvents(private val listEvent: List<Events>) :
    RecyclerView.Adapter<AdapterEvents.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listEvent[position])
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listEvent[holder.adapterPosition]) }
    }

    class ListViewHolder(private var binding: ItemEventBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Events) {
            binding.tvDate.text=data.date
            binding.tvDes.text=data.des
        }
    }

    override fun getItemCount(): Int = listEvent.size


    interface OnItemClickCallback {
        fun onItemClicked(data: Events)
    }

}
