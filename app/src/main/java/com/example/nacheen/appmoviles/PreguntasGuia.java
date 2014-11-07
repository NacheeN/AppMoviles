package com.example.nacheen.appmoviles;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Gaston on 05/11/2014.
 */
public class PreguntasGuia extends ListFragment {

    private String[] preguntas = { "¿Como agregar un tema?", "¿Como buscar tema?", "¿Como agregar comentario?", "Uso de Widget" };
    private OnArticuloSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listapregunta_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), R.layout.preguntas_adapter,R.id.textView, preguntas));
    }


    public interface OnArticuloSelectedListener {
        public void onArticuloSelected(String str);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            listener = (OnArticuloSelectedListener) activity;
        } catch (ClassCastException e) {}
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        listener.onArticuloSelected(preguntas[position]);
    }
}
