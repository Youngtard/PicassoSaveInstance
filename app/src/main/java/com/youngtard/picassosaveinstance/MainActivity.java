package com.youngtard.picassosaveinstance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.youngtard.picassosaveinstance.adapters.ImagesAdapter;


public class MainActivity extends AppCompatActivity {

    RecyclerView mImagesRecycler;
    ImagesAdapter mImagesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImagesRecycler = findViewById(R.id.rv_images);

        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);

        mImagesRecycler.setLayoutManager(layoutManager);
        mImagesRecycler.setHasFixedSize(true);

        mImagesAdapter = new ImagesAdapter(20);

        mImagesRecycler.setAdapter(mImagesAdapter);



    }
}
