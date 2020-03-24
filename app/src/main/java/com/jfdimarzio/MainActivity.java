package com.jfdimarzio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText date;
    EditText money;
    Spinner  spinnerKategori;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "Activity 1 onCreate Invoked");
        Toast.makeText(this, "Activity 1 onCreate invoked", Toast.LENGTH_SHORT).show();

        spinnerKategori = findViewById(R.id.spinnerKategori);
        List<String> txtKategori = new ArrayList<>();
        txtKategori.add("-Pilih Kategori-");
        txtKategori.add("-Pemasukan-");
        txtKategori.add("-Pengeluaran-");

        ArrayAdapter<String> adapterKategori = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,txtKategori);
        adapterKategori.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKategori.setAdapter(adapterKategori);

        spinnerKategori.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String yourKategori= spinnerKategori.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClick(View view){
        date = (EditText) findViewById(R.id.textDate);
        editText =(EditText) findViewById(R.id.editText);
        money = (EditText) findViewById(R.id.textMoney);
        intent =new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("dateContainer", date.getText().toString());
        intent.putExtra("container",editText.getText().toString());
        intent.putExtra("moneyContainer",money.getText().toString());
        intent.putExtra("kategoriContainer",spinnerKategori.getSelectedItem().toString());
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        super.onResume();
        Log.d("lifecycle", "Activity 1 onStart invoked");
        Toast.makeText(this, "Activity 1 onStart invoked", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "Activity 1 onResume invoked");
        Toast.makeText(this, "Activity 1 onResume invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "Activity 1 onPause invoked");
        Toast.makeText(this, "Activity 1 onPouse invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "Activity 1 onStop invoked");
        Toast.makeText(this, "Activity 1 onStop invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "Activity 1 onRestart invoked");
        Toast.makeText(this, "Activity 1 onRestart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "Activity 1 onDestroy invoked");
        Toast.makeText(this, "Activity 1 onDestroy invoked", Toast.LENGTH_SHORT).show();

    }
}
