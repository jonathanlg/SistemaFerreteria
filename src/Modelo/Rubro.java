package Modelo;

public class Rubro {
    
    private int codRubro;
    private String Rubro;

    //Constructor
    public Rubro(int codRubro, String Rubro) {
        this.codRubro = codRubro;
        this.Rubro = Rubro;
    }
    
    //Constructor Vacio
    public Rubro(){}
    
    //Getter y Setter
    public String getRubro() {
        return Rubro;
    }

    public void setRubro(String Rubro) {
        this.Rubro = Rubro;
    }

    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }
    
}
