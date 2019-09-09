package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Transporte;
import java.util.List;

public class GestionarTransporte {    

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(tra_codigo) FROM transporte");
        return cod;
    }

    public static String addTransporte(Transporte t) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO transporte VALUES (");
        sql.append(t.getCodTransporte());
        sql.append(",'");
        sql.append(t.getTransporte());
        sql.append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO transporte VALUES ("+t.getCodTransporte()+",'"+t.getTransporte()+"','S')");
        return msg;
    }

    public static String actTransporte(Transporte t) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE transporte SET tra_nombre='");
        sql.append(t.getTransporte());
        sql.append("' WHERE tra_codigo=");
        sql.append(t.getCodTransporte());
        sql.append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE transporte SET tra_nombre='"+t.getTransporte()+"' WHERE tra_codigo="+t.getCodTransporte()+"");
        return msg;
    }

    public static String delTransporte(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE transporte SET tra_indicador='N' WHERE tra_codigo = ");
        sql.append(cod);
        sql.append("");
//        String sql = "UPDATE transporte SET tra_indicador='N' WHERE tra_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static List listTransporte() {
        String sql = "select * from transporte WHERE tra_indicador='S'";
        return Operacion.getTabla(sql);
    }

}
