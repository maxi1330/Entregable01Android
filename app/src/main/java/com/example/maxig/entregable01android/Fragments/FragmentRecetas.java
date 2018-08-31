package com.example.maxig.entregable01android.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maxig.entregable01android.Adapters.AdapterListadoRecetas;
import com.example.maxig.entregable01android.Hardcodeo;
import com.example.maxig.entregable01android.R;
import com.example.maxig.entregable01android.Receta;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecetas extends Fragment implements AdapterListadoRecetas.EscuchadorRecetas {
    private List<Receta> listadoDeRecetas;
    private EnviarDatos enviarDatos;
    private RecyclerView recyclerViewRecetas;
    private AdapterListadoRecetas adapter;


    public FragmentRecetas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recetas, container, false);
        listadoDeRecetas = Hardcodeo.cargarListaDeRecetas();
        recyclerViewRecetas = view.findViewById(R.id.recyclerViewListaRecetas);
        adapter = new AdapterListadoRecetas(listadoDeRecetas,this);
        recyclerViewRecetas.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerViewRecetas.setLayoutManager(layoutManager);

        setUpItemTouchHelper();

       return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.enviarDatos = (EnviarDatos) context;
    }

    @Override
    public void recetaSeleccionada(Integer posicionReceta) {
        enviarDatos.irAlDetalle(posicionReceta);
    }

    public interface EnviarDatos{
        void irAlDetalle(Integer posicionReceta);
    }


    private void setUpItemTouchHelper() {
        ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT) {

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                final int desde = viewHolder.getAdapterPosition ();
                final int aDonde = target.getAdapterPosition ();
                Receta unReceta = Hardcodeo.listadoDeRecetas.get(desde);            //Guardo la receta que voy a mover
                listadoDeRecetas.remove(desde);                                     //Borro la posicion que voy a mover
                listadoDeRecetas.add(aDonde,unReceta);                              //Agrego la receta que movi en la nueva posicion
                adapter.notifyItemMoved(desde,aDonde);
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                listadoDeRecetas.remove(viewHolder.getAdapterPosition());           //Borro de la lista de recetas la posicion seleccionada
                adapter.notifyDataSetChanged();                                     //Notifico el cambio
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerViewRecetas);
    }

}
