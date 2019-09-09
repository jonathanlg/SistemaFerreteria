package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Rubro;
import Modelo.Unidad;
import java.util.List;

public class GestionarUnidad {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(uni_codigo) FROM unidad");
        return cod;
    }

    public static String addUnidad(Unidad u) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO unidad VALUES (");
        sql.append(u.getCodUnidad());
        sql.append(",'");
        sql.append(u.getUnidad());
        sql.append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO unidad VALUES ("+u.getCodUnidad()+",'"+u.getUnidad()+"','S')");
        return msg;
    }

    public static Rubro busUnidad(String cod) {
        Rubro r = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM unidad WHERE uni_codigo = '");
                sql.append(cod);
                sql.append("'");
//        String sql = "SELECT * FROM unidad WHERE uni_codigo = '"+cod+"'";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            r = new Rubro();
            r.setCodRubro(Integer.parseInt(filaObt[0].toString()));
            r.setRubro(filaObt[1].toString());
        } else {
        }
        return r;
    }

    public static List listUnidad() {
        String sql = "select * from unidad WHERE uni_indicador='S'";
        return Operacion.getTabla(sql);
    }

    public static String actUnidad(Unidad u) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE unidad SET uni_nombre = '");
                sql.append(u.getUnidad());
                sql.append("' WHERE uni_codigo = '");
                sql.append(u.getCodUnidad());
                sql.append("'");
//        String sql = "UPDATE unidad SET uni_nombre = '"+u.getUnidad()+"' WHERE uni_codigo = '"+u.getCodUnidad()+"'";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static String delUnidad(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE unidad SET uni_indicador='N' WHERE uni_codigo = ");
                sql.append(cod);
                sql.append("");
//        String sql = "UPDATE unidad SET uni_indicador='N' WHERE uni_codigo = "+cod+"";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

}
