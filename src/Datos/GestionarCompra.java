package Datos;

import Componentes.Fecha;
import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Compra;
import Modelo.DetalleCompra;
import java.util.List;

public class GestionarCompra {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(com_codigo) from compras");
        return cod;
    }

    public static String addCompra(Compra c) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO compras VALUES (");
        sql.append(c.getCodCompra()).append(",");
        sql.append(c.getCodProveedor()).append(",");
        sql.append(c.getCategoria()).append(",'");
        sql.append(c.getCondPago()).append("','");
        sql.append(c.getFecha()).append("','");
        sql.append(Fecha.darHora()).append("',");
        sql.append(c.getTotal()).append(",'S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO compras VALUES ("
//                + c.getCodCompra() + ","
//                + c.getCodProveedor() + ","
//                + c.getCategoria() + ",'"
//                + c.getCondPago() + "','"
//                + c.getFecha() + "','"
//                + Fecha.darHora() + "',"
//                + c.getTotal() + ",'S')");
        return msg;
    }

    public static String actCompra(Compra c) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE compras SET com_codigo=");
        sql.append(c.getCodCompra()).append(",com_proveedor=");
        sql.append(c.getCodProveedor()).append(",com_condPago='");
        sql.append(c.getCondPago()).append("',com_fecha='");
        sql.append(c.getFecha()).append("',com_total=");
        sql.append(c.getTotal()).append(",com_indicador='N' WHERE com_codigo=");
        sql.append(c.getCodCompra()).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE compras SET com_codigo=" 
//                + c.getCodCompra() + ",com_proveedor=" 
//                + c.getCodProveedor() + ",com_condPago='" 
//                + c.getCondPago() + "',com_fecha='" 
//                + c.getFecha() + "',com_total=" 
//                + c.getTotal() + ",com_indicador='N' WHERE com_codigo=" 
//                + c.getCodCompra() + "");
        return msg;
    }

    public static String addDetalleCompra(DetalleCompra dc) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO detalle_compras VALUES (0,");
        sql.append(dc.getCodArticulo()).append(",");
        sql.append(dc.getCodCompra()).append(",");
        sql.append(dc.getCant()).append(",");
        sql.append(dc.getPrecio()).append(",");
        sql.append(dc.getMonto()).append(")");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO detalle_compras VALUES ("
//                + dc.getCodArticulo() + ","
//                + dc.getCodCompra() + ","
//                + dc.getCant() + ","
//                + dc.getPrecio() + ","
//                + dc.getMonto() + ")");
        return msg;
    }

    public static String delCompra(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE compras SET com_indicador='N' WHERE com_codigo = ");
        sql.append(cod).append("");
//        String sql = "UPDATE compras SET com_indicador='N' WHERE com_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static List listarCompras() {
        StringBuilder sql = new StringBuilder("SELECT compras.com_codigo,");
        sql.append("compras.com_fecha,");
        sql.append("proveedor.pro_razonsocial,");
        sql.append("proveedor.pro_codigo,");
        sql.append("compras.com_total ");
        sql.append(" FROM (compras ");
        sql.append(" JOIN proveedor ON ((compras.com_proveedor = proveedor.pro_codigo))) ");
        sql.append(" WHERE ((compras.com_indicador) = 'S')");
//        String sql = "SELECT compras.com_codigo,"
//                + "    compras.com_fecha,"
//                + "    proveedor.pro_razonsocial,"
//                + "    proveedor.pro_codigo,"
//                + "    compras.com_total"
//                + "   FROM (compras"
//                + "   JOIN proveedor ON ((compras.com_proveedor = proveedor.pro_codigo)))"
//                + "  WHERE ((compras.com_indicador) = 'S')";
        return Operacion.getTabla(sql.toString());
    }

    public static List listarDetalleCompras(String cod) {
        StringBuilder sql = new StringBuilder("SELECT detalle_compras.dc_cantidad,");
        sql.append("articulo.art_codigo,");
        sql.append("articulo.art_descripcion,");
        sql.append("detalle_compras.dc_precio,");
        sql.append("detalle_compras.dc_monto ");
        sql.append(" FROM ((compras ");
        sql.append(" JOIN detalle_compras ON ((detalle_compras.com_codigo = compras.com_codigo))) ");
        sql.append(" JOIN articulo ON ((detalle_compras.dc_articulo = articulo.art_codigo))) ");
        sql.append("  WHERE (compras.com_codigo = ").append(cod).append(")");
//        String sql = "SELECT detalle_compras.dc_cantidad,"
//                + "    articulo.art_codigo,"
//                + "    articulo.art_descripcion,"
//                + "    detalle_compras.dc_precio,"
//                + "    detalle_compras.dc_monto"
//                + "   FROM ((compras"
//                + "   JOIN detalle_compras ON ((detalle_compras.dc_compra = compras.com_codigo)))"
//                + "   JOIN articulo ON ((detalle_compras.dc_articulo = articulo.art_codigo)))"
//                + "  WHERE (compras.com_codigo = " + cod + ")";
        return Operacion.getTabla(sql.toString());
    }

}
