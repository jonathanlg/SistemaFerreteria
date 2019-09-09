package Modelo;

public class Provincia {
    
    private int codProvincia;
    private String provincia;
    
    //Constructor
    public Provincia(int codProvincia, String provincia) {
        this.codProvincia = codProvincia;
        this.provincia = provincia;
    }
    
    //Constructor Vacio
    public Provincia() {}
    
    //Getter y Setter
    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
}
