package com.example.maxig.entregable01android.Activitys;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.example.maxig.entregable01android.Fragments.FragmentAboutUs;
import com.example.maxig.entregable01android.Fragments.FragmentRecetas;
import com.example.maxig.entregable01android.Fragments.VistaPrincipal;
import com.example.maxig.entregable01android.R;


public class MainActivity extends AppCompatActivity  implements FragmentRecetas.EnviarDatos {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment,new VistaPrincipal()).commit();

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Recetas:
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment,new FragmentRecetas()).commit();
                        break;
                    case R.id.AboutUs:
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment,new FragmentAboutUs()).commit();
                        break;
                }
                drawerLayout.closeDrawers();
                return false;
            }
        });
    }


    @Override
    public void irAlDetalle(Integer posicionReceta) {
        Intent intent = new Intent (this,ActivityDetalleReceta.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActivityDetalleReceta.POSICION,posicionReceta);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
