package com.mala.grad_project.data.model

data class show_plans_exercises(
    val coach: Coach,
    val error_msg: String,
    val id: Int,
    val msg: List<Msg>,
    val `package`: Package,
    val payment_status: String,
    val status: Boolean
)