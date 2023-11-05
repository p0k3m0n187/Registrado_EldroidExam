package com.registrado.animal.midterm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.registrado.animal.midterm.databinding.AnimalLayoutBinding

class AdapterForAnimals(private var animallist: List<MyDataModel>, private val onItemClick: (MyDataModel) -> Unit) :
    RecyclerView.Adapter<AdapterForAnimals.MyViewHolder>() {

        data class MyDataModel(val animal: String, val detail: String)

        inner class MyViewHolder(private val binding: AnimalLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(item: MyDataModel) {
                with(binding) {
                    animalView.text = item.animal
                }

                binding.root.setOnClickListener {
                    onItemClick(item)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val binding = AnimalLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MyViewHolder(binding)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.bind(animallist[position])
        }

        override fun getItemCount(): Int {
            return animallist.size
        }
}