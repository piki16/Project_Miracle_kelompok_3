package com.pikidll.miracle.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database (entities = [Baju::class, Celana::class], version = 1, exportSchema = false)
abstract class DB_FASHION : RoomDatabase() {
    abstract fun tbbajudao() : SemuaDAO

    companion object{
        @Volatile
        private var Instance:DB_FASHION? = null
        private val lock = Any()

        operator fun invoke(context: Context) = Instance?: synchronized(lock){
            getDatabase(context).also{
                Instance
            }
        }
        private fun getDatabase(context: Context)= Room.databaseBuilder(
            context.applicationContext,
            DB_FASHION::class.java,
            "pt.miracle"
        ).build()
    }
}
