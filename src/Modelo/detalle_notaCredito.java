package Modelo;

public class detalle_notaCredito {
    
    //Atributos
    private int codNotaCredito;
    private int codArticulo;
    private int cantidad;
    private double precio;
    private double total;

    //Constructor Vacio
    public detalle_notaCredito() {}

    //Constructor LLeno
    public detalle_notaCredito(int codNotaCredito, int codArticulo, int cantidad, double precio, double total) {
        this.codNotaCredito = codNotaCredito;
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    //Constructor sin el codigo de la  nota de credito
    public detalle_notaCredito(int codArticulo, int cantidad, double precio, double total) {
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
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

    public int getCodNotaCredito() {
        return codNotaCredito;
    }

    public void setCodNotaCredito(int codNotaCredito) {
        this.codNotaCredito = codNotaCredito;
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
