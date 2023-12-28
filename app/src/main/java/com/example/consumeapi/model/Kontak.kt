package com.example.consumeapi.model

import kotlinx.serialization.Serializable

@Serializable
class Kontak(
    val id: Int,
    val email: String,
    val nama: String,
    val nohp: String,
)