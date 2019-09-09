package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.zona;
import java.util.List;

public class GestionarZona {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(zon_codigo) FROM zona");
        return cod;
    }

    public static String addZona(zona z) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO zona VALUES (");
        sql.append(z.getCodZona());
        sql.append(",'");
        sql.append(z.getZona());
        sql.append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO zona VALUES (" + z.getCodZona() + ",'" + z.getZona() + "','S')");
        return msg;
    }

    public static String actZona(zona z) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE zona SET zon_nombre='");
        sql.append(z.getZona());
        sql.append("' WHERE zon_codigo=");
        sql.append(z.getCodZona());
        sql.append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE zona SET zon_nombre='" + z.getZona() + "' WHERE zon_codigo=" + z.getCodZona() + "");
        return msg;
    }

    public static String delZona(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE zona SET zon_indicador='N' WHERE zon_codigo = ");
        sql.append(cod);
        sql.append("");

//        String sql = new StringBuilder("UPDATE zona SET zon_indicador='N' WHERE zon_codigo = ")
//                .append(cod)
//                .append("").
//                toString();
//        String sql = "UPDATE zona SET zon_indicador='N' WHERE zon_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static List listZona() {
        String sql = "select * from zona WHERE zon_indicador='S'";
        return Operacion.getTabla(sql);
    }
}
