package com.example.maxig.entregable01android.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maxig.entregable01android.R;
import com.example.maxig.entregable01android.Receta;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleReceta extends Fragment {

    private ImageView imageViewFotoReceta;
    private TextView textViewTituloReceta;
    private TextView textViewIngredientes;
    private TextView textViewPreparacion;


    public FragmentDetalleReceta() {
        // Required empty public constructor
    }

    static public FragmentDetalleReceta crearFragmentoDetalle(Receta unaReceta){
        FragmentDetalleReceta fragmentDetalleReceta = new FragmentDetalleReceta();
        Bundle unBundle = new Bundle();
        unBundle.putInt("FOTO",unaReceta.getFoto());
        unBundle.putString("TITULO",unaReceta.getTitulo());
        unBundle.putString("INGREDIENTES",unaReceta.getIngredientes());
        unBundle.putString("PREPARACION",unaReceta.getPreparacion());
        fragmentDetalleReceta.setArguments(unBundle);
        return fragmentDetalleReceta;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_receta, container, false);
        imageViewFotoReceta = view.findViewById(R.id.imageViewRecetaDetalle);
        textViewTituloReceta = view.findViewById(R.id.textViewTituloRecetaDetalle);
        textViewIngredientes = view.findViewById(R.id.textViewIngredientesDetalle);
        textViewPreparacion = view.findViewById(R.id.textViewPreparacionDetalle);

        Bundle bundle = getArguments();
        Integer imagenID = bundle.getInt("FOTO");
        String titulo = bundle.getString("TITULO");
        String ingredientes = bundle.getString("INGREDIENTES");
        String preparacion = bundle.getString("PREPARACION");

        imageViewFotoReceta.setImageResource(imagenID);
        textViewTituloReceta.setText(titulo);
        textViewIngredientes.setText(ingredientes);
        textViewPreparacion.setText(preparacion);

        return view;
    }

}
