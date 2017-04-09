package com.patientragistration.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patientragistration.ConstantClasses.RevealLayout;
import com.patientragistration.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PatientRegistrationView extends Fragment {

    RevealLayout mRevealLayout;

    public PatientRegistrationView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =inflater.inflate(R.layout.fragment_patient_registration_view, container, false);


        mRevealLayout=(RevealLayout)view.findViewById(R.id.patient_registration_view);

        mRevealLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                mRevealLayout.show();
            }
        }, 50);



        return view;
    }

}
