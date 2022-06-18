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
    private ArrayList<Archivos> archivos = new ArrayList();
    private ArrayList<Carpetas> carpetas = new ArrayList();

    public Carpetas(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
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
        return nombre;
    }

}
