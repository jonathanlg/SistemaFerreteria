package Modelo;

public class zona {
    
    private int codZona;
    private String zona;
    
    //Constructor
    public zona(int codZona, String zona) {
        this.codZona = codZona;
        this.zona = zona;
    }
    
    //Constructor Vacio
    public zona() {}
    
    //Getter y Setter

    public int getCodZona() {
        return codZona;
    }

    public void setCodZona(int codZona) {
        this.codZona = codZona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
        
}
