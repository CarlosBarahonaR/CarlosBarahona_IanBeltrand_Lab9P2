/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_ianbeltrand_lab9p2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Archivos implements Serializable {

    private String nombre;
    private String link;
    private String extension;
    private int tamaño;

    public Archivos(String nombre, String link, String extension, int tamaño) {
        this.nombre = nombre;
        this.link = link;
        this.extension = extension;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Archivos{" + "nombre=" + nombre + ", link=" + link + ", extension=" + extension + ", tama\u00f1o=" + tamaño + '}';
    }

}
