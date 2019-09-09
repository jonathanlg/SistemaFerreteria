package Datos;

import Componentes.Operacion;
import Modelo.Stock;

public class GestionarStock {

    public static String addStock(Stock s) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO stock  VALUES (");
        sql.append(s.getCod());
        sql.append(",");
        sql.append(s.getStock());
        sql.append(",'S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO stock  VALUES (" + s.getCod() + "," + s.getStock() + ",'S')");
        return msg;
    }

    public static String actStock(Stock s) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE stock SET sto_cantidad = ");
        sql.append(s.getStock());
        sql.append(" WHERE sto_articulo = ");
        sql.append(s.getCod());
        sql.append("");
//        String sql = "UPDATE stock SET sto_cantidad = " + s.getStock() + " WHERE sto_articulo = " + s.getCod() + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static Stock busStock(String cod) {
        Stock st = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM stock WHERE sto_articulo = ");
        sql.append(cod);
        sql.append("");
//        String sql = "SELECT * FROM stock WHERE sto_articulo = " + cod + "";
        Object[] fila = Operacion.getFila(sql.toString());
        if (fila != null) {
            st = new Stock();
            st.setCod(Integer.parseInt(fila[0].toString()));
            st.setStock(Double.parseDouble(fila[1].toString()));
        } else {
            System.out.println("No encontrado");
        }
        return st;
    }

    public static String delStock(String c) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE stock SET sto_indicador = 'N' WHERE sto_articulo = ");
        sql.append(c);
//        String sql = "UPDATE stock SET sto_indicador = 'N' WHERE sto_articulo = " + c + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

}