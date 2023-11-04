package com.pikidll.miracle.Room

import android.widget.ImageView
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Celana (
    @PrimaryKey
    val id_celana: Int,
    val ukuran_celana: String,
    val jenis_celana: String,
    val stok_celana: Int,
    val harga_celana: Int,
    val nama_produk_celana: String,
    val gambar_celana: ImageView
        )