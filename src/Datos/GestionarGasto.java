package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Gasto;

public class GestionarGasto {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(ga_codigo) FROM gastos");
        return cod;
    }

    public static String addGasto(Gasto g) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO gastos VALUES (");
        sql.append(getCodigo()).append(",'").append(g.getGaFecha()).append("',");
        sql.append(g.getGaDescripcion()).append(",'").append(g.getGaNombre()).append("',");
        sql.append(g.getGaImporte()).append(",'").append(g.getGaObservacion()).append("')");
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }
    
}
