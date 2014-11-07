package com.example.nacheen.appmoviles;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Gaston on 05/11/2014.
 */
public class Contenedor_img_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.contenedor_img_fragment, container, false);

        Bundle bundle = getArguments();
        String recuperada = bundle.getString("str");

        TextView texto = (TextView) view.findViewById(R.id.texto);
        texto.setText("Ha seleccionado la opcion:" + "\n\n" + recuperada);

        return view;
    }

}
