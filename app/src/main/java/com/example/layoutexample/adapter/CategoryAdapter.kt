package com.example.layoutexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RemoteViews.RemoteCollectionItems
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutexample.databinding.ItemCategoryBinding
import com.example.layoutexample.model.Category

class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    class CategoryViewHolder(private val binding: ItemCategoryBinding):
        RecyclerView.ViewHolder(binding.root) {
            fun bind(item: Category) {
                binding.tvCategoryName.text = item.name
                binding.ivCategoryImage.setImageResource(item.image)
            }
    }

    private val data = mutableListOf<Category>()
    fun submitData(items: List<Category>) {
        data.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    //menghitung ukuran/banyak data yang tampil
    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(data[position])
    }
}