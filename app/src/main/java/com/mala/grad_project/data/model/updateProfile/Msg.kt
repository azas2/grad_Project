package com.mala.grad_project.data.model.updateProfile

import android.net.Uri

data class Msg(
    val fname: String,
    val img: Uri,
    val lname: String,
    val phone: String
)