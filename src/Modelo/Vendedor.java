package Modelo;

public class Vendedor {
    
    private int codVe;
    private String nombreV;
    private String direccion;
    private String telefono;
    private String celular;
    private double Sueldo;
    private int codProv;
    private int codZona;
    private double comision;
    private String email;
    public String Obs;

    //Constructor
    public Vendedor(int codVe, String nombreV, String direccion, String telefono, String celular, double Sueldo, int codProv, int codZona, double comision, String email, String Obs) {
        this.codVe = codVe;
        this.nombreV = nombreV;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.Sueldo = Sueldo;
        this.codProv = codProv;
        this.codZona = codZona;
        this.comision = comision;
        this.email = email;
        this.Obs = Obs;
    }
    

    //Constructor Vacio
    public Vendedor() {
    }

    //Getter y Setter
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodVe() {
        return codVe;
    }

    public void setCodVe(int codVe) {
        this.codVe = codVe;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getCodProv() {
        return codProv;
    }

    public void setCodProv(int codProv) {
        this.codProv = codProv;
    }

    public int getCodZona() {
        return codZona;
    }

    public void setCodZona(int codZona) {
        this.codZona = codZona;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
