package com.example.nacheen.appmoviles;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gaston on 02/11/2014.
 */
public class AcercaFragment extends Fragment {

    public AcercaFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.acercade, container, false);

        return rootView;
    }

}
