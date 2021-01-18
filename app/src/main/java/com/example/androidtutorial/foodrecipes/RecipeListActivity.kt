package com.example.androidtutorial.foodrecipes

import android.os.Bundle
import android.view.View
import com.example.androidtutorial.R
import kotlinx.android.synthetic.main.activity_recipe_list.*

// Class shows activity_recipe_list and above it shows progress bar when btn_test is clicked
class RecipeListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        btn_test.setOnClickListener{
            if (mProgressBar.visibility == View.VISIBLE){
                showProgressBar(false)
            }
            else{
                showProgressBar(true)
            }
        }
    }
}