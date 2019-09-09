package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Provincia;
import java.util.List;

public class GestionarProvincia {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(prv_codigo) FROM provincias");
        return cod;
    }

    public static String addProvincia(Provincia p) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO provincias VALUES (");
        sql.append(p.getCodProvincia()).append(",");
        sql.append(p.getProvincia()).append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO pro|
        return msg;
    }

    public static String actProvincia(Provincia p) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE provincias SET prv_nombre='");
        sql.append(p.getProvincia()).append("' WHERE prv_codigo=");
        sql.append(p.getCodProvincia()).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE provincias SET prv_nombre='"
//                + p.getProvincia() + "' WHERE prv_codigo="
//                + p.getCodProvincia() + "");
        return msg;
    }

    public static String delProvincia(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE provincias SET prv_indicador='N' WHERE prv_codigo = ");
        sql.append(cod).append("");
//        String sql = "UPDATE provincias SET prv_indicador='N' WHERE prv_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static List listProvincias() {
        String sql = "select * from provincias WHERE prv_indicador='S'";
        return Operacion.getTabla(sql);
    }
}
