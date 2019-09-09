package Modelo;

public class Stock {
    
    private int cod;
    private double stock;

    //Constructor
    public Stock(int cod, double stock) {
        this.cod = cod;
        this.stock = stock;
    }

    //Constructor Vacio
    public Stock() {
    }

    //Getter y Setter
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
    
    
    
}
