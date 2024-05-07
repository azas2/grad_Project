package com.mala.grad_project.domain.Entity

data class Msg(
    val day: String,
    val exercises: List<Exercise>,
    val id: Int,
    val name: String
)