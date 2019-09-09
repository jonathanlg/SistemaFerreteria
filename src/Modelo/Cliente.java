package Modelo;

public class Cliente {
    
    private int codCliente;
    private String razonSocial;
    private String contacto;
    private int codVendedor;
    private String telefon;
    private String celu;
    private String fax;
    private int codRubro;
    private String ruc;
    private double limCuenta;
    private String direccion;
    private String email;
    private String web;
    private int codTrans;
    private int codProv;
    private int codZona;
    private double desc;
    private String tPago;
    private String osb;
    
    //Contructor
    public Cliente(int codCliente, String razonSocial, String contacto, int codVendedor, String telefon, String celu, String fax, int codRubro, String ruc, double limCuenta, String direccion, String email, String web, int codTrans, int codProv, int codZona, double desc, String tPago, String osb) {
        this.codCliente = codCliente;
        this.razonSocial = razonSocial;
        this.contacto = contacto;
        this.codVendedor = codVendedor;
        this.telefon = telefon;
        this.celu = celu;
        this.fax = fax;
        this.codRubro = codRubro;
        this.ruc = ruc;
        this.limCuenta = limCuenta;
        this.direccion = direccion;
        this.email = email;
        this.web = web;
        this.codTrans = codTrans;
        this.codProv = codProv;
        this.codZona = codZona;
        this.desc = desc;
        this.tPago = tPago;
        this.osb = osb;
    }
    

    //Constructor Vacio
    public Cliente() {
    }

    //Getter y Setter    
    public int getCodZona() {
        return codZona;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public String gettPago() {
        return tPago;
    }

    public void settPago(String tPago) {
        this.tPago = tPago;
    }
    
    public void setCodZona(int codZona) {
        this.codZona = codZona;
    }
    
    public String getCelu() {
        return celu;
    }

    public void setCelu(String celu) {
        this.celu = celu;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodProv() {
        return codProv;
    }

    public void setCodProv(int codProv) {
        this.codProv = codProv;
    }

    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }

    public int getCodTrans() {
        return codTrans;
    }

    public void setCodTrans(int codTrans) {
        this.codTrans = codTrans;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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

    public double getLimCuenta() {
        return limCuenta;
    }

    public void setLimCuenta(double limCuenta) {
        this.limCuenta = limCuenta;
    }

    public String getOsb() {
        return osb;
    }

    public void setOsb(String osb) {
        this.osb = osb;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
    
}
