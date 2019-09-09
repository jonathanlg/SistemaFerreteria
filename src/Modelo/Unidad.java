package Modelo;

public class Unidad {
    
    private int codUnidad;
    private String unidad;
    
    //Constructor

    public Unidad(int codUnidad, String unidad) {
        this.codUnidad = codUnidad;
        this.unidad = unidad;
    }
    //Constructor Vacio

    public Unidad() {
    }
    
    //Getter y Setter

    public int getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(int codUnidad) {
        this.codUnidad = codUnidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
}
