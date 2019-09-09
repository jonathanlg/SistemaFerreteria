package Datos;

import Componentes.Fecha;
import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.DetalleFactura;
import Modelo.Factura;
import java.util.List;

public class GestionarFactura {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(fac_codigo) from factura");
        return cod;
    }

    public static String addFactura(Factura f) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO factura VALUES (");
        sql.append(f.getCodFactura()).append(",");
        sql.append(f.getCodCliente()).append(",");
        sql.append(f.getCodVendedor()).append(",");
        sql.append(f.getDescuento()).append(",'");
        sql.append(f.getTipoPago()).append("','");
        sql.append(f.getFecha()).append("','");
        sql.append(Fecha.darHora()).append("','");
        sql.append(f.getNeto()).append("' ,");
        sql.append(f.getTotal()).append(",'S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO factura VALUES ("
//                + f.getCodFactura() + ","
//                + f.getCodCliente() + ","
//                + f.getCodVendedor() + ","
//                + f.getDescuento() + ",'"
//                + f.getTipoPago() + "','"
//                + f.getFecha() + "','"
//                + Fecha.darHora() + "','"
//                + f.getNeto() + "' ,"
//                + f.getTotal() + ",'S')");
        return msg;
    }

    public static String actFactura(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE factura SET fac_indicador='N' WHERE fac_codigo=");
        sql.append(cod).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE factura SET fac_indicador='N' WHERE fac_codigo=" + cod + "");
        return msg;
    }

    public static String addDetalleFactura(DetalleFactura df) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO detalle_factura VALUES (0,");
        sql.append(df.getCodFactura()).append(",");
        sql.append(df.getCodArticulo()).append(",");
        sql.append(df.getCantidad()).append(",");
        sql.append(df.getPrecio()).append(",");
        sql.append(df.getTotal()).append(")");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO detalle_factura VALUES ("
//                + df.getCodFactura() + ","
//                + df.getCodArticulo() + ","
//                + df.getCantidad() + ","
//                + df.getPrecio() + ","
//                + df.getTotal() + ")");
        return msg;
    }

    public static Factura busFactura(String cod) {
        Factura fac = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM factura WHERE fac_codigo=");
        sql.append(cod).append("");
//        String sql = "SELECT * FROM factura WHERE fac_codigo=" + cod + "";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            fac = new Factura();
            fac.setCodFactura(Integer.parseInt(filaObt[0].toString()));
            fac.setCodCliente(Integer.parseInt(filaObt[1].toString()));
            fac.setCodVendedor(Integer.parseInt(filaObt[2].toString()));
            fac.setDescuento(Double.parseDouble(filaObt[3].toString()));
            fac.setTipoPago(filaObt[4].toString());
            fac.setFecha(filaObt[5].toString());
            fac.setHora(filaObt[6].toString());
            fac.setTotal(Double.parseDouble(filaObt[7].toString()));
        } else {
            System.out.println("No encontrado");
        }
        return fac;
    }

    public static List listFacturas() {
        StringBuilder sql = new StringBuilder("SELECT factura.fac_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("factura.fac_fecha,");
        sql.append("clientes.cli_codigo,");
        sql.append("factura.fac_descuento,");
        sql.append("factura.fac_total,");
        sql.append("vendedor.ven_codigo ");
        sql.append(" FROM ((factura ");
        sql.append(" JOIN vendedor ON ((factura.fac_vendedor = vendedor.ven_codigo))) ");
        sql.append(" JOIN clientes ON ((factura.fac_cliente = clientes.cli_codigo))) ");
        sql.append(" WHERE ((factura.fac_indicador) = 'S')");
//        String sql = "SELECT factura.fac_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    factura.fac_fecha,"
//                + "    clientes.cli_codigo,"
//                + "    factura.fac_descuento,"
//                + "    factura.fac_total,"
//                + "    vendedor.ven_codigo"
//                + "   FROM ((factura"
//                + "   JOIN vendedor ON ((factura.fac_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN clientes ON ((factura.fac_cliente = clientes.cli_codigo)))"
//                + "  WHERE ((factura.fac_indicador) = 'S')";
        return Operacion.getTabla(sql.toString());
    }

    public static List lisFacturas2() {
        StringBuilder sql = new StringBuilder("SELECT factura.fac_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("factura.fac_fecha,");
        sql.append("clientes.cli_codigo,");
        sql.append("factura.fac_descuento,");
        sql.append("factura.fac_total,");
        sql.append("vendedor.ven_codigo ");
        sql.append(" FROM ((factura ");
        sql.append(" JOIN vendedor ON ((factura.fac_vendedor = vendedor.ven_codigo))) ");
        sql.append(" JOIN clientes ON ((factura.fac_cliente = clientes.cli_codigo))) ");
        sql.append(" WHERE (((factura.fac_indicador) = 'S') AND (NOT (EXISTS ( SELECT factura.fac_codigo ");
        sql.append(" FROM notacredito ");
        sql.append(" WHERE (factura.fac_codigo = notacredito.nc_factura)))))");
//        String sql = "SELECT factura.fac_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    factura.fac_fecha,"
//                + "    clientes.cli_codigo,"
//                + "    factura.fac_descuento,"
//                + "    factura.fac_total,"
//                + "    vendedor.ven_codigo"
//                + "   FROM ((factura"
//                + "   JOIN vendedor ON ((factura.fac_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN clientes ON ((factura.fac_cliente = clientes.cli_codigo)))"
//                + "  WHERE (((factura.fac_indicador) = 'S') AND (NOT (EXISTS ( SELECT factura.fac_codigo"
//                + "   FROM notacredito"
//                + "  WHERE (factura.fac_codigo = notacredito.nc_factura)))))";
        return Operacion.getTabla(sql.toString());
    }

//    public static List listFacturasAnuladas() {
//        String sql = "SELECT factura.fac_codigo, clientes.cli_razonSocial, factura.fac_fecha, clientes.cli_codigo, factura.fac_descuento,factura.fac_total, vendedor.ven_codigo FROM factura, clientes, vendedor where factura.fac_cliente = clientes.cli_codigo AND factura.fac_vendedor = vendedor.ven_codigo AND factura.fac_indicador='N'";
//        return Operacion.getTabla(sql);
//    }
    public static List fillCliente(String nom) {
        StringBuilder sql = new StringBuilder("SELECT factura.fac_codigo,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("factura.fac_fecha,");
        sql.append("clientes.cli_codigo,");
        sql.append("factura.fac_descuento,");
        sql.append("factura.fac_total,");
        sql.append("vendedor.ven_codigo ");
        sql.append(" FROM ((factura ");
        sql.append(" JOIN vendedor ON ((factura.fac_vendedor = vendedor.ven_codigo))) ");
        sql.append(" JOIN clientes ON ((factura.fac_cliente = clientes.cli_codigo))) ");
        sql.append(" WHERE ");
        sql.append("(((factura.fac_indicador) = 'S') AND ");
        sql.append(" (NOT (EXISTS ( SELECT factura.fac_codigo ");
        sql.append(" FROM notacredito ");
        sql.append("  WHERE (factura.fac_codigo = notacredito.nc_factura)))) AND clientes.cli_razonsocial ILIKE '");
        sql.append(nom).append("%')");
//        String sql = "SELECT factura.fac_codigo,"
//                + "    clientes.cli_razonsocial,"
//                + "    factura.fac_fecha,"
//                + "    clientes.cli_codigo,"
//                + "    factura.fac_descuento,"
//                + "    factura.fac_total,"
//                + "    vendedor.ven_codigo"
//                + "   FROM ((factura"
//                + "   JOIN vendedor ON ((factura.fac_vendedor = vendedor.ven_codigo)))"
//                + "   JOIN clientes ON ((factura.fac_cliente = clientes.cli_codigo)))"
//                + "   WHERE "
//                + "(((factura.fac_indicador) = 'S') AND "
//                + "(NOT (EXISTS ( SELECT factura.fac_codigo"
//                + "   FROM notacredito"
//                + "  WHERE (factura.fac_codigo = notacredito.nc_factura)))) AND clientes.cli_razonsocial ILIKE '" + nom + "%')";
        return Operacion.getTabla(sql.toString());
    }

    public static List listDetalles(String cod) {
        StringBuilder sql = new StringBuilder("SELECT detalle_factura.df_cantidad,");
        sql.append("detalle_factura.df_articulo,");
        sql.append("articulo.art_descripcion,");
        sql.append("unidad.uni_nombre,");
        sql.append("detalle_factura.df_precarticulo,");
        sql.append("detalle_factura.df_total ");
        sql.append(" FROM (((detalle_factura ");
        sql.append(" JOIN articulo ON ((detalle_factura.df_articulo = articulo.art_codigo))) ");
        sql.append(" JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo))) ");
        sql.append(" JOIN factura ON ((detalle_factura.fac_codigo = factura.fac_codigo))) ");
        sql.append(" WHERE (factura.fac_codigo = ").append(cod).append(")");
//        String sql = "SELECT detalle_factura.df_cantidad,"
//                + "    detalle_factura.df_articulo,"
//                + "    articulo.art_descripcion,"
//                + "    unidad.uni_nombre,"
//                + "    detalle_factura.df_precarticulo,"
//                + "    detalle_factura.df_total"
//                + "   FROM (((detalle_factura"
//                + "   JOIN articulo ON ((detalle_factura.df_articulo = articulo.art_codigo)))"
//                + "   JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo)))"
//                + "   JOIN factura ON ((detalle_factura.df_codigo = factura.fac_codigo)))"
//                + "  WHERE (factura.fac_codigo = " + cod + ")";
        return Operacion.getTabla(sql.toString());
    }

    public static List listDetallesF(String cod) {
        StringBuilder sql = new StringBuilder("SELECT detalle_factura.df_cantidad,");
        sql.append("detalle_factura.df_articulo,");
        sql.append("articulo.art_descripcion,");
        sql.append("detalle_factura.df_precarticulo,");
        sql.append("detalle_factura.df_total ");
        sql.append(" FROM ((detalle_factura ");
        sql.append(" JOIN factura ON ((detalle_factura.fac_codigo = factura.fac_codigo))) ");
        sql.append(" JOIN articulo ON ((detalle_factura.df_articulo = articulo.art_codigo))) ");
        sql.append(" WHERE (factura.fac_codigo = ").append(cod).append(")");
//        String sql = "SELECT detalle_factura.df_cantidad,"
//                + "    detalle_factura.df_articulo,"
//                + "    articulo.art_descripcion,"
//                + "    detalle_factura.df_precarticulo,"
//                + "    detalle_factura.df_total"
//                + "   FROM ((detalle_factura"
//                + "   JOIN factura ON ((detalle_factura.df_codigo = factura.fac_codigo)))"
//                + "   JOIN articulo ON ((detalle_factura.df_articulo = articulo.art_codigo)))"
//                + "  WHERE (factura.fac_codigo = " + cod + ")";
        return Operacion.getTabla(sql.toString());
    }

}
