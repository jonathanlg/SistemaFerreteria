package Modelo;

public class Imagen {

    private int imgCod;
    private String imgFondo;

    public Imagen() {
    }

    public Imagen(int imgCod, String imgFondo) {
        this.imgCod = imgCod;
        this.imgFondo = imgFondo;
    }

    public Imagen(String imgFondo) {
        this.imgFondo = imgFondo;
    }

    public int getImgCod() {
        return imgCod;
    }

    public void setImgCod(int imgCod) {
        this.imgCod = imgCod;
    }

    public String getImgFondo() {
        return imgFondo;
    }

    public void setImgFondo(String imgFondo) {
        this.imgFondo = imgFondo;
    }

}
