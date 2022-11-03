package com.example.filmify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.filmify.databinding.ListDataFoodBinding
import com.example.filmify.modelData.Food

class FoodAdapter(private val listFood:ArrayList<Food>):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    inner class FoodViewHolder(itemView:ListDataFoodBinding):RecyclerView.ViewHolder(itemView.root) {
    private val binding = itemView
        fun bind(foodData: Food) {
            with(binding){
                Glide.with(itemView).load(foodData.image).into(imgPoster)
                tvTitle.text = foodData.label
                dietLabels.text = foodData.dietLabels
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(ListDataFoodBinding.inflate(LayoutInflater.from(parent.context),
        parent, false))
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(listFood[position])
    }

    override fun getItemCount(): Int = listFood.size
}