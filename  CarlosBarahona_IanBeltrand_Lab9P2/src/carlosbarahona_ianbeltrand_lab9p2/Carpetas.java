/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_ianbeltrand_lab9p2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Carpetas implements Serializable {

    private String nombre;
    private String link;
    private ArrayList<Archivos> archivos;
    private ArrayList<Carpetas> carpetas;

    public Carpetas(String nombre, String link, ArrayList<Archivos> archivos, ArrayList<Carpetas> carpetas) {
        this.nombre = nombre;
        this.link = link;
        this.archivos = archivos;
        this.carpetas = carpetas;
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

    public ArrayList<Archivos> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivos> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpetas> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpetas> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return "Carpetas{" + "nombre=" + nombre + ", link=" + link + ", archivos=" + archivos + ", carpetas=" + carpetas + '}';
    }

}
