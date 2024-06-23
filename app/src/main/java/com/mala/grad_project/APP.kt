package com.mala.grad_project

import android.annotation.SuppressLint
import android.net.Uri
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import com.mala.grad_project.EditProfile.EditProfile
import com.mala.grad_project.data.model.updateProfile.Msg
import com.mala.grad_project.data.model.updateProfile.update_profile

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {

    val updateProfile1 = update_profile(
        msg = Msg(
            fname = "John",
            lname = "Doe",
            phone = "123-456-7890",
            img = Uri.parse("https://img-cdn.pixlr.com/image-generator/history/65bb506dcb310754719cf81f/ede935de-1138-4f66-8ed7-44bd16efc709/medium.webp")
        ),
        status = true,
        error_msg = ""
    )


    Scaffold {
        EditProfile(
            UpdateProfile = updateProfile1,
            onSave = { firstName, lastName, mobileNumber, photoUri ->
                println("Saving profile: First Name: $firstName, Last Name: $lastName, Mobile Number: $mobileNumber, Photo URI: $photoUri")

            }
        )
    }
}
