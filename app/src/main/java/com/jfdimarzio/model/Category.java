package com.jfdimarzio.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "catatan_keuangan")

public class Category {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "kategori")

    private String kategori;

    public Category(@NonNull String word) {this.kategori = word;}


    public String getKategori(){return this.kategori;}
}
