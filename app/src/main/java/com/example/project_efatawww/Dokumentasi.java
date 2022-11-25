package com.example.project_efatawww;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dokumentasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokumentasi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() { super.onBackPressed();
    }

    public void paud(View view) {
        Intent intent = new Intent(Dokumentasi.this, Paud.class);
        startActivity(intent);
    }

    public void modeling(View view) {
        Intent intent = new Intent(Dokumentasi.this, Modeling.class);
        startActivity(intent);
    }
}