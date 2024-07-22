package com.example.bookshelfapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_detail")
data class BookDetail(
    /** 書籍詳細ID */
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    /** 書籍ID */
    val bookId:Int,
    /** ISBNコード */
    val isbn: String,
    /** サブタイトル */
    val subTitle: String,
    /** 出版予定日 */
    val publishDate: String,
    /** 出版日 */
    val publishedDate: String,
    // TODO: 画像ファイルをダウンロードし、ローカルに保存する必要がある
    /** 商品画像ファイル名1 */
    val imageFileName1: String,
    /** 画像ファイルパス1 */
    val imagePath1: String,
    /** 商品画像ファイル名2 */
    val imageFileName2: String,
    /** 画像ファイルパス2 */
    val imagePath2: String,
    /** 商品画像ファイル名3 */
    val imageFileName3: String,
    /** 画像ファイルパス3 */
    val imagePath3: String,
    /** API連携済みフラグ */
    val isSynced: Boolean,

)
