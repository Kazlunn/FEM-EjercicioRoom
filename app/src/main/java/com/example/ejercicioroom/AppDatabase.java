package com.example.ejercicioroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.ejercicioroom.daos.ResultDao;
import com.example.ejercicioroom.models.Result;

@Database(entities = {Result.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ResultDao resultDao();
}
