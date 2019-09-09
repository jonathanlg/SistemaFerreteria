package Modelo;

public class Marca {
    
    private int codMarca;
    private String marca;

    //Constructor
    public Marca(int codMarca, String marca) {
        this.codMarca = codMarca;
        this.marca = marca;
    }
    
    //Constructor Vacio

    public Marca() {
    }
    
    //Getter y Setter

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
