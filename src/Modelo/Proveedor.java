package Modelo;

public class Proveedor {
    
    private int codP;
    private String razoS;
    private String Ruc;
    private String contac;
    private String celu;
    private String telef;
    private String fax;
    private String direccion;
    private int codProvincia;
    private String email;
    private String web;
    private String obs;
    
    //Constructor
    public Proveedor(int codP, String razoS, String Ruc, String contac, String celu, String telef, String fax, String direccion, int codProvincia, String email, String web, String obs) {
        this.codP = codP;
        this.razoS = razoS;
        this.Ruc = Ruc;
        this.contac = contac;
        this.celu = celu;
        this.telef = telef;
        this.fax = fax;
        this.direccion = direccion;
        this.codProvincia = codProvincia;
        this.email = email;
        this.web = web;
        this.obs = obs;
    }
    
    //Constructor Vacio
    public Proveedor() {}
    
    //Getter y Setter
    public String getCelu() {
        return celu;
    }

    public void setCelu(String celu) {
        this.celu = celu;
    }

    public int getCodP() {
        return codP;
    }

    public void setCodP(int codP) {
        this.codP = codP;
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getContac() {
        return contac;
    }

    public void setContac(String contac) {
        this.contac = contac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getRazoS() {
        return razoS;
    }

    public void setRazoS(String razoS) {
        this.razoS = razoS;
    }
    
    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }
    
}
