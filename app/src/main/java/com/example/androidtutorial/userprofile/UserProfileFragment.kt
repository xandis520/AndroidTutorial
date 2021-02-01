package com.example.androidtutorial.userprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.androidtutorial.R
import com.example.androidtutorial.userprofile.models.UserProfileViewModel


class UserProfileFragment : Fragment(R.layout.fragment_user_profile) {
    private val viewModel: UserProfileViewModel by viewModels()

}