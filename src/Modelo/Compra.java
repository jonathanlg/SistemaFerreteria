package Modelo;

public class Compra {

    private int codCompra;
    private int codProveedor;
    private int categoria;
    private String condPago;
    private String fecha;
    private double total;

    //Constructor
    public Compra(int codCompra, int codProveedor, int categoria, String condPago, String fecha, double total) {
        this.codCompra = codCompra;
        this.codProveedor = codProveedor;
        this.categoria = categoria;
        this.condPago = condPago;
        this.fecha = fecha;
        this.total = total;
    }

    //Constructor Vacio
    public Compra() {
    }

    //Getter y Setter
    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getCondPago() {
        return condPago;
    }

    public void setCondPago(String condPago) {
        this.condPago = condPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

}
