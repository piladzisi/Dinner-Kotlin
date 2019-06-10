package com.annasteel.dinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


val foodList = arrayListOf<String>("Chinese", "Sushi", "Pizza", "Pasta", "Frozen Veggies", "Fish", "Bakery" )

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodtxt.text.toString()
            foodList.add(newFood)
            addFoodtxt.text.clear()
        }

    }
}
