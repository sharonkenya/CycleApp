package com.example.cycleapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BicycleAdapter(private val bicycles: List<Bicycle>) :
    RecyclerView.Adapter<BicycleAdapter.BicycleViewHolder>() {

    inner class BicycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BicycleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bicycle, parent, false)
        return BicycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: BicycleViewHolder, position: Int) {
        val bicycle = bicycles[position]
        holder.itemView.apply {
            findViewById<ImageView>(R.id.imageBicycle).setImageResource(bicycle.imageResId)
            findViewById<TextView>(R.id.textDescription).text = bicycle.description
            findViewById<TextView>(R.id.textCost).text = bicycle.costPerHour
            findViewById<Button>(R.id.buttonRent).setOnClickListener {
                // Handle the rent button click (navigate to rides page)
                val intent = Intent(context, RidesActivity::class.java)
                // You can pass data to the RidesActivity here if needed
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int = bicycles.size
}

//class RidesActivity
//
//class BicycleAdapter {
//}