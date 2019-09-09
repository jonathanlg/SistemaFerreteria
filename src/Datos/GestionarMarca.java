package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Marca;
import Modelo.Rubro;
import java.util.List;

public class GestionarMarca {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("SELECT MAX(mar_codigo) FROM marca");
        return cod;
    }

    public static String addMarca(Marca m) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO marca VALUES (");
        sql.append(m.getCodMarca()).append(",'");
        sql.append(m.getMarca()).append("','S')");
        msg = Operacion.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO marca VALUES ("
//                + m.getCodMarca() + ",'"
//                + m.getMarca() + "','S')");
        return msg;
    }

    public static Rubro busMarca(String cod) {
        Rubro r = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM marca WHERE mar_codigo = '");
        sql.append(cod).append("'");
//        String sql = "SELECT * FROM marca WHERE mar_codigo = '" + cod + "'";
        Object[] filaObt = Operacion.getFila(sql.toString());
        if (filaObt != null) {
            r = new Rubro();
            r.setCodRubro(Integer.parseInt(filaObt[0].toString()));
            r.setRubro(filaObt[1].toString());
        } else {
        }
        return r;
    }

    public static List listMarca() {
        String sql = "select * from marca WHERE mar_indicador='S'";
        return Operacion.getTabla(sql);
    }

    public static String actMarca(Marca m) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE marca SET mar_nombre = '");
        sql.append(m.getMarca());
        sql.append("' WHERE mar_codigo = '");
        sql.append(m.getCodMarca()).append("'");
//        String sql = "UPDATE marca SET mar_nombre = '"
//                + m.getMarca()
//                + "' WHERE mar_codigo = '"
//                + m.getCodMarca() + "'";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static String delMarca(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE marca SET mar_indicador='N' WHERE mar_codigo = ");
        sql.append(cod).append("");
//        String sql = "UPDATE marca SET mar_indicador='N' WHERE mar_codigo = " + cod + "";
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

}
