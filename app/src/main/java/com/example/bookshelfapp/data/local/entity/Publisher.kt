package com.example.bookshelfapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "publisher")
data class Publisher(
    /** 出版社ID */
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    /** 出版社名 */
    val name: String,
)
