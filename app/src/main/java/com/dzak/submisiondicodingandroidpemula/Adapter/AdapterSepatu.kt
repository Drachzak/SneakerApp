package com.dzak.submisiondicodingandroidpemula.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dzak.submisiondicodingandroidpemula.R
import com.dzak.submisiondicodingandroidpemula.model.DetailActivity
import com.dzak.submisiondicodingandroidpemula.model.sepatu

class AdapterSepatu(private val listdatasepatu : ArrayList<sepatu>) : RecyclerView.Adapter<AdapterSepatu.ViewHolder>() {
    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        val gambarsepatu : ImageView = itemView.findViewById(R.id.img_sepatu)
        val namasepatu : TextView = itemView.findViewById(R.id.txt_namasepatu)
        val hargasepatu : TextView = itemView.findViewById(R.id.txt_harga)
        val deskripsisepatu : TextView = itemView.findViewById(R.id.txt_deskripsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.data_recycle_sepatu,parent,false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val sepatu = listdatasepatu[position]
        Glide.with(holder.itemView.context)
            .load(listdatasepatu[position].gambar)
            .into(holder.gambarsepatu)
        holder.namasepatu.text = sepatu.name
        holder.hargasepatu.text = sepatu.harga
        holder.deskripsisepatu.text = sepatu.deskripsi
        holder.itemView.setOnClickListener {
            val pindahkedetail = Intent(it.context,DetailActivity::class.java)
            pindahkedetail.putExtra(DetailActivity.juduldetailsepatu,sepatu.name)
            pindahkedetail.putExtra(DetailActivity.hargadetailsepatu,sepatu.harga)
            pindahkedetail.putExtra(DetailActivity.EXTRA_DESKRIPSI,sepatu.deskripsi)
            pindahkedetail.putExtra(DetailActivity.EXTRA_GAMBAR,sepatu.gambar.toString())
            it.context.startActivity(pindahkedetail)
        }
    }

    override fun getItemCount(): Int {
        return listdatasepatu.size
    }
}