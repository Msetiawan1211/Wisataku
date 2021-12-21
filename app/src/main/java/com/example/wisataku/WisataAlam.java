package com.example.wisataku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WisataAlam extends AppCompatActivity {
    Button tombol,Kluar;
    Intent pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        tombol = (Button) findViewById(R.id.kembali);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(WisataAlam.this, MenuUtama.class);
                finish();
                startActivity(pindah);
            }
        });

    }
}