package com.mala.grad_project


data class Coach(
        val coachName: String,
        val numberOfClients: Int,
        val rating: Float,
        val coachImageId: Int // Assuming this is the ID of the image resource for the coach
)