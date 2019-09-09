package Datos;

import Componentes.Mensajes;
import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Retiro;

public class GestionarRetiro {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(re_codigo) FROM retiro");
        return cod;
    }

    public static String addRetiro(Retiro r) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO retiro VALUES (");
        sql.append(getCodigo()).append(",'").append(r.getReFecha()).append("',");
        sql.append(r.getReDescripcion()).append(",'").append(r.getReNombre()).append("',");
        sql.append(r.getReImporte()).append(")");
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

}
