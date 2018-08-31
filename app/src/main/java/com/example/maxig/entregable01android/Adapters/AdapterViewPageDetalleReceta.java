package com.example.maxig.entregable01android.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.maxig.entregable01android.Fragments.FragmentDetalleReceta;
import com.example.maxig.entregable01android.Receta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DH on 1/6/2018.
 */

public class AdapterViewPageDetalleReceta extends FragmentStatePagerAdapter {

    private List<Fragment> lista = new ArrayList<>();

    public AdapterViewPageDetalleReceta(FragmentManager fm, List<Receta> listaDeRecetas) {
        super(fm);
        for (Receta unaReceta : listaDeRecetas  ) {
            lista.add(FragmentDetalleReceta.crearFragmentoDetalle(unaReceta));
        }
    }

    @Override
    public Fragment getItem(int position) {
        return lista.get(position);
    }

    @Override
    public int getCount() {
        return lista.size();
    }
}
