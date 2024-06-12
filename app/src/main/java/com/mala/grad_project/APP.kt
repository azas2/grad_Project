package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import com.mala.grad_project.EditProfile.EditProfile
import com.mala.grad_project.data.model.updateProfile.update_profile
import com.mala.grad_project.uitls.msg

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {
    val myUpdateProfile = update_profile(
        error_msg = "",
        msg = msg("John", "imageUri", "Doe", "123456789"),
        status = true
    )

    Scaffold {
        EditProfile(myUpdateProfile) { firstName, lastName, phone ->
            println("Profile saved: $firstName $lastName $phone")
            // Handle the save action (e.g., show a toast or update the UI)
        }
    }
}
