package com.example.ejercicioroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ejercicioroom.models.Result;

public class MainActivity extends AppCompatActivity {

    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "app.db")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

        db.resultDao().insert(
                new Result(0, "UserName1"),
                new Result(10, "UserName2")
        );

        Log.i("MiW", "Results = " + db.resultDao().getAll());
    }

    protected void buttonOnClick(View view) {
        db.resultDao().deleteAll();
        Log.i("MiW", "Deleted all results db");
    }

}