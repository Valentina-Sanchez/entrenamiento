package co.jjsolarte.booking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onAcercaDe(View view){
        Intent i = new Intent(this,AcercaDe.class);
        startActivity(i);
    }

    public void onReservas(View v){
        Intent i = new Intent(this,ContainerActivity.class);
        startActivity(i);
    }
    public void onMapas(View view){
        Intent i = new Intent(this, Maps.class);
        startActivity(i);
    }
}
