package com.example.maxig.entregable01android.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.maxig.entregable01android.Adapters.AdapterViewPageDetalleReceta;
import com.example.maxig.entregable01android.R;
import com.example.maxig.entregable01android.Hardcodeo;

public class ActivityDetalleReceta extends AppCompatActivity {

    public static final String POSICION = "posicion";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);

        Intent unIntent = getIntent();
        Bundle bundle = unIntent.getExtras();
        Integer posicion = bundle.getInt(POSICION);

        //Toast.makeText(this,String.valueOf(posicion), Toast.LENGTH_SHORT).show();

        FragmentManager fragmentManager = getSupportFragmentManager();
        ViewPager viewPager = findViewById(R.id.viewPager);

        AdapterViewPageDetalleReceta viewPagerAdapter = new AdapterViewPageDetalleReceta(fragmentManager, Hardcodeo.listadoDeRecetas );
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(posicion);

    }

}
