package com.example.utstekber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list_buku;
    public final static String COVER =
            "com.example.android.utstekber.COVER";
    public final static String BACK =
            "com.example.android.utstekber.BACK";
    public final static String JUDUL =
            "com.example.android.utstekber.JUDUL";
    public final static String SINOPSIS =
            "com.example.android.utstekber.SINOPSIS";
    public final static String PUBLISH =
            "com.example.android.utstekber.PUBLISH";
    public final static String AUTHOR =
            "com.example.android.utstekber.AUTHOR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_buku = findViewById(R.id.list_buku);
        list_buku.setLayoutManager(new GridLayoutManager(this,2));
        list_buku.setAdapter(new BukuAdapter(this, getBuku()));

        ImageView profil = findViewById(R.id.profil_image);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

    }

    public List<Buku> getBuku(){

        List<Buku> data = new ArrayList<>();
        String[] judul = getResources().getStringArray(R.array.judul_buku_buku);
        String[] sinopsis = getResources().getStringArray(R.array.sinopsis_buku_buku);
        String[] publish = getResources().getStringArray(R.array.publish_buku_buku);
        String[] author = getResources().getStringArray(R.array.author_buku_buku);
        int i = 0;
        for (String j : judul){
            data.add(new Buku(getResources().getIdentifier("drawable/"+"cover"+(i+1),null,getPackageName()),
                    getResources().getIdentifier("drawable/"+"back"+(i+1),null,getPackageName()),
                    j,sinopsis[i],publish[i],author[i]));
            i++;
        }
        return data;
    }
}
