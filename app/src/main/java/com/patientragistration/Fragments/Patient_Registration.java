package com.patientragistration.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patientragistration.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Patient_Registration extends Fragment {


    public Patient_Registration() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient__registration, container, false);
    }

}
