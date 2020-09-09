package com.example.matdesignless.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.matdesignless.R
import com.example.matdesignless.entities.Fruct

open class FructsViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_card, parent, false)) {
    private var mFructTV: TextView? = null
    private var fructImageView: ImageView?=null

   init { mFructTV = itemView.findViewById(R.id.fructNameTV)
       fructImageView = itemView.findViewById(R.id.fructImageView)}

    fun bind(fruct: Fruct) {
        mFructTV?.text = fruct.name
        fructImageView?.setImageResource(fruct.imageId)
    }
}

class FructsListAdapter(private val list: List<Fruct>) : RecyclerView.Adapter<FructsViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FructsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return FructsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: FructsViewHolder, position: Int) {
        val fruct: Fruct = list[position]
        holder.bind(fruct)
    }

}