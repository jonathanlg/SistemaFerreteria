package Modelo;

public class DetalleGasto {

    private int dgCodigo;
    private String dgDescripcion;

    /*Constructor vacio*/
    public DetalleGasto() {
    }

    /*Constructor Lleno*/
    public DetalleGasto(int dgCodigo, String dgDescripcion) {
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
