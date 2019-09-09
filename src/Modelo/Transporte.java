package Modelo;

public class Transporte {
    
    private int codTransporte;
    private String transporte;

    //Constructor
    public Transporte(int codTransporte, String transporte) {
        this.codTransporte = codTransporte;
        this.transporte = transporte;
    }
    
    //Constructor Vacio
    public Transporte() {}
    
    //Getter y Setter
    public int getCodTransporte() {
        return codTransporte;
    }

    public void setCodTransporte(int codTransporte) {
        this.codTransporte = codTransporte;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    
}
