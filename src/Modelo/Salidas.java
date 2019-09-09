package Modelo;

public class Salidas {

    private int codSal;
    private String fecha;
    private String hora;
    private double monto;

    //Constructor
    public Salidas(int codSal, String fecha, double monto) {
        this.codSal = codSal;
        this.fecha = fecha;
        this.monto = monto;
    }

    //Constructor Vacio
    public Salidas() {
    }

    //Getter y Setter
    public int getCodSal() {
        return codSal;
    }

    public void setCodSal(int codSal) {
        this.codSal = codSal;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
