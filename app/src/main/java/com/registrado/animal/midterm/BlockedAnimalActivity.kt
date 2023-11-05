package com.registrado.animal.midterm

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.registrado.animal.midterm.databinding.ActivityBlockedAnimalBinding

class BlockedAnimalActivity : AppCompatActivity() {

    private lateinit var sharedPrefs: SharedPreferences
    private lateinit var binding: ActivityBlockedAnimalBinding
    private lateinit var blockedAdapter: BlockedAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlockedAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPrefs = getSharedPreferences("BlockedAnimals", Context.MODE_PRIVATE)

        val blockedAnimals = sharedPrefs.getStringSet("blockedAnimals", emptySet())?.toMutableList() ?: mutableListOf()

        blockedAdapter = BlockedAdapter(blockedAnimals) { animal ->
            val updatedBlockedAnimals = sharedPrefs.getStringSet("blockedAnimals", emptySet())?.toMutableSet()
            updatedBlockedAnimals?.remove(animal)
            sharedPrefs.edit().putStringSet("blockedAnimals", updatedBlockedAnimals).apply()
            blockedAdapter.removeBlockedAnimal(animal)
        }

        binding.recyclerViewBlockedAnimals.adapter = blockedAdapter
        binding.recyclerViewBlockedAnimals.layoutManager = LinearLayoutManager(this)

        // Retrieve the blocked animal name from the intent
        val blockedAnimalName = intent.getStringExtra("BLOCKED_ANIMAL_NAME")
        if (blockedAnimalName != null) {
            // Add the blocked animal to the list
            blockedAdapter.addBlockedAnimal(blockedAnimalName)

            // Save the updated list to SharedPreferences
            val updatedBlockedAnimals = sharedPrefs.getStringSet("blockedAnimals", emptySet())?.toMutableSet()
            updatedBlockedAnimals?.add(blockedAnimalName)
            sharedPrefs.edit().putStringSet("blockedAnimals", updatedBlockedAnimals).apply()
        }
    }
}
