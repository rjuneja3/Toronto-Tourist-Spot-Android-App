package com.rohan.rohanjuneja_jaikunwarsidhu_comp304lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        setTitle("Museums");
    }
    public void RoyalMuseum(View view) {
        Intent intent1 = new Intent(this, MapRoyalMuseum.class);
        startActivity(intent1);
    }
    public void ArtGalleryMuseum(View view) {
        Intent intent1 = new Intent(this, MapArtGallery.class);
        startActivity(intent1);
    }
}