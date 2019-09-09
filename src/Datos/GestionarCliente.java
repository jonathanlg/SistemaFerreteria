package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Cliente;
import java.util.List;

public class GestionarCliente {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(cli_codigo) FROM clientes");
        return cod;
    }

    public static String addCliente(Cliente c) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO clientes  VALUES (");
        sql.append(c.getCodCliente()).append(",'");
        sql.append(c.getRazonSocial()).append("','");
        sql.append(c.getContacto()).append("',");
        sql.append(c.getCodVendedor()).append(",'");
        sql.append(c.getTelefon()).append("','");
        sql.append(c.getCelu()).append("','");
        sql.append(c.getFax()).append("',");
        sql.append(c.getCodRubro()).append(",'");
        sql.append(c.getRuc()).append("',");
        sql.append(c.getLimCuenta()).append(",'");
        sql.append(c.getDireccion()).append("', '");
        sql.append(c.getEmail()).append("','");
        sql.append(c.getWeb()).append("',");
        sql.append(c.getCodTrans()).append(",");
        sql.append(c.getCodProv()).append(",");
        sql.append(c.getCodZona()).append(",");
        sql.append(c.getDesc()).append(",'");
        sql.append(c.gettPago()).append("','");
        sql.append(c.getOsb()).append("','S')");
//        String sql = "INSERT INTO clientes  VALUES (" 
//                + c.getCodCliente() + ",'" 
//                + c.getRazonSocial() + "','"
//                + c.getContacto() + "'," 
//                + c.getCodVendedor() + ",'" 
//                + c.getTelefon() + "','"
//                + c.getCelu() + "','" 
//                + c.getFax() + "'," 
//                + c.getCodRubro() + ",'" 
//                + c.getRuc() + "',"
//                + c.getLimCuenta() + ",'" 
//                + c.getDireccion() + "', '" 
//                + c.getEmail() + "','"
//                + c.getWeb() + "'," 
//                + c.getCodTrans() + "," 
//                + c.getCodProv() + "," 
//                + c.getCodZona() + ","
//                + c.getDesc() + ",'" 
//                + c.gettPago() + "','" 
//                + c.getOsb() + "','S')";
        msg = Operacion.exeOperacion(sql
                .toString());
        return msg;
    }

    public static String actCliente(Cliente c) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE clientes SET cli_razonSocial='");
        sql.append(c.getRazonSocial()).append("', cli_contacto='");
        sql.append(c.getContacto()).append("',cli_vendedor=");
        sql.append(c.getCodVendedor()).append(", cli_telefono='");
        sql.append(c.getTelefon()).append("',cli_celular='");
        sql.append(c.getCelu()).append("', cli_fax='");
        sql.append(c.getFax()).append("',cli_rubro=");
        sql.append(c.getCodRubro()).append(", cli_limiteCuenta=");
        sql.append(c.getLimCuenta()).append(",cli_direccion='");
        sql.append(c.getDireccion()).append("', cli_email='");
        sql.append(c.getEmail()).append("',cli_web='");
        sql.append(c.getWeb()).append("', cli_transporte=");
        sql.append(c.getCodTrans()).append(",cli_provincia=");
        sql.append(c.getCodProv()).append(", cli_zona=");
        sql.append(c.getCodZona()).append(",cli_descuento=");
        sql.append(c.getDesc()).append(", cli_tipoPago='");
        sql.append(c.gettPago()).append("',cli_observacion='");
        sql.append(c.getOsb()).append("'  WHERE cli_codigo=");
        sql.append(c.getCodCliente()).append("");
//        String sql = "UPDATE clientes SET cli_razonSocial='"
//                + c.getRazonSocial() + "', cli_contacto='"
//                + c.getContacto() + "',cli_vendedor="
//                + c.getCodVendedor() + ", cli_telefono='"
//                + c.getTelefon() + "',cli_celular='"
//                + c.getCelu() + "', cli_fax='"
//                + c.getFax() + "',cli_rubro="
//                + c.getCodRubro() + ", cli_limiteCuenta="
//                + c.getLimCuenta() + ",cli_direccion='"
//                + c.getDireccion() + "', cli_email='"
//                + c.getEmail() + "',cli_web='"
//                + c.getWeb() + "', cli_transporte="
//                + c.getCodTrans() + ",cli_provincia="
//                + c.getCodProv() + ", cli_zona="
//                + c.getCodZona() + ",cli_descuento="
//                + c.getDesc() + ", cli_tipoPago='"
//                + c.gettPago() + "',cli_observacion='"
//                + c.getOsb() + "'  WHERE cli_codigo="
//                + c.getCodCliente() + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static String delCliente(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE clientes SET cli_indicador='N' WHERE cli_codigo = ");
        sql.append(cod).append("");
//        String sql = "UPDATE clientes SET cli_indicador='N' WHERE cli_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static Cliente busCliente(String cod) {
        Cliente c = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM clientes WHERE cli_codigo = ");
        sql.append(cod).append("");
