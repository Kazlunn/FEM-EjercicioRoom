package com.example.ejercicioroom.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.ejercicioroom.models.Result;

import java.util.List;

@Dao
public interface ResultDao {

    @Query("SELECT * FROM " + Result.TABLE_NAME)
    List<Result> getAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insert(Result... results);

    @Delete
    int[] deleteAll();

}
