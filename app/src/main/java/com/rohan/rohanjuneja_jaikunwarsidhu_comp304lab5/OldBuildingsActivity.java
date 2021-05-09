package com.rohan.rohanjuneja_jaikunwarsidhu_comp304lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OldBuildingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_buildings);
        setTitle("Old Buildings");
    }

    public void GooderhamMap(View view) {
        Intent intent1 = new Intent(this, MapGooderham.class);
        startActivity(intent1);
    }
    public void CasaLomaMap(View view) {
        Intent intent1 = new Intent(this, MapCasaLoma.class);
        startActivity(intent1);
    }
}