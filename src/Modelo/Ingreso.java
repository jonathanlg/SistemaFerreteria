package Modelo;

public class Ingreso {

    private int ingCodigo;
    private String ingFecha;
    private int ingDescripcion;
    private int ingCliente;
    private double ingImporte;
    private String ingObservacion;

    /*Constructor Vacio*/
    public Ingreso() {
    }

    /*Constructor Lleno*/
    public Ingreso(String ingFecha, int ingDescripcion, int ingCliente, double ingImporte, String ingObservacion) {
        this.ingFecha = ingFecha;
        this.ingDescripcion = ingDescripcion;
        this.ingCliente = ingCliente;
        this.ingImporte = ingImporte;
        this.ingObservacion = ingObservacion;
    }

    /*Getter y Setter*/
    public int getIngCodigo() {
        return ingCodigo;
    }

    public void setIngCodigo(int ingCodigo) {
        this.ingCodigo = ingCodigo;
    }

    public String getIngFecha() {
        return ingFecha;
    }

    public void setIngFecha(String ingFecha) {
        this.ingFecha = ingFecha;
    }

    public int getIngDescripcion() {
        return ingDescripcion;
    }

    public void setIngDescripcion(int ingDescripcion) {
        this.ingDescripcion = ingDescripcion;
    }

    public int getIngCliente() {
        return ingCliente;
    }

    public void setIngCliente(int ingCliente) {
        this.ingCliente = ingCliente;
    }

    public double getIngImporte() {
        return ingImporte;
    }

    public void setIngImporte(double ingImporte) {
        this.ingImporte = ingImporte;
    }

    public String getIngObservacion() {
        return ingObservacion;
    }

    public void setIngObservacion(String ingObservacion) {
        this.ingObservacion = ingObservacion;
    }

}
