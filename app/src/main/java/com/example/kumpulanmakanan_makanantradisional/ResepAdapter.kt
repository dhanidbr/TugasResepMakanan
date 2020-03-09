package com.example.kumpulanmakanan_makanantradisional

import android.view.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_list_item.view.*

class ResepAdapter (val resepItemList: List<ResepData>, val clickListener: (ResepData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder , position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }

    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(resep: ResepData, clickListener: (ResepData) -> Unit) {
            itemView.tv_part_item_name.text = resep.namaMakanan
            itemView.tv_part_id.text = resep.daerahMakanan.toString()
            itemView.tv_foto.setImageResource(resep.fotoResep)
            itemView.setOnClickListener{ clickListener(resep)}
        }
    }
}