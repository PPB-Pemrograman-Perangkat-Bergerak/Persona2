package com.jfdimarzio.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "catatan_keuangan")

public class Amount {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "jumlah")

    private int jumlah;

    public Amount(@NonNull int jumlah) {this.jumlah = jumlah;}


    public int getJumlah(){return this.jumlah;}
}
