package com.rohan.rohanjuneja_jaikunwarsidhu_comp304lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private onClickInterface OnCInterface;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    List<LandmarkType> landmarkList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        landmarkList.add(new LandmarkType(getResources().getString(R.string.cat1)));
        landmarkList.add(new LandmarkType(getResources().getString(R.string.cat2)));
        landmarkList.add(new LandmarkType(getResources().getString(R.string.cat3)));
        setTitle("Tourist Spots");
        OnCInterface = s -> {
            switch (s) {
                case 0:
                    startActivity(new Intent(MainActivity.this, OldBuildingsActivity.class));
                    break;
                case 1:
                    startActivity(new Intent(MainActivity.this, MuseumsActivity.class));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this, AttractionsActivity.class));
                    break;
            }
        };
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ViewAdapter viewAdapter = new ViewAdapter(this, landmarkList, OnCInterface);
        recyclerView.setAdapter(viewAdapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}