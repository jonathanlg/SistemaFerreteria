package Modelo;

public class CategoriaCompra {
    
    private int codCat;
    private String categoria;

    //Constructor Vacio
    public CategoriaCompra() {
    }

    //Constructor
    public CategoriaCompra(int codCat, String categoria) {
        this.codCat = codCat;
        this.categoria = categoria;
    }

    //Getter Setter
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodCat() {
        return codCat;
    }

    public void setCodCat(int codCat) {
        this.codCat = codCat;
    }
    
}
