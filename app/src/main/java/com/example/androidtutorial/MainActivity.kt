package com.example.androidtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidtutorial.foodrecipes.RecipeListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_calendar.setOnClickListener{
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_calculator.setOnClickListener{
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_recycler.setOnClickListener{
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_foodrecipes.setOnClickListener{
            val intent = Intent(this, RecipeListActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}