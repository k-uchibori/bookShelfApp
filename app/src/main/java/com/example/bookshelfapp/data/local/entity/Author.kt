package com.example.bookshelfapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "author")
data class Author(
    /** 著者ID */
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    /** 著者名 */
    val name: String,
    /** カナ名 */
    val kanaName: String,
)
