package com.pikidll.miracle.Room

import android.widget.ImageView
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Baju (
    @PrimaryKey
    val id_baju: Int,
    val ukuran_baju: String,
    val jenis_baju: String,
    val stok_baju: Int,
    val nama_produk_baju:String,
    val harga_baju: Int,
    val gambar_baju : ImageView
        )