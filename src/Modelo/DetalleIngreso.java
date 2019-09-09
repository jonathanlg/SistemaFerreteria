package Modelo;

public class DetalleIngreso {

    private int dgCodigo;
    private String dgDescripcion;

    /*Constructor Vacio*/
    public DetalleIngreso() {
    }

    /*Constructo Lleno*/
    public DetalleIngreso(int dgCodigo, String dgDescripcion) {
        this.dgCodigo = dgCodigo;
        this.dgDescripcion = dgDescripcion;
    }

    /*Getter y Setter*/
    public int getDgCodigo() {
        return dgCodigo;
    }

    public void setDgCodigo(int dgCodigo) {
        this.dgCodigo = dgCodigo;
    }

    public String getDgDescripcion() {
        return dgDescripcion;
    }

    public void setDgDescripcion(String dgDescripcion) {
        this.dgDescripcion = dgDescripcion;
    }

}
