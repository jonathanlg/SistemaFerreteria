package Modelo;

public class Retiro {

    private int reCodigo;
    private String reFecha;
    private int reDescripcion;
    private String reNombre;
    private double reImporte;

    /*Constructor Vacio*/
    public Retiro() {
    }

    /*Constructor Lleno*/
    public Retiro(String reFecha, int reDescripcion, String reNombre, double reImporte) {
        this.reFecha = reFecha;
        this.reDescripcion = reDescripcion;
        this.reNombre = reNombre;
        this.reImporte = reImporte;
    }

    /*Getter y Setter*/
    public int getReCodigo() {
        return reCodigo;
    }

    public void setReCodigo(int reCodigo) {
        this.reCodigo = reCodigo;
    }

    public String getReFecha() {
        return reFecha;
    }

    public void setReFecha(String reFecha) {
        this.reFecha = reFecha;
    }

    public int getReDescripcion() {
        return reDescripcion;
    }

    public void setReDescripcion(int reDescripcion) {
        this.reDescripcion = reDescripcion;
    }

    public String getReNombre() {
        return reNombre;
    }

    public void setReNombre(String reNombre) {
        this.reNombre = reNombre;
    }

    public double getReImporte() {
        return reImporte;
    }

    public void setReImporte(double reImporte) {
        this.reImporte = reImporte;
    }

}
