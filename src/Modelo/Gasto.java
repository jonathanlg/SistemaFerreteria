package Modelo;

public class Gasto {

    private int gaCodigo;
    private String gaFecha;
    private int gaDescripcion;
    private String gaNombre;
    private double gaImporte;
    private String gaObservacion;

    /*Constructo vacio*/
    public Gasto() {
    }

    /*Constructor Lleno*/
    public Gasto(String gaFecha, int gaDescripcion, String gaNombre, double gaImporte, String gaObservacion) {
        this.gaFecha = gaFecha;
        this.gaDescripcion = gaDescripcion;
        this.gaNombre = gaNombre;
        this.gaImporte = gaImporte;
        this.gaObservacion = gaObservacion;
    }

    /*Getter y Setter*/
    public int getGaCodigo() {
        return gaCodigo;
    }

    public void setGaCodigo(int gaCodigo) {
        this.gaCodigo = gaCodigo;
    }

    public String getGaFecha() {
        return gaFecha;
    }

    public void setGaFecha(String gaFecha) {
        this.gaFecha = gaFecha;
    }

    public int getGaDescripcion() {
        return gaDescripcion;
    }

    public void setGaDescripcion(int gaDescripcion) {
        this.gaDescripcion = gaDescripcion;
    }

    public String getGaNombre() {
        return gaNombre;
    }

    public void setGaNombre(String gaNombre) {
        this.gaNombre = gaNombre;
    }

    public double getGaImporte() {
        return gaImporte;
    }

    public void setGaImporte(double gaImporte) {
        this.gaImporte = gaImporte;
    }

    public String getGaObservacion() {
        return gaObservacion;
    }

    public void setGaObservacion(String gaObservacion) {
        this.gaObservacion = gaObservacion;
    }

}
