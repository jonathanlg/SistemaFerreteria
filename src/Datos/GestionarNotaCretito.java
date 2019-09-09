package Datos;

import Componentes.Fecha;
import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.detalle_notaCredito;
import Modelo.notaCredito;
import java.util.List;

public class GestionarNotaCretito {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(nc_codigo) FROM notacredito");
        return cod;
    }

    public static String addNotaCredit(notaCredito nc) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO notacredito VALUES (");
        sql.append(nc.getCodNotaCredito()).append(",");
        sql.append(nc.getCodFactura()).append(",");
        sql.append(nc.getCodCliente()).append(",");
        sql.append(nc.getDescuento()).append(",'");
        sql.append(nc.getFecha()).append("', '");
        sql.append(Fecha.darHora()).append("',");
        sql.append(nc.getTotal()).append(",'S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO notacredito VALUES ("
//                + nc.getCodNotaCredito() + ","
//                + nc.getCodFactura() + ","
//                + nc.getCodCliente() + ","
//                + nc.getDescuento() + ",'"
//                + nc.getFecha() + "', '"
//                + Fecha.darHora() + "',"
//                + nc.getTotal() + ",'S')");
        return msg;
    }

    public static String actNotaCredito(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE notacredito set nc_indicador='N' WHERE nc_codigo=");
        sql.append(cod).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE notacredito set nc_indicador='N' WHERE nc_codigo=" + cod + "");
        return msg;
    }

    public static notaCredito busNotaCredito(String cod) {
        notaCredito nc = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM notacredito WHERE nc_codigo = ");
        sql.append(cod).append("");
//        String sql = "SELECT * FROM notacredito WHERE nc_codigo = " + cod + "";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            nc = new notaCredito();
            nc.setCodNotaCredito(Integer.parseInt(filaObt[0].toString()));
            nc.setCodFactura(Integer.parseInt(filaObt[1].toString()));
            nc.setCodCliente(Integer.parseInt(filaObt[2].toString()));
            nc.setDescuento(Double.parseDouble(filaObt[3].toString()));
            nc.setFecha(filaObt[4].toString());
            nc.setHora(filaObt[5].toString());
            nc.setTotal(Double.parseDouble(filaObt[6].toString()));
        } else {
            System.out.println("No encontrado");
        }
        return nc;
    }

    public static String addDetalleNotaCredito(detalle_notaCredito dnc) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO detallenotacredito VALUES (0,");
        sql.append(dnc.getCodNotaCredito()).append(",");
        sql.append(dnc.getCodArticulo()).append(",");
        sql.append(dnc.getCantidad()).append(",");
        sql.append(dnc.getPrecio()).append(",");
        sql.append(dnc.getTotal()).append(")");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO detallenotacredito VALUES ("
//                + dnc.getCodNotaCredito() + ","
//                + dnc.getCodArticulo() + ","
//                + dnc.getCantidad() + ","
//                + dnc.getPrecio() + ","
//                + dnc.getTotal() + ")");
        return msg;
    }

    public static List lisNotaCredito() {
        StringBuilder sql = new StringBuilder("SELECT notacredito.nc_codigo,");
        sql.append("notacredito.nc_fecha,");
        sql.append("clientes.cli_razonsocial,");
        sql.append("notacredito.nc_cliente,");
        sql.append("notacredito.nc_total,");
        sql.append("notacredito.nc_descuendo,");
        sql.append("notacredito.nc_factura ");
        sql.append(" FROM (notacredito ");
        sql.append(" JOIN clientes ON ((notacredito.nc_cliente = clientes.cli_codigo))) ");
        sql.append(" WHERE ((notacredito.nc_indicador) = 'S')");
//        String sql = "SELECT notacredito.nc_codigo,"
//                + "    notacredito.nc_fecha,"
//                + "    clientes.cli_razonsocial,"
//                + "    notacredito.nc_cliente,"
//                + "    notacredito.nc_total,"
//                + "    notacredito.nc_descuendo,"
//                + "    notacredito.nc_factura"
//                + "   FROM (notacredito"
//                + "   JOIN clientes ON ((notacredito.nc_cliente = clientes.cli_codigo)))"
//                + "  WHERE ((notacredito.nc_indicador) = 'S')";
        return Operacion.getTabla(sql.toString());
    }

    public static List listDetalleNotaCredito(String cod) {
        StringBuilder sq = new StringBuilder("SELECT detallenotacredito.dn_cantidad,");
        sq.append("articulo.art_codigo,");
        sq.append("articulo.art_descripcion,");
        sq.append("detallenotacredito.dn_precarticulo,");
        sq.append("detallenotacredito.dn_total ");
        sq.append(" FROM ((detallenotacredito ");
        sq.append(" JOIN articulo ON ((detallenotacredito.dn_articulo = articulo.art_codigo))) ");
        sq.append(" JOIN notacredito ON ((detallenotacredito.nc_codigo = notacredito.nc_codigo))) ");
        sq.append(" WHERE (notacredito.nc_codigo = ").append(cod).append(")");
//        String sql = "SELECT detallenotacredito.dn_cantidad,"
//                + "    articulo.art_codigo,"
//                + "    articulo.art_descripcion,"
//                + "    detallenotacredito.dn_precarticulo,"
//                + "    detallenotacredito.dn_total"
//                + "   FROM ((detallenotacredito"
//                + "   JOIN articulo ON ((detallenotacredito.dn_articulo = articulo.art_codigo)))"
//                + "   JOIN notacredito ON ((detallenotacredito.dn_codigo = notacredito.nc_codigo)))"
//                + "  WHERE (notacredito.nc_codigo = " + cod + ")";
        return Operacion.getTabla(sq.toString());
    }

}
