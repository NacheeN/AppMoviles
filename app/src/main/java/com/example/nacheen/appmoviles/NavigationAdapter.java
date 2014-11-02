package com.example.nacheen.appmoviles;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gaston on 31/10/2014.
 */
public class NavigationAdapter extends BaseAdapter {

    private Activity activity;
    ArrayList<item_objct> arrayItems;

    public NavigationAdapter(Activity activity, ArrayList<item_objct> arrayItems) {
        super();
        this.activity = activity;
        this.arrayItems = arrayItems;
    }

    @Override
    public int getCount() {
        return arrayItems.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public static class Fila{
        TextView titulo_item;
        ImageView icono;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fila view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if (convertView==null){
            view = new Fila();
            item_objct itm=arrayItems.get(position);
            convertView = inflator.inflate(R.layout.item_menu, null);
            view.titulo_item= (TextView) convertView.findViewById(R.id.titulo_item);
            view.titulo_item.setText(itm.getTitulo());
            view.icono= (ImageView) convertView.findViewById(R.id.icon);
            view.icono.setImageResource(itm.getIcono());
            convertView.setTag(view);
        }
        else{
            view = (Fila) convertView.getTag();
        }

        return convertView;
    }

}
