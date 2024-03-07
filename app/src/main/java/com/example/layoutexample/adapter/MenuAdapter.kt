package com.example.layoutexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutexample.databinding.ItemMenuBinding
import com.example.layoutexample.model.Menu

class MenuAdapter: RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    class MenuViewHolder(private val binding: ItemMenuBinding):
            RecyclerView.ViewHolder(binding.root) {
                fun bind(item: Menu) {
                    binding.tvMenuName.text = item.name
                    binding.ivMenuImage.setImageResource(item.image)
                    binding.tvMenuPrice.text = item.price.toString()
                }
            }

    private val data = mutableListOf<Menu>()
    fun submitData(items: List<Menu>){
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(data[position])
    }
}