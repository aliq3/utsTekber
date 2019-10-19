package com.example.utstekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBukuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);

        Intent intent = getIntent();
        ImageView cover = findViewById(R.id.cover_buku);
        int cov = intent.getIntExtra(MainActivity.COVER, 0);
        cover.setImageResource(cov);

        ImageView back = findViewById(R.id.back_buku);
        int b = intent.getIntExtra(MainActivity.BACK, 0);
        back.setImageResource(b);

        String title = intent.getStringExtra(MainActivity.JUDUL);
        TextView judul = findViewById(R.id.judul_buku);
        judul.setText(title);

        String sinop = intent.getStringExtra(MainActivity.SINOPSIS);
        TextView sinopsis = findViewById(R.id.sinopsis_buku);
        sinopsis.setText(sinop);

        String pub = intent.getStringExtra(MainActivity.PUBLISH);
        TextView publish = findViewById(R.id.publish_buku);
        publish.setText(pub);

        String aut = intent.getStringExtra(MainActivity.AUTHOR);
        TextView author = findViewById(R.id.author_buku);
        author.setText(aut);

    }
}
