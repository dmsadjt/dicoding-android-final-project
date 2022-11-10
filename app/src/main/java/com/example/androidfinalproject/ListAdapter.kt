package com.example.androidfinalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter(private val listCostume : ArrayList<Costume>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_costume, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val costume = listCostume[position]

        Glide.with(holder.itemView.context)
            .load(costume.photo)
            .apply(RequestOptions().override(80,80))
            .into(holder.imgPhoto)

        holder.tvName.text = costume.name
        holder.tvPrice.text = "Rp." + costume.price.toString()
        holder.tvSize.text = costume.size
        holder.tvDescription.text = costume.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCostume[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listCostume.size
    }

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var tvName : TextView = itemView.findViewById(R.id.costume_name)
        var tvSize : TextView = itemView.findViewById(R.id.size)
        var tvPrice : TextView = itemView.findViewById(R.id.price)
        var tvDescription : TextView = itemView.findViewById(R.id.description)
        var imgPhoto : ImageView = itemView.findViewById(R.id.image)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data : Costume)
    }
}