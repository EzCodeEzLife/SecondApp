package com.test.kazbekborash.secondapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list.view.*

class ListAdapter(var persons:ArrayList<Person>):RecyclerView.Adapter<ListAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        val view = inflater.inflate(R.layout.item_list, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.name.text = persons[p1].name
        p0.age.text = persons[p1].age.toString()
        p0.image.setImageResource(R.drawable.end)

    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var name = itemView.text_name
        var age = itemView.text_age
        var image = itemView.image
    }
}