package com.rohan.rohanjuneja_jaikunwarsidhu_comp304lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        setTitle("Attractions");
    }
    public void CNTowerMap(View view) {
        Intent intent1 = new Intent(this, MapCNTower.class);
        startActivity(intent1);
    }
    public void RipleyAquaMap(View view) {
        Intent intent1 = new Intent(this, MapRipleyAqua.class);
        startActivity(intent1);
    }
}