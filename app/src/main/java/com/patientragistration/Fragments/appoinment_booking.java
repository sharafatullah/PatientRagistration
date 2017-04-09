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
public class appoinment_booking extends Fragment {


    public appoinment_booking() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_appoinment_booking, container, false);
    }

}
