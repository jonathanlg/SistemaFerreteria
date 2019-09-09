package Modelo;

public class Motivo {
    
    private int codM;
    private String motivo;

    //Constructor
    public Motivo(int codM, String motivo) {
        this.codM = codM;
        this.motivo = motivo;
    }

    //Constructor Vacio
    public Motivo() {
    }

    //Getter y Setter
    public int getCodM() {
        return codM;
    }

    public void setCodM(int codM) {
        this.codM = codM;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
