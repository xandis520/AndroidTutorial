package com.example.androidtutorial.foodrecipes

import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtutorial.R
import kotlinx.android.synthetic.main.activity_base.view.*

abstract class BaseActivity: AppCompatActivity() {

    lateinit var mProgressBar: ProgressBar

    override fun setContentView(layoutResID: Int) {
        val constraintLayout = layoutInflater.inflate(R.layout.activity_base, null)
        val frameLayout = constraintLayout.food_activity_content
        mProgressBar = constraintLayout.food_progress_bar
        layoutInflater.inflate(layoutResID, frameLayout, true)
        super.setContentView(constraintLayout)
    }

    fun showProgressBar(visibility: Boolean){
        mProgressBar.visibility = if (visibility) View.VISIBLE else View.INVISIBLE
    }
}