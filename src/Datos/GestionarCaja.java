package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Caja;

public class GestionarCaja {
    
    public static String getCodigo(){
        String cod = generarCodigos.getCodigo("SELECT MAX(ca_id) FROM caja");
        return cod;
    }
    
    public static String addCaja(Caja caja){
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO caja VALUES (");
        sql.append(getCodigo()).append(",'");
        sql.append(caja.getFecha()).append("',");
        sql.append(caja.getCaInicial()).append(",");
        sql.append(caja.getCaFinal()).append(",");
        sql.append(caja.getCaDiferencia()).append(")");
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }
    
    public static String actCaja(Caja caja){
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE caja SET ca_final=");
        sql.append(caja.getCaFinal());
        sql.append(", ca_diferencia=");
        sql.append(caja.getCaDiferencia());
        sql.append(" WHERE ca_fecha = '");
        sql.append(caja.getFecha());
        sql.append("'");
        msg = Operacion.exeOperacion(sql.toString());
        return "msg";
    }
    
}
