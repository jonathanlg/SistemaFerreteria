package Modelo;

public class Caja {

    private int caId;
    private String fecha;
    private double caInicial;
    private double caFinal;
    private double caDiferencia;

    public Caja(String fecha, double caInicial, double caFinal, double caDiferencia) {
        this.fecha = fecha;
        this.caInicial = caInicial;
        this.caFinal = caFinal;
        this.caDiferencia = caDiferencia;
    }

    public int getCaId() {
        return caId;
    }

    public void setCaId(int caId) {
        this.caId = caId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCaInicial() {
        return caInicial;
    }

    public void setCaInicial(double caInicial) {
        this.caInicial = caInicial;
    }

    public double getCaFinal() {
        return caFinal;
    }

    public void setCaFinal(double caFinal) {
        this.caFinal = caFinal;
    }

    public double getCaDiferencia() {
        return caDiferencia;
    }

    public void setCaDiferencia(double caDiferencia) {
        this.caDiferencia = caDiferencia;
    }

}
