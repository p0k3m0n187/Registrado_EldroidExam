package com.registrado.animal.midterm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.registrado.animal.midterm.databinding.BlockedAnimalLayoutBinding

class BlockedAdapter(private val blockedAnimals: MutableList<String>, private val onUnblockClick: (String) -> Unit) :
    RecyclerView.Adapter<BlockedAdapter.BlockedViewHolder>() {

    inner class BlockedViewHolder(private val binding: BlockedAnimalLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(animal: String) {
            binding.blockedAnimalName.text = animal

            binding.unblockButton.setOnClickListener {
                onUnblockClick(animal)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockedViewHolder {
        val binding = BlockedAnimalLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BlockedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BlockedViewHolder, position: Int) {
        holder.bind(blockedAnimals[position])
    }

    override fun getItemCount(): Int {
        return blockedAnimals.size
    }

    fun removeBlockedAnimal(animal: String) {
        blockedAnimals.remove(animal)
        notifyDataSetChanged()
    }

    fun addBlockedAnimal(animal: String) {
        blockedAnimals.add(animal)
        notifyDataSetChanged()
    }
}
