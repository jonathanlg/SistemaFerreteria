package Modelo;

public class prespuesto {

    private int codPresupuesto;
    private int codeVendedor;
    private int codCliente;
    private double descuento;
    private String tipoPago;
    private String fecha;
    private String hora;
    private double total;
    private String indicador;

    //Constructor
    public prespuesto(int codPresupuesto, int codeVendedor, int codCliente, double descuento, String tipoPago, String fecha, double total) {
        this.codPresupuesto = codPresupuesto;
        this.codeVendedor = codeVendedor;
        this.codCliente = codCliente;
        this.descuento = descuento;
        this.tipoPago = tipoPago;
        this.fecha = fecha;
        this.total = total;
    }

    //Constructor Vacio
    public prespuesto() {
    }

    //Getter y Setter
    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodPresupuesto() {
        return codPresupuesto;
    }

    public void setCodPresupuesto(int codPresupuesto) {
        this.codPresupuesto = codPresupuesto;
    }

    public int getCodeVendedor() {
        return codeVendedor;
    }

    public void setCodeVendedor(int codeVendedor) {
        this.codeVendedor = codeVendedor;
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

    public void setTotal(double total) {
        this.total = total;
    }

}
