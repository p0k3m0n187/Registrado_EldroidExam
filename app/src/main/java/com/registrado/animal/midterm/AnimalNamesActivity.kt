package com.registrado.animal.midterm


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.registrado.animal.midterm.databinding.ActivityAnimalNamesBinding

class AnimalNamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimalNamesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalNamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animallist = listOf(
            AdapterForAnimals.MyDataModel(
                "Alpaca",
                "Alpacas are raised for their soft and luxurious fleece (fiber). Each shearing produces roughly five to ten pounds of fleece per animal, per year. This fleece, often compared to cashmere, can be turned into a wide array of products from yarn and apparel to tapestries and blankets."
            ),
            AdapterForAnimals.MyDataModel(
                "Bear",
                "Alpacas are raised for their soft and luxurious fleece (fiber). Each shearing produces roughly five to ten pounds of fleece per animal, per"
            ),
            AdapterForAnimals.MyDataModel(
                "Cow",
                "Cows are four-footed and have a large body. It has two horns, two eyes plus two ears and one nose and a mouth. Cows are herbivorous animals. They have a lot of uses to mankind."
            ),
            AdapterForAnimals.MyDataModel(
                "Deer",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Eagle",
                "Eagles are large and powerfully built, and are often referred to as the king of all birds. Eagles have heavy heads and beaks, which are hooked for ripping flesh from prey. Their legs are muscular and their talons are strong, making them a deadly predator."
            ),
            AdapterForAnimals.MyDataModel(
                "Fish",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Goat",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Hound",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Insect",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Jackal",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Kagu",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Lady Bug",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Mantis",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Newt",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Orangotan",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Puffer Fish",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Quail",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Rattle Snake",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Sand Viper",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Tarantula",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Urial",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Viper",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Wabler",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Xerus",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Yak",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),
            AdapterForAnimals.MyDataModel(
                "Zebra",
                "Adult deer can measure between 31 and 40 inches tall at the shoulder, and weigh up to 300 pounds. Their coat is a reddish-brown during summer, and a duller grayish-brown during winter months. Their throats, inner ears, underparts, and the underside of their tails are white."
            ),

            )

        val adapter = AdapterForAnimals(animallist, ::onItemClick)
        with(binding.animalNameRecyclerView){
            layoutManager =LinearLayoutManager(this@AnimalNamesActivity)
            this.adapter = adapter
        }
        binding.manageBtn.setOnClickListener{
            val intent = Intent(this, BlockedAnimalActivity::class.java)
            startActivity(intent)
        }
    }
    private fun onItemClick(item: AdapterForAnimals.MyDataModel) {
        // Handle the item click here
        val intent = Intent(this, AnimalDetail::class.java).apply {
            putExtra("NAME_PARAMS",item.animal )
            putExtra("DETAIL_PARAMS", item.detail)
        }
        startActivity(intent)
    }
}