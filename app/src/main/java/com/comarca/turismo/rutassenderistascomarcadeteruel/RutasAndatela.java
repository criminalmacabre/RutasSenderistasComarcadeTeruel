package com.comarca.turismo.rutassenderistascomarcadeteruel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RutasAndatela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas_andatela);
    }
    public void lanzaMapilla(View view){
        Intent intent = new Intent (this, SierraPalomera.class);
        startActivity(intent);
    }
}
