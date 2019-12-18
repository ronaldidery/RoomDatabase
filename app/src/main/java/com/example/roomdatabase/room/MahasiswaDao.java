package com.example.roomdatabase.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MahasiswaDao {

    @Query("SELECT * FROM mahasiswa")
    List<Mahasiswa> getAll();

    @Query("SELECT * FROM mahasiswa WHERE nama LIKE :nama ")
    Mahasiswa findByName(String nama);

    @Insert
    void insertAll(Mahasiswa mahasiswa);

    @Delete
    void deleteMahasiswa (Mahasiswa mahasiswa);

    @Update
    int updateMahasiswa (Mahasiswa mahasiswa);

    @Delete
    public void deleteAll(Mahasiswa user1, Mahasiswa user2);

}
