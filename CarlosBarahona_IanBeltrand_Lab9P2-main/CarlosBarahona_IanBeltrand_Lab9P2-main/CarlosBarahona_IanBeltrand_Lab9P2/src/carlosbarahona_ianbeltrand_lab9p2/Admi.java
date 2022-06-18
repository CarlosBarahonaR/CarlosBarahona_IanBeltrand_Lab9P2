package carlosbarahona_ianbeltrand_lab9p2;

public class Admi {
    
    //Atributos
    Carpetas MiUnidad = new Carpetas("MI_UNIDAD", "dive.google.com");
    Carpetas Destacados = new Carpetas("DESTACADOS", "dive.google.com");
    Carpetas Papelera = new Carpetas("PAPELERA", "dive.google.com");
    
    //Constructor y mutadores
    public Admi(){
        
    }

    public Carpetas getMiUnidad() {
        return MiUnidad;
    }

    public void setMiUnidad(Carpetas MiUnidad) {
        this.MiUnidad = MiUnidad;
    }

    public Carpetas getDestacados() {
        return Destacados;
    }

    public void setDestacados(Carpetas Destacados) {
        this.Destacados = Destacados;
    }

    public Carpetas getPapelera() {
        return Papelera;
    }

    public void setPapelera(Carpetas Papelera) {
        this.Papelera = Papelera;
    }
    
    //Funciones
    public Carpetas BuscarCarpeta(String nombre, Carpetas carpetaActual){
        Carpetas carpetaA = MiUnidad;
        
        if(nombre.equals(MiUnidad.getNombre())){
            return MiUnidad;
        }else{
            for (Carpetas carpeta : carpetaA.getCarpetas()) {

                if(carpeta.getNombre().equals(nombre)){
                    return carpeta;
                }else{
                    carpetaA = carpeta;
                    BuscarCarpeta(nombre, carpetaA);
                }

            }
        }
        
        return null;
    }
    
    public String GenerarDireccionCarpeta(String nombre, Carpetas padre, String MedioLink){
        String medioLink = MedioLink;
        
        Carpetas carpetaA = MiUnidad;
        
        if(nombre.equals(MiUnidad.getNombre())){
            return medioLink;
        }else{
            for (Carpetas carpeta : carpetaA.getCarpetas()) {

                if(carpeta.getNombre().equals(nombre)){
                    return medioLink;
                }else{
                    medioLink = medioLink + "/" + carpeta.getNombre();
                    carpetaA = carpeta;
                    GenerarDireccionCarpeta(nombre, carpetaA, medioLink);
                }

            }
        }
        
        return null;
    }
}
