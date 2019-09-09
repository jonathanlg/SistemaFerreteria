package Datos;

import Componentes.Operacion;
import java.util.List;

public class GestionarComisiones {

    public static List listVentas(String cod) {
        StringBuilder sql = new StringBuilder("SELECT factura.fac_fecha, factura.fac_codigo, ");
        sql.append("clientes.cli_razonSocial, factura.fac_total, vendedor.ven_comision, ");
        sql.append("(factura.fac_total/100 * vendedor.ven_comision) FROM factura, clientes, ");
        sql.append("vendedor WHERE factura.fac_cliente = clientes.cli_codigo AND ");
        sql.append("factura.fac_vendedor = vendedor.ven_codigo AND factura.fac_vendedor = ");
        sql.append(cod).append("");
//        String sql = "SELECT factura.fac_fecha, factura.fac_codigo, "
//                + "clientes.cli_razonSocial, factura.fac_total, vendedor.ven_comision, "
//                + "(factura.fac_total/100 * vendedor.ven_comision) FROM factura, clientes, "
//                + "vendedor WHERE factura.fac_cliente = clientes.cli_codigo AND "
//                + "factura.fac_vendedor = vendedor.ven_codigo AND factura.fac_vendedor = " + cod + "";
        return Operacion.getTabla(sql.toString());
    }

}
