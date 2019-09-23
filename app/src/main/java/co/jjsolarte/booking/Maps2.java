package co.jjsolarte.booking;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button btnH,btnN,btnS,btnT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btnH=findViewById(R.id.tp1);
        btnN=findViewById(R.id.tp2);
        btnS=findViewById(R.id.tp3);
        btnT=findViewById(R.id.tp4);
    }

    public void onCambiarHibrido (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
    public void onCambiarNormal (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void onCambiarSatelital (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
    public void onCambiarTerreno (View view){
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
