package com.example.myrecyclerview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myrecyclerview.R
import com.example.myrecyclerview.data.model.Comic

class ListComicAdapter(private val listComic: ArrayList<Comic>) : RecyclerView.Adapter<ListComicAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_comic, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val comic = listComic[position]
        holder.bind(comic)
//        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listComic[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listComic.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Comic)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvInfo: TextView = itemView.findViewById(R.id.tv_item_info)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        fun bind(data:Comic){
            Glide.with(itemView.context)
                .load(data.photo)
                .apply(RequestOptions().override(55, 55))
                .into(imgPhoto)
            tvName.text = data.title
            tvInfo.text = data.info
            itemView.rootView.setOnClickListener { onItemClickCallback.onItemClicked(data) }
        }
    }
}