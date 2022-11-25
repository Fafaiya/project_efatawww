package com.example.project_efatawww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Home(View view) {
        Intent intent = new Intent(MainActivity2.this, Home.class);
        startActivity(intent);
    }

    public void Help(View view) {
        Intent intent = new Intent(MainActivity2.this, Help.class);
        startActivity(intent);
    }

    public void Dokumentasi(View view) {
        Intent intent = new Intent(MainActivity2.this, Dokumentasi.class);
        startActivity(intent);
    }

    public void EDUKASI(View view) {
        Intent intent = new Intent (MainActivity2.this, Edukasi.class);
        startActivity(intent);
    }
}