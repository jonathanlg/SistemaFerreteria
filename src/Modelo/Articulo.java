package Modelo;

public class Articulo {

    private int codArticulo;
    private String descripcion;
    private int codMarca;
    private int codProveedor;
    private double efectivo;
    private double montoCalculado;
    private double tarjeta;
    private double costo;
    private String fecha;
    private int codUnidad;
    private int codRubro;
    private double stock;

    //Constructor sin la fotografia del articulo
    public Articulo(int codArticulo, String descripcion, int codMarca, int codProveedor, double efectivo, double montoCalculado, double tarjeta, double costo, String fecha, int codUnidad, int codRubro, double stock) {
        this.codArticulo = codArticulo;
        this.descripcion = descripcion;
        this.codMarca = codMarca;
        this.codProveedor = codProveedor;
        this.efectivo = efectivo;
        this.montoCalculado = montoCalculado;
        this.tarjeta = tarjeta;
        this.costo = costo;
        this.fecha = fecha;
        this.codUnidad = codUnidad;
        this.codRubro = codRubro;
        this.stock = stock;
    }

    //Constructor para actualizar stock
    public Articulo(int codArticulo, double stock) {
        this.codArticulo = codArticulo;
        this.stock = stock;
    }

    //Constructor Vacio
    public Articulo() {
    }

    //Getter y Setter
    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }

    public int getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(int codUnidad) {
        this.codUnidad = codUnidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoCalculado() {
        return montoCalculado;
    }

    public void setMontoCalculado(double montoCalculado) {
        this.montoCalculado = montoCalculado;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(double tarjeta) {
        this.tarjeta = tarjeta;
    }

}
