package com.example.ejercicioroom.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = Result.TABLE_NAME)
public class Result {

    public final static String TABLE_NAME = "results";

    @PrimaryKey(autoGenerate = true)
    private int uid;

    private int points;

    @ColumnInfo(name = "player_name")
    private String playerName;

    public Result(int uid, int points, String playerName) {
        this.uid = uid;
        this.points = points;
        this.playerName = playerName;
    }

    @Ignore
    public Result(int points, String playerName) {
        this.points = points;
        this.playerName = playerName;
    }

    public int getUid() {
        return uid;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Result{" +
                "uid=" + uid +
                ", points=" + points +
                ", playerName='" + playerName + '\'' +
                '}';
    }

}
