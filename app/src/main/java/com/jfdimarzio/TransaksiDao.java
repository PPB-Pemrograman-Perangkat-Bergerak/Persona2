package com.jfdimarzio;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.jfdimarzio.model.Title;
import com.jfdimarzio.model.Amount;
import com.jfdimarzio.model.Category;
import com.jfdimarzio.model.TransactionDate;

import java.util.List;

@Dao
public interface TransaksiDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertJudul(Title judul);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertJumlah(Amount jumlah);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertKategori(Category kategori);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertTanggal(TransactionDate tanggal);


    @Query("DELETE FROM catatan_keuangan")
    void deleteAll();

    @Query("SELECT * from catatan_keuangan")
    LiveData<List<Title>> getAlphabetizedWords();
}