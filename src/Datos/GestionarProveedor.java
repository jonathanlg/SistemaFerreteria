package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Proveedor;
import java.util.List;

public class GestionarProveedor {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(pro_codigo) FROM proveedor");
        return cod;
    }

    public static String addProveedor(Proveedor p) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO proveedor  VALUES (");
        sql.append(p.getCodP()).append(",'");
        sql.append(p.getRazoS()).append("','");
        sql.append(p.getRuc()).append("','");
        sql.append(p.getContac()).append("','");
        sql.append(p.getCelu()).append("','");
        sql.append(p.getTelef()).append("','");
        sql.append(p.getFax()).append("','");
        sql.append(p.getDireccion()).append("',");
        sql.append(p.getCodProvincia()).append(",'");
        sql.append(p.getEmail()).append("','");
        sql.append(p.getWeb()).append("','");
        sql.append(p.getObs()).append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO proveedor  VALUES (" 
//                + p.getCodP() + ",'" 
//                + p.getRazoS() + "','" 
//                + p.getRuc() + "','" 
//                + p.getContac() + "','" 
//                + p.getCelu() + "','" 
//                + p.getTelef() + "','" 
//                + p.getFax() + "','" 
//                + p.getDireccion() + "'," 
//                + p.getCodProvincia() + ",'" 
//                + p.getEmail() + "','" 
//                + p.getWeb() + "', '" 
//                + p.getObs() + "','S')");
        return msg;
    }

    public static String actProveedor(Proveedor p) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE proveedor SET pro_razonSocial='").append(p.getRazoS());
        sql.append("',pro_ruc='").append(p.getRuc());
        sql.append("',pro_contacto='").append(p.getContac());
        sql.append("',pro_celular='").append(p.getCelu());
        sql.append("',pro_telefono='").append(p.getTelef());
        sql.append("',pro_fax='").append(p.getFax());
        sql.append("',pro_direccion='").append(p.getDireccion());
        sql.append("',pro_provincia=").append(p.getCodProvincia());
        sql.append(",pro_email='").append(p.getEmail());
        sql.append("',pro_web='").append(p.getWeb());
        sql.append("', pro_observacion='").append(p.getObs());
        sql.append("' WHERE pro_codigo=").append(p.getCodP()).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE proveedor SET pro_razonSocial='" + p.getRazoS() 
//                + "',pro_ruc='" + p.getRuc() 
//                + "',pro_contacto='" + p.getContac() 
//                + "',pro_celular='" + p.getCelu() 
//                + "',pro_telefono='" + p.getTelef() 
//                + "',pro_fax='" + p.getFax() 
//                + "',pro_direccion='" + p.getDireccion() 
//                + "',pro_provincia=" + p.getCodProvincia() 
//                + ",pro_email='" + p.getEmail() 
//                + "',pro_web='" + p.getWeb() 
//                + "', pro_observacion='" + p.getObs() 
//                + "' WHERE pro_codigo=" + p.getCodP() + "");
        return msg;
    }

    public static Proveedor busProveedor(String cod) {
        Proveedor p = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM proveedor WHERE pro_codigo = ");
        sql.append(cod).append("");
//        String sql = "SELECT * FROM proveedor WHERE pro_codigo = " + cod + "";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            p = new Proveedor();
            p.setCodP(Integer.parseInt(filaObt[0].toString()));
            p.setRazoS(filaObt[1].toString());
            p.setRuc(filaObt[2].toString());
            p.setContac(filaObt[3].toString());
            p.setCelu(filaObt[4].toString());
            p.setTelef(filaObt[5].toString());
            p.setFax(filaObt[6].toString());
            p.setDireccion(filaObt[7].toString());
            p.setCodProvincia(Integer.parseInt(filaObt[8].toString()));
            p.setEmail(filaObt[9].toString());
            p.setWeb(filaObt[10].toString());
            p.setObs(filaObt[11].toString());
        } else {
            System.out.println("No encontrado");
        }
        return p;
    }

    public static List listProveedor(String cod) {
        StringBuilder sql = new StringBuilder(" SELECT proveedor.pro_codigo, ");
        sql.append("proveedor.pro_razonsocial, ");
        sql.append("proveedor.pro_contacto, ");
        sql.append("proveedor.pro_celular, ");
        sql.append("proveedor.pro_telefono, ");
        sql.append("proveedor.pro_fax, ");
        sql.append("proveedor.pro_direccion, ");
        sql.append("provincias.prv_nombre, ");
        sql.append("proveedor.pro_email, ");
        sql.append("proveedor.pro_web ");
        sql.append("FROM (proveedor ");
        sql.append("JOIN provincias ON ((proveedor.pro_provincia = provincias.prv_codigo)))  ");
        sql.append("WHERE proveedor.pro_indicador = 'S' ");
        sql.append("  ORDER BY ").append(cod).append("");

//        String sql = " SELECT proveedor.pro_codigo,"
//                + "    proveedor.pro_razonsocial,"
//                + "    proveedor.pro_contacto,"
//                + "    proveedor.pro_celular,"
//                + "    proveedor.pro_telefono,"
//                + "    proveedor.pro_fax,"
//                + "    proveedor.pro_direccion,"
//                + "    provincias.prv_nombre,"
//                + "    proveedor.pro_email,"
//                + "    proveedor.pro_web"
//                + "   FROM (proveedor"
//                + "   JOIN provincias ON ((proveedor.pro_provincia = provincias.prv_codigo)))  "
//                + "   WHERE proveedor.pro_indicador = 'S' "
//                + "  ORDER BY " + cod + "";
        return Operacion.getTabla(sql.toString());
    }

    public static String delProveedor(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE proveedor SET pro_indicador='N' WHERE pro_codigo = ");
        sql.append(cod).append("");
        //        String sql = "UPDATE proveedor SET pro_indicador='N' WHERE pro_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static List filRazonS(String cod) {
        StringBuilder sql = new StringBuilder("SELECT proveedor.pro_codigo,");
        sql.append("proveedor.pro_razonsocial,");
        sql.append("proveedor.pro_contacto,");
        sql.append("proveedor.pro_celular,");
        sql.append("proveedor.pro_telefono,");
        sql.append("proveedor.pro_fax,");
        sql.append("proveedor.pro_direccion,");
        sql.append("provincias.prv_nombre,");
        sql.append("proveedor.pro_email,");
        sql.append("proveedor.pro_web ");
        sql.append("FROM (proveedor ");
        sql.append("JOIN provincias ON ((proveedor.pro_provincia = provincias.prv_codigo))) ");
        sql.append(" WHERE (((proveedor.pro_indicador) = 'S') AND ((proveedor.pro_razonsocial) LIKE '");
        sql.append(cod).append("%'))");
//        String sql = "SELECT proveedor.pro_codigo,"
//                + "    proveedor.pro_razonsocial,"
//                + "    proveedor.pro_contacto,"
//                + "    proveedor.pro_celular,"
//                + "    proveedor.pro_telefono,"
//                + "    proveedor.pro_fax,"
//                + "    proveedor.pro_direccion,"
//                + "    provincias.prv_nombre,"
//                + "    proveedor.pro_email,"
//                + "    proveedor.pro_web"
//                + "   FROM (proveedor"
//                + "   JOIN provincias ON ((proveedor.pro_provincia = provincias.prv_codigo)))"
//                + "  WHERE (((proveedor.pro_indicador) = 'S') AND ((proveedor.pro_razonsocial) ILIKE '" + cod + "%'))";
        return Operacion.getTabla(sql.toString());
    }

    public static List filContacto(String cod) {
        StringBuilder sql = new StringBuilder("SELECT proveedor.pro_codigo,");
        sql.append("proveedor.pro_razonsocial,");
        sql.append("proveedor.pro_contacto,");
        sql.append("proveedor.pro_celular,");
        sql.append("proveedor.pro_telefono,");
        sql.append("proveedor.pro_fax,");
        sql.append("proveedor.pro_direccion,");
        sql.append("provincias.prv_nombre,");
        sql.append("proveedor.pro_email,");
        sql.append("proveedor.pro_web ");
        sql.append(" FROM (proveedor ");
        sql.append(" JOIN provincias ON ((proveedor.pro_provincia = provincias.prv_codigo))) ");
        sql.append(" WHERE (((proveedor.pro_indicador) = 'S') AND ((proveedor.pro_contacto) LIKE ' ");
        sql.append(cod).append("%'))");
//        String sql = "SELECT proveedor.pro_codigo,"
//                + "    proveedor.pro_razonsocial,"
//                + "    proveedor.pro_contacto,"
//                + "    proveedor.pro_celular,"
//                + "    proveedor.pro_telefono,"
//                + "    proveedor.pro_fax,"
//                + "    proveedor.pro_direccion,"
//                + "    provincias.prv_nombre,"
//                + "    proveedor.pro_email,"
//                + "    proveedor.pro_web"
//                + "   FROM (proveedor"
//                + "   JOIN provincias ON ((proveedor.pro_provincia = provincias.prv_codigo)))"
//                + "  WHERE (((proveedor.pro_indicador) = 'S') AND ((proveedor.pro_contacto) ILIKE '" + cod + "%'))";
        return Operacion.getTabla(sql.toString());
    }
}
