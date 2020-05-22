package Clases;

public class Cantante {
    private String nombre,disco;
    public Cantante(String nombre,String disco){
        this.nombre=nombre;
        this.disco=disco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
}
