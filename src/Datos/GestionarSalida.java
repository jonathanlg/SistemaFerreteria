package Datos;

import Componentes.Fecha;
import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.DetalleSalida;
import Modelo.Salidas;
import java.util.List;

public class GestionarSalida {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(sal_codigo) FROM salidas");
        return cod;
    }

    public static String addSalida(Salidas s) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO salidas VALUES (");
        sql.append(s.getCodSal()).append(",'");
        sql.append(s.getFecha()).append("','");
        sql.append(Fecha.darHora()).append("',");
        sql.append(s.getMonto()).append(",'S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO salidas VALUES (" 
//                + s.getCodSal() + ",'" 
//                + s.getFecha() + "','" 
//                + Fecha.darHora() + "'," 
//                + s.getMonto() + ",'S')");
        return msg;
    }

    public static String actSalida(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE salidas SET sal_indicador='N' WHERE sal_codigo = ");
        sql.append(cod).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE salidas SET sal_indicador='N' WHERE sal_codigo = " + cod + "");
        return msg;
    }

    public static String addDetalleSalida(DetalleSalida ds) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO detalle_salida VALUES (0,");
        sql.append(ds.getCodArt()).append(",");
        sql.append(ds.getCodSalida()).append(",");
        sql.append(ds.getCodM()).append(",");
        sql.append(ds.getCant()).append(",");
        sql.append(ds.getPrec()).append(",");
        sql.append(ds.getMonto()).append(")");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO detalle_salida VALUES (" 
//                + ds.getCodArt() + "," 
//                + ds.getCodSalida() + "," 
//                + ds.getCodM() + "," 
//                + ds.getCant() + "," 
//                + ds.getPrec() + "," 
//                + ds.getMonto() + ")");
        return msg;
    }

    public static List listSalidas() {
        String sql = "select * from salidas where sal_indicador = 'S'";
        return Operacion.getTabla(sql);
    }

    public static List listDetalle(String cod) {
        StringBuilder sql = new StringBuilder("SELECT motivo.mot_nombre,");
        sql.append("detalle_salida.ds_cantidad,");
        sql.append("detalle_salida.sal_codigo,");
        sql.append("articulo.art_descripcion,");
        sql.append("detalle_salida.ds_precio ");
        sql.append("FROM (((detalle_salida ");
        sql.append("JOIN articulo ON ((detalle_salida.ds_articulo = articulo.art_codigo))) ");
        sql.append(" JOIN motivo ON ((detalle_salida.ds_motivo = motivo.mot_codigo))) ");
        sql.append(" JOIN salidas ON ((detalle_salida.sal_codigo = salidas.sal_codigo))) ");
        sql.append("  WHERE (salidas.sal_codigo = ");
        sql.append(cod).append(")");
//        String sql = "SELECT motivo.mot_nombre,"
//                + "    detalle_salida.ds_cantidad,"
//                + "    detalle_salida.ds_salida,"
//                + "    articulo.art_descripcion,"
//                + "    detalle_salida.ds_precio"
//                + "   FROM (((detalle_salida"
//                + "   JOIN articulo ON ((detalle_salida.ds_articulo = articulo.art_codigo)))"
//                + "   JOIN motivo ON ((detalle_salida.ds_motivo = motivo.mot_codigo)))"
//                + "   JOIN salidas ON ((detalle_salida.ds_salida = salidas.sal_codigo)))"
//                + "  WHERE (salidas.sal_codigo = " + cod + ")";
        return Operacion.getTabla(sql.toString());
    }
}
