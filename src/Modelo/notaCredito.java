package Modelo;

public class notaCredito {

    //Atributos
    private int codNotaCredito;
    private int codFactura;
    private int codCliente;
    private double descuento;
    private String fecha;
    private String hora;
    private double total;

    //Constructor Vacio
    public notaCredito() {
    }

    //Constructor LLeno
    public notaCredito(int notaCredito, int codFactura, int codCliente, double descuento, String fecha, double total) {
        this.codNotaCredito = notaCredito;
        this.codFactura = codFactura;
        this.codCliente = codCliente;
        this.descuento = descuento;
        this.fecha = fecha;
        this.total = total;
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

    public int getCodNotaCredito() {
        return codNotaCredito;
    }

    public void setCodNotaCredito(int notaCredito) {
        this.codNotaCredito = notaCredito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
