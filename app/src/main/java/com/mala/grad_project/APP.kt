package com.mala.grad_project

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import com.mala.grad_project.EditProfile.EditProfile
import com.mala.grad_project.data.model.updateProfile.update_profile
import com.mala.grad_project.newCardExersize.NewCardExersize
import com.mala.grad_project.newCardExersize.TestViewNewCard
import com.mala.grad_project.uitls.msg

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun App() {

    Scaffold {
        TestViewNewCard()
    }
}
