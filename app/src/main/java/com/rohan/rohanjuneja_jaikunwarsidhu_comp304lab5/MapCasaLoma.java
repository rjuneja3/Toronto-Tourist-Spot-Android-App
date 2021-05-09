package com.rohan.rohanjuneja_jaikunwarsidhu_comp304lab5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapCasaLoma extends FragmentActivity {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_casa_loma);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapRegular);
        mapFragment.getMapAsync(onMapReadyCallback1());

        SupportMapFragment mapSatellite = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapSatellite);
        mapSatellite.getMapAsync(onMapReadyCallback2());


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    public OnMapReadyCallback onMapReadyCallback1(){
        return new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;

                LatLng casaLoma = new LatLng(43.6780, -79.4094);
                mMap.addMarker(new MarkerOptions().position(casaLoma).title("Marker in Casa Loma"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(casaLoma));

                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casaLoma,16));

            }
        };
    }public OnMapReadyCallback onMapReadyCallback2(){
        return new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;

                // Add a marker in Sydney and move the camera
                LatLng casaLoma = new LatLng(43.6780, -79.4094);
                mMap.addMarker(new MarkerOptions().position(casaLoma).title("Marker in Casa Loma"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(casaLoma));

                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(casaLoma,16));
                mMap.setMapType(mMap.MAP_TYPE_SATELLITE);
            }
        };
    }
}