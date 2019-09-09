package Modelo;

public class DetalleFactura {

    private int codFactura;
    private int codArticulo;
    private int cantidad;
    private double precio;
    private double total;

    //Contructor Completo
    public DetalleFactura(int codFactura, int codArticulo, int cantidad, double precio, double total) {
        this.codFactura = codFactura;
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    //Constructor sin codigo de Factura
    public DetalleFactura(int codArticulo, int cantidad, double precio, double total) {
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    //Constructor Vacio
    public DetalleFactura() {
    }

    //Getter y Setter
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
