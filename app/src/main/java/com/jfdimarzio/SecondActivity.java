package com.jfdimarzio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
TextView textView2;
TextView textDate;
TextView textMoney;
TextView textKategori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView2=(TextView) findViewById(R.id.textView2);
        textView2.setText(getIntent().getStringExtra("container"));

        textDate=(TextView) findViewById(R.id.textDate);
        textDate.setText(getIntent().getStringExtra("dateContainer"));

        textMoney=(TextView) findViewById(R.id.textMoney);
        textMoney.setText(getIntent().getStringExtra("moneyContainer"));

        textKategori=(TextView) findViewById(R.id.textKategori);
        textKategori.setText(getIntent().getStringExtra("kategoriContainer"));
    }

    @Override
    protected void onStart() {
        super.onResume();
        Log.d("lifecycle", "Activity 2 onStart invoked");
        Toast.makeText(this, "Activity 2 onStart invoked", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "Activity 2 onResume invoked");
        Toast.makeText(this, "Activity 2 onResume invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "Activity 2 onPause invoked");
        Toast.makeText(this, "Activity 2 onPouse invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "Activity 2 onStop invoked");
        Toast.makeText(this, "Activity 2 onStop invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "Activity 2 onRestart invoked");
        Toast.makeText(this, "Activity 2 onRestart invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "Activity 2 onDestroy invoked");
        Toast.makeText(this, "Activity 2 onDestroy invoked", Toast.LENGTH_SHORT).show();

    }


}





