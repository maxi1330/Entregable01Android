package com.example.maxig.entregable01android.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maxig.entregable01android.R;
import com.example.maxig.entregable01android.Receta;

import java.util.List;

/**
 * Created by DH on 28/5/2018.
 */

public class AdapterListadoRecetas extends RecyclerView.Adapter {
    private List<Receta> listadoDeRecetas;
    private EscuchadorRecetas escuchadorRecetas;


    public AdapterListadoRecetas(List<Receta> listadoDeRecetas, EscuchadorRecetas escuchadorRecetas) {
        this.listadoDeRecetas = listadoDeRecetas;
        this.escuchadorRecetas = escuchadorRecetas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View celda =  layoutInflater.inflate(R.layout.celda_lista_recetas,parent,false);
        RecetasViewHolder recetasViewHolder = new RecetasViewHolder(celda);
        return recetasViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta receta = listadoDeRecetas.get(position);
        RecetasViewHolder recetasViewHolder = (RecetasViewHolder) holder;
        recetasViewHolder.agregarReceta(receta);
    }

    @Override
    public int getItemCount() {
        return listadoDeRecetas.size();
    }

    private class RecetasViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewReceta;
        private TextView textViewTituloReceta;

        public RecetasViewHolder(View itemView) {
            super(itemView);
            imageViewReceta = itemView.findViewById(R.id.imageViewRecetaCelda);
            textViewTituloReceta = itemView.findViewById(R.id.textViewTituloRecetaCelda);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    escuchadorRecetas.recetaSeleccionada(getAdapterPosition());
                }
            });
        }

        public void agregarReceta(Receta unaReceta){
            imageViewReceta.setImageResource(unaReceta.getFoto());
            textViewTituloReceta.setText(unaReceta.getTitulo());
        }
    }

    public interface EscuchadorRecetas{
        void recetaSeleccionada(Integer posicionReceta);
    }



}
