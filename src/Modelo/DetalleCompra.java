package Modelo;

public class DetalleCompra {
    
    private int codArticulo;
    private int codCompra;
    private int cant;
    private double precio;
    private double monto;
    
    //Constructor sin codigo de Salida
    public DetalleCompra(int codArticulo, int cant, double precio, double monto) {
        this.codArticulo = codArticulo;
        this.cant = cant;
        this.precio = precio;
        this.monto = monto;
    }
    

    //Constructor Completo
    public DetalleCompra(int codArticulo, int codCompra, int cant, double precio, double monto) {
        this.codArticulo = codArticulo;
        this.codCompra = codCompra;
        this.cant = cant;
        this.precio = precio;
        this.monto = monto;
    }

    //Constructor Vacio
    public DetalleCompra() {
    }
    
    //Getter y Setter
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
