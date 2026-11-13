package com.example.roomdb.room;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
interface SiswaDao {
    @interface (onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}