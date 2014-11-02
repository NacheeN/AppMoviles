package com.example.nacheen.appmoviles;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gaston on 02/11/2014.
 */
public class GuiaFragment extends Fragment{

    public GuiaFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.guia, container, false);

        return rootView;
    }
}
