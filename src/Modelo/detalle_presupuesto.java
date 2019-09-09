package Modelo;

public class detalle_presupuesto {

    private int codPresupuesto;
    private int codArticulo;
    private int cantidad;
    private double precio;
    private double monto;

    //Constructor Completo
    public detalle_presupuesto(int codPresupuesto, int codArticulo, int cantidad, double precio, double monto) {
        this.codPresupuesto = codPresupuesto;
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.monto = monto;
    }

    //Constructor sin el codigo del presupuesto
    public detalle_presupuesto(int codArticulo, int cantidad, double precio, double monto) {
        this.codArticulo = codArticulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.monto = monto;
    }

    //Constructor Vacio
    public detalle_presupuesto() {
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

    public int getCodPresupuesto() {
        return codPresupuesto;
    }

    public void setCodPresupuesto(int codPresupuesto) {
        this.codPresupuesto = codPresupuesto;
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
