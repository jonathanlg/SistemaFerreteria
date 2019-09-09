package Modelo;

public class Factura {

    private int codFactura;
    private int codCliente;
    private int codVendedor;
    private double descuento;
    private String tipoPago;
    private String fecha;
    private String hora;
    private double neto;
    private double total;

    //Contructor
    public Factura(int codFactura, int codCliente, int codVendedor, double descuento, String tipoPago, String fecha, double neto, double total) {
        this.codFactura = codFactura;
        this.codCliente = codCliente;
        this.codVendedor = codVendedor;
        this.descuento = descuento;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
        this.neto = neto;
        this.total = total;
    }

    //Constructor vacio
    public Factura() {
    }

    //Getter y Setter
    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getTotal() {
        return total;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