//        String sql = "SELECT * FROM clientes WHERE cli_codigo = " + cod + "";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            c = new Cliente();
            c.setCodCliente(Integer.parseInt(filaObt[0].toString()));
            c.setRazonSocial(filaObt[1].toString());
            c.setContacto(filaObt[2].toString());
            c.setCodVendedor(Integer.parseInt(filaObt[3].toString()));
            c.setTelefon(filaObt[4].toString());
            c.setCelu(filaObt[5].toString());
            c.setFax(filaObt[6].toString());
            c.setCodRubro(Integer.parseInt(filaObt[7].toString()));
            c.setRuc(filaObt[8].toString());
            c.setLimCuenta(Double.parseDouble(filaObt[9].toString()));
            c.setDireccion(filaObt[10].toString());
            c.setEmail(filaObt[11].toString());
            c.setWeb(filaObt[12].toString());
            c.setCodTrans(Integer.parseInt(filaObt[13].toString()));
            c.setCodProv(Integer.parseInt(filaObt[14].toString()));
            c.setCodZona(Integer.parseInt(filaObt[15].toString()));
            c.setDesc(Double.parseDouble(filaObt[16].toString()));
            c.settPago(filaObt[17].toString());
            c.setOsb(filaObt[18].toString());
        } else {
            System.out.println("No encotrado");
        }
        return c;
    }

    public static Cliente busClienteRuc(String cod) {
        Cliente c = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM clientes WHERE cli_ruc LIKE '");
        sql.append(cod).append("%'");
//        String sql = "SELECT * FROM clientes WHERE cli_ruc LIKE '" + cod + "%'";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            c = new Cliente();
            c.setCodCliente(Integer.parseInt(filaObt[0].toString()));
            c.setRazonSocial(filaObt[1].toString());
            c.setContacto(filaObt[2].toString());
            c.setCodVendedor(Integer.parseInt(filaObt[3].toString()));
            c.setTelefon(filaObt[4].toString());
            c.setCelu(filaObt[5].toString());
            c.setFax(filaObt[6].toString());
            c.setCodRubro(Integer.parseInt(filaObt[7].toString()));
            c.setRuc(filaObt[8].toString());
            c.setLimCuenta(Double.parseDouble(filaObt[9].toString()));
            c.setDireccion(filaObt[10].toString());
            c.setEmail(filaObt[11].toString());
            c.setWeb(filaObt[12].toString());
            c.setCodTrans(Integer.parseInt(filaObt[13].toString()));
            c.setCodProv(Integer.parseInt(filaObt[14].toString()));
            c.setCodZona(Integer.parseInt(filaObt[15].toString()));
            c.setDesc(Double.parseDouble(filaObt[16].toString()));
            c.settPago(filaObt[17].toString());
            c.setOsb(filaObt[18].toString());
        } else {
            System.out.println("No encotrado");
        }
        return c;
    }

    public static List listClientes(String cod) {
        StringBuilder sql = new StringBuilder("SELECT clientes.cli_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("clientes.cli_contacto,");
        sql.append("vendedor.ven_nombre,");
        sql.append("clientes.cli_telefono,");
        sql.append("clientes.cli_celular,");
        sql.append("clientes.cli_fax,");
        sql.append("rubro.rub_nombre,");
        sql.append("clientes.cli_ruc,");
        sql.append("clientes.cli_limitecuenta,");
        sql.append("clientes.cli_direccion,");
        sql.append("clientes.cli_email,");
        sql.append("clientes.cli_web,");
        sql.append("transporte.tra_nombre,");
        sql.append("provincias.prv_nombre ");
        sql.append(" FROM clientes ");
        sql.append(" JOIN vendedor ON clientes.cli_vendedor = vendedor.ven_codigo ");
        sql.append(" JOIN rubro ON clientes.cli_rubro = rubro.rub_codigo ");
        sql.append(" JOIN transporte ON clientes.cli_transporte = transporte.tra_codigo ");
        sql.append(" JOIN provincias ON clientes.cli_provincia = provincias.prv_codigo AND clientes.cli_provincia = provincias.prv_codigo ");
        sql.append(" WHERE clientes.cli_indicador = 'S' ");
        sql.append("  ORDER BY ").append(cod).append("");
//        String sql = "SELECT clientes.cli_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    clientes.cli_contacto,"
//                + "    vendedor.ven_nombre,"
//                + "    clientes.cli_telefono,"
//                + "    clientes.cli_celular,"
//                + "    clientes.cli_fax,"
//                + "    rubro.rub_nombre,"
//                + "    clientes.cli_ruc,"
//                + "    clientes.cli_limitecuenta,"
//                + "    clientes.cli_direccion,"
//                + "    clientes.cli_email,"
//                + "    clientes.cli_web,"
//                + "    transporte.tra_nombre,"
//                + "    provincias.prv_nombre"
//                + "   FROM clientes"
//                + "   JOIN vendedor ON clientes.cli_vendedor = vendedor.ven_codigo"
//                + "   JOIN rubro ON clientes.cli_rubro = rubro.rub_codigo"
//                + "   JOIN transporte ON clientes.cli_transporte = transporte.tra_codigo"
//                + "   JOIN provincias ON clientes.cli_provincia = provincias.prv_codigo AND clientes.cli_provincia = provincias.prv_codigo"
//                + "  WHERE clientes.cli_indicador = 'S'"
//                + "  ORDER BY " + cod + "";
        return Operacion.getTabla(sql.toString());
    }

    public static List filRazonS(String cad) {
        StringBuilder sql = new StringBuilder("SELECT clientes.cli_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("clientes.cli_contacto,");
        sql.append("vendedor.ven_nombre,");
        sql.append("clientes.cli_telefono,");
        sql.append("clientes.cli_celular,");
        sql.append("clientes.cli_fax,");
        sql.append("rubro.rub_nombre,");
        sql.append("clientes.cli_ruc,");
        sql.append("clientes.cli_limitecuenta,");
        sql.append("clientes.cli_direccion,");
        sql.append("clientes.cli_email,");
        sql.append("clientes.cli_web,");
        sql.append("transporte.tra_nombre,");
        sql.append("provincias.prv_nombre ");
        sql.append(" FROM clientes ");
        sql.append(" JOIN vendedor ON clientes.cli_vendedor = vendedor.ven_codigo ");
        sql.append(" JOIN rubro ON clientes.cli_rubro = rubro.rub_codigo ");
        sql.append(" JOIN transporte ON clientes.cli_transporte = transporte.tra_codigo ");
        sql.append(" JOIN provincias ON clientes.cli_provincia = provincias.prv_codigo AND clientes.cli_provincia = provincias.prv_codigo ");
        sql.append("  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_razonsocial) LIKE '").append(cad).append("%'))");
//        String sq = "SELECT clientes.cli_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    clientes.cli_contacto,"
//                + "    vendedor.ven_nombre,"
//                + "    clientes.cli_telefono,"
//                + "    clientes.cli_celular,"
//                + "    clientes.cli_fax,"
//                + "    rubro.rub_nombre,"
//                + "    clientes.cli_ruc,"
//                + "    clientes.cli_limitecuenta,"
//                + "    clientes.cli_direccion,"
//                + "    clientes.cli_email,"
//                + "    clientes.cli_web,"
//                + "    transporte.tra_nombre,"
//                + "    provincias.prv_nombre"
//                + "   FROM ((((clientes"
//                + "   JOIN vendedor ON ((clientes.cli_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN rubro ON ((clientes.cli_rubro = rubro.rub_codigo)))"
//                + "   JOIN transporte ON ((clientes.cli_transporte = transporte.tra_codigo)))"
//                + "   JOIN provincias ON (((clientes.cli_provincia = provincias.prv_codigo) AND (clientes.cli_provincia = provincias.prv_codigo))))"
//                + "  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_razonsocial) LIKE '" + cad + "%'))";
        return Operacion.getTabla(sql.toString());
    }

    public static List filRuc(String cad) {
        StringBuilder sql = new StringBuilder("SELECT clientes.cli_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("clientes.cli_contacto,");
        sql.append("vendedor.ven_nombre,");
        sql.append("clientes.cli_telefono,");
        sql.append("clientes.cli_celular,");
        sql.append("clientes.cli_fax,");
        sql.append("rubro.rub_nombre,");
        sql.append("clientes.cli_ruc,");
        sql.append("clientes.cli_limitecuenta,");
        sql.append("clientes.cli_direccion,");
        sql.append("clientes.cli_email,");
        sql.append("clientes.cli_web,");
        sql.append("transporte.tra_nombre,");
        sql.append("provincias.prv_nombre ");
        sql.append(" FROM clientes ");
        sql.append(" JOIN vendedor ON clientes.cli_vendedor = vendedor.ven_codigo ");
        sql.append(" JOIN rubro ON clientes.cli_rubro = rubro.rub_codigo ");
        sql.append(" JOIN transporte ON clientes.cli_transporte = transporte.tra_codigo ");
        sql.append(" JOIN provincias ON clientes.cli_provincia = provincias.prv_codigo AND clientes.cli_provincia = provincias.prv_codigo ");
        sql.append("  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_ruc) LIKE '").append(cad).append("%'))");
//        String sq = "SELECT clientes.cli_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    clientes.cli_contacto,"
//                + "    vendedor.ven_nombre,"
//                + "    clientes.cli_telefono,"
//                + "    clientes.cli_celular,"
//                + "    clientes.cli_fax,"
//                + "    rubro.rub_nombre,"
//                + "    clientes.cli_ruc,"
//                + "    clientes.cli_limitecuenta,"
//                + "    clientes.cli_direccion,"
//                + "    clientes.cli_email,"
//                + "    clientes.cli_web,"
//                + "    transporte.tra_nombre,"
//                + "    provincias.prv_nombre"
//                + "   FROM ((((clientes"
//                + "   JOIN vendedor ON ((clientes.cli_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN rubro ON ((clientes.cli_rubro = rubro.rub_codigo)))"
//                + "   JOIN transporte ON ((clientes.cli_transporte = transporte.tra_codigo)))"
//                + "   JOIN provincias ON (((clientes.cli_provincia = provincias.prv_codigo) AND (clientes.cli_provincia = provincias.prv_codigo))))"
//                + "  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_ruc) LIKE '" + cad + "%'))";
        return Operacion.getTabla(sql.toString());
    }

    public static List filContacto(String cad) {
        StringBuilder sql = new StringBuilder("SELECT clientes.cli_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("clientes.cli_contacto,");
        sql.append("vendedor.ven_nombre,");
        sql.append("clientes.cli_telefono,");
        sql.append("clientes.cli_celular,");
        sql.append("clientes.cli_fax,");
        sql.append("rubro.rub_nombre,");
        sql.append("clientes.cli_ruc,");
        sql.append("clientes.cli_limitecuenta,");
        sql.append("clientes.cli_direccion,");
        sql.append("clientes.cli_email,");
        sql.append("clientes.cli_web,");
        sql.append("transporte.tra_nombre,");
        sql.append("provincias.prv_nombre ");
        sql.append(" FROM clientes ");
        sql.append(" JOIN vendedor ON clientes.cli_vendedor = vendedor.ven_codigo ");
        sql.append(" JOIN rubro ON clientes.cli_rubro = rubro.rub_codigo ");
        sql.append(" JOIN transporte ON clientes.cli_transporte = transporte.tra_codigo ");
        sql.append(" JOIN provincias ON clientes.cli_provincia = provincias.prv_codigo AND clientes.cli_provincia = provincias.prv_codigo ");
        sql.append("  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_contacto) LIKE '").append(cad).append("%'))");
//        String sq = "SELECT clientes.cli_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    clientes.cli_contacto,"
//                + "    vendedor.ven_nombre,"
//                + "    clientes.cli_telefono,"
//                + "    clientes.cli_celular,"
//                + "    clientes.cli_fax,"
//                + "    rubro.rub_nombre,"
//                + "    clientes.cli_ruc,"
//                + "    clientes.cli_limitecuenta,"
//                + "    clientes.cli_direccion,"
//                + "    clientes.cli_email,"
//                + "    clientes.cli_web,"
//                + "    transporte.tra_nombre,"
//                + "    provincias.prv_nombre"
//                + "   FROM ((((clientes"
//                + "   JOIN vendedor ON ((clientes.cli_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN rubro ON ((clientes.cli_rubro = rubro.rub_codigo)))"
//                + "   JOIN transporte ON ((clientes.cli_transporte = transporte.tra_codigo)))"
//                + "   JOIN provincias ON (((clientes.cli_provincia = provincias.prv_codigo) AND (clientes.cli_provincia = provincias.prv_codigo))))"
//                + "  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_contacto) LIKE '" + cad + "%'))";
        return Operacion.getTabla(sql.toString());
    }

    public static List filDireccion(String cad) {
        StringBuilder sql = new StringBuilder("SELECT clientes.cli_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("clientes.cli_contacto,");
        sql.append("vendedor.ven_nombre,");
        sql.append("clientes.cli_telefono,");
        sql.append("clientes.cli_celular,");
        sql.append("clientes.cli_fax,");
        sql.append("rubro.rub_nombre,");
        sql.append("clientes.cli_ruc,");
        sql.append("clientes.cli_limitecuenta,");
        sql.append("clientes.cli_direccion,");
        sql.append("clientes.cli_email,");
        sql.append("clientes.cli_web,");
        sql.append("transporte.tra_nombre,");
        sql.append("provincias.prv_nombre ");
        sql.append(" FROM clientes ");
        sql.append(" JOIN vendedor ON clientes.cli_vendedor = vendedor.ven_codigo ");
        sql.append(" JOIN rubro ON clientes.cli_rubro = rubro.rub_codigo ");
        sql.append(" JOIN transporte ON clientes.cli_transporte = transporte.tra_codigo ");
        sql.append(" JOIN provincias ON clientes.cli_provincia = provincias.prv_codigo AND clientes.cli_provincia = provincias.prv_codigo ");
        sql.append("  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_direccion) LIKE '").append(cad).append("%'))");
//        String sq = "SELECT clientes.cli_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    clientes.cli_contacto,"
//                + "    vendedor.ven_nombre,"
//                + "    clientes.cli_telefono,"
//                + "    clientes.cli_celular,"
//                + "    clientes.cli_fax,"
//                + "    rubro.rub_nombre,"
//                + "    clientes.cli_ruc,"
//                + "    clientes.cli_limitecuenta,"
//                + "    clientes.cli_direccion,"
//                + "    clientes.cli_email,"
//                + "    clientes.cli_web,"
//                + "    transporte.tra_nombre,"
//                + "    provincias.prv_nombre"
//                + "   FROM ((((clientes"
//                + "   JOIN vendedor ON ((clientes.cli_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN rubro ON ((clientes.cli_rubro = rubro.rub_codigo)))"
//                + "   JOIN transporte ON ((clientes.cli_transporte = transporte.tra_codigo)))"
//                + "   JOIN provincias ON (((clientes.cli_provincia = provincias.prv_codigo) AND (clientes.cli_provincia = provincias.prv_codigo))))"
//                + "  WHERE (((clientes.cli_indicador) = 'S') AND ((clientes.cli_direccion) LIKE '" + cad + "%'))";
        return Operacion.getTabla(sql.toString());
    }

}
