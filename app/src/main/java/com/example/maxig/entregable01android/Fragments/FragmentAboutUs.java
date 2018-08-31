package com.example.maxig.entregable01android.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.maxig.entregable01android.Activitys.MainActivity;
import com.example.maxig.entregable01android.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAboutUs extends Fragment {


    public FragmentAboutUs() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        return view;
    }


}
