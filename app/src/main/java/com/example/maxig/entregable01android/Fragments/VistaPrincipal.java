package com.example.maxig.entregable01android.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maxig.entregable01android.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class VistaPrincipal extends Fragment {


    public VistaPrincipal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vista_principal, container, false);


        return view;
    }

}
