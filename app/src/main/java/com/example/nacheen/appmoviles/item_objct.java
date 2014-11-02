package com.example.nacheen.appmoviles;

/**
 * Created by Gaston on 31/10/2014.
 */
public class item_objct {
    private String titulo;
    private int icono;

    public item_objct(String titulo, int icono){
        this.titulo=titulo;
        this.icono=icono;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIcono() {
        return icono;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
