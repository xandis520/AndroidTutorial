package com.example.androidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidtutorial.userprofile.UserProfileFragment
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment = UserProfileFragment()
        val secondFragment = SecondFragment()


//        Setting initial fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, firstFragment)
            commit()
        }

        btn_userprofile.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, firstFragment)
                //Cofanie do poprzedniego fragmentu
                addToBackStack(null)
                commit()
            }
        }

        btn_fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}