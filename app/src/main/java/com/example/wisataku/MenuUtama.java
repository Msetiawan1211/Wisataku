package com.example.wisataku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MenuUtama extends AppCompatActivity {
    Button tombol,Kluar;
    Intent pindah;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        tombol = (Button) findViewById(R.id.wisata_alam);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(MenuUtama.this, WisataAlam.class);
                finish();
                startActivity(pindah);
            }
        });

        tombol = (Button) findViewById(R.id.wisata_edukasi);
        tombol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pindah = new Intent(MenuUtama.this, WisataEdukasi.class);
                finish();
                startActivity(pindah);
            }
        });
        tombol = (Button) findViewById(R.id.Wisata_religi);
        tombol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);
                pindah = new Intent(MenuUtama.this, WisataReligi.class);
                finish();
                startActivity(pindah);
                //membuat method tombol keluar dari aplikasi

            }
        });

        tombol = (Button) findViewById(R.id.Wisata_kuliner);
        tombol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);
                pindah = new Intent(MenuUtama.this, WisataKuliner.class);
                finish();
                startActivity(pindah);
                //membuat method tombol keluar dari aplikasi

            }
        });

        tombol = (Button) findViewById(R.id.About);
        tombol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, About.class);
                finish();
                startActivity(intent);
            }
        });
                Kluar = (Button) findViewById(R.id.Kluar);
                context = this;
                Kluar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setTitle("Alert Dialog")
                                .setMessage("Apakah Anda Yakin Ingin Keluar")
                                .setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MenuUtama.this, "Tombol oke di klik", Toast.LENGTH_SHORT).show();
                                        moveTaskToBack(true);
                                    }
                                })
                                .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(context,"Batal diklik",Toast.LENGTH_SHORT).show();
                                    }
                                });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                    }
                });


    }
}