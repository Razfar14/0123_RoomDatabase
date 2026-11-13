package com.example.roomdb.room;

import androidx.room.Database;

import kotlin.jvm.Volatile;

@Database(entities = [Siswa :: class], version = 1, exportSchema = false)
abstract class SiswaDatabase : RoomDatabase() {
    abstract fun siswaDao(): SiswaDao

    comapanion object {
        @Volatile
        private var INSTANCE: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseSiswa::class.java,
                    "siswa_database"
        }
    }
}