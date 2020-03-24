package com.jfdimarzio.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "catatan_keuangan")

public class Title {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "judul_transaksi")

    private String judul_transaksi;

    public Title(@NonNull String judul_transaksi) {this.judul_transaksi = judul_transaksi;}


    public String getWord(){return this.judul_transaksi;}
}
