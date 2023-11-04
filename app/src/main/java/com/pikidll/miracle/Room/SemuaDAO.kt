package com.pikidll.miracle.Room

import androidx.room.*


@Dao
interface SemuaDAO {
    //baju
        @Insert
    fun simpan_baju (vararg baju: Baju)
    @Update
    fun ubah_baju (vararg baju: Baju)
    @Delete
    fun hapus_baju (vararg baju: Baju)
    @Query("Select * From Baju")
    fun tampil_baju () : List<Baju>

    //celana
    @Insert
    fun simpan_celana (vararg celana: Celana)
    @Update
    fun ubah_celana (vararg celana: Celana)
    @Delete
    fun hapus_celana (vararg celana: Celana)
    @Query("Select * From Celana")
    fun tampil_celana () : List<Celana>

}