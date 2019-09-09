package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.CategoriaCompra;
import java.util.List;

public class GestionarCategoriaCompra {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(ccp_codigo) FROM categcompra");
        return cod;
    }

    public static String addCategoria(CategoriaCompra cat) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO categcompra VALUES (");
        sql.append(cat.getCodCat()).append(",'");
        sql.append(cat.getCategoria()).append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO categcompra VALUES ("+cat.getCodCat()+",'"+cat.getCategoria()+"','S')");
        return msg;
    }

    public static String actCategoria(CategoriaCompra cat) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE categcompra SET ccp_nombre='");
        sql.append(cat.getCategoria());
        sql.append("' WHERE ccp_codigo = ");
        sql.append(cat.getCodCat()).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE categcompra SET ccp_nombre='" + cat.getCategoria() + "' WHERE ccp_codigo = " + cat.getCodCat() + "");
        return msg;
    }

    public static String delCategoria(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE categcompra SET ccp_indicador='N' WHERE ccp_codigo = ");
        sql.append(cod).append("");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE categcompra SET ccp_indicador='N' WHERE ccp_codigo = " + cod + "");
        return msg;
    }

    public static CategoriaCompra busCategoria(String cod) {
        CategoriaCompra cat = null;
        String sql = "";
        Object[] filaObt = Operacion.getFila(sql);
        if (filaObt != null) {
            cat.setCodCat(Integer.parseInt(filaObt[0].toString()));
            cat.setCategoria(filaObt[1].toString());
        } else {
            System.out.println("No encontrado");
        }
        return cat;
    }

    public static List listarCategoria() {
        String sql = "SELECT * FROM categcompra WHERE ccp_indicador='S'";
        return Operacion.getTabla(sql);
    }

}
