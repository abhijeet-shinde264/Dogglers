package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.data.DataSource

class DogCardAdapter(private val context: Context?,
private val layout: Int): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    val dataSource = DataSource.dog

    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        // TODO: Declare and initialize all of the list item UI components
        val Dogview:ImageView = view?.findViewById(R.id.dogImage)!!
        val Dogname: TextView = view?.findViewById(R.id.dogname)!!
        val Dogage: TextView = view?.findViewById(R.id.dogage)!!
        val Doghobbies: TextView = view?.findViewById(R.id.doghobbies)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val view=when(viewType)
        {
            1->LayoutInflater.from(parent.context)
                .inflate(R.layout.horizonal_vertical_list, parent, false)
            2->LayoutInflater.from(parent.context)
                .inflate(R.layout.horizonal_vertical_list, parent, false)
            else -> {LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list, parent, false)}
        }
        return DogCardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataSource[position]
        holder.Dogview.setImageResource(item.imageDog)
        holder.Dogname.text=item.name
        holder.Dogage.text="Age: ${item.age}"
        val resources = context?.resources
        holder.Doghobbies.text=resources?.getString(R.string.dog_hobbies, item.hobbie)
    }
}