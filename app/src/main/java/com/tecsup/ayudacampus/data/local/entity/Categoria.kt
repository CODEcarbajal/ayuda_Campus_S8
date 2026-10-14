package com.tecsup.ayudacampus.data.local.entity

// [E] Categoria.kt - ejemplo resuelto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categorias")
data class Categoria(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val descripcion: String = ""
)
