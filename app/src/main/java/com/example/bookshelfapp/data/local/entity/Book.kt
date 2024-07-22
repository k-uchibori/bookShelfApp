package com.example.bookshelfapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *　書籍テーブル
 */
@Entity(tableName = "book")
data class Book (
    /** 書籍ID */
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    /** タイトル */
    val title: String,
    /** 著者ID */
    val authorId: Int,
    /** 出版社ID */
    val publisherId: Int,
)