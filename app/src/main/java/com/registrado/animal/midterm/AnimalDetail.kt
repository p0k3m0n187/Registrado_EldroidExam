package com.registrado.animal.midterm


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.registrado.animal.midterm.databinding.ActivityAnimalDetailBinding

class AnimalDetail : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalParams = intent.getStringExtra("NAME_PARAMS")
        val detailParams = intent.getStringExtra("DETAIL_PARAMS")


        binding.nameAnimal.text = animalParams
        binding.detailAnimal.text = detailParams


        binding.blockButton.setOnClickListener {

            val blockedAnimalName = binding.nameAnimal.text.toString()

            val intent = Intent(this, BlockedAnimalActivity::class.java)

            // Add the blocked animal name as an extra
            intent.putExtra("BLOCKED_ANIMAL_NAME", blockedAnimalName)

            // Start the activity
            startActivity(intent)
        }
    }
}
