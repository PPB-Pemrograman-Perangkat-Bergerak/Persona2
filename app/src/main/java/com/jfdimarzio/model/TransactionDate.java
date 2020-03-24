package com.jfdimarzio.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "judul_table")
public class TransactionDate {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "tanggal")

    private String date;

    public TransactionDate(@NonNull String word) {this.date = word;}


    public String getWord(){return this.date;}
}


