package com.patientragistration.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patientragistration.ConstantClasses.RevealLayout;
import com.patientragistration.R;


public class barcode_Scanner extends Fragment {

    RevealLayout mRevealLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_barcode__scanner, container, false);

        mRevealLayout=(RevealLayout)view.findViewById(R.id.barcode_scanner);

        mRevealLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                mRevealLayout.show();
            }
        }, 50);

        return view;
    }
}
