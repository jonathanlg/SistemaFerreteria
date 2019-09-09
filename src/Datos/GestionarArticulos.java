package Datos;

import Componentes.Operacion;
import Componentes.generarCodigos;
import Modelo.Articulo;
import java.io.FileInputStream;
import java.util.List;

public class GestionarArticulos {

    static FileInputStream fis;

    public static String getCodigo() {
        String cod = generarCodigos.getCodigo("select MAX(art_codigo) from articulo");
        return cod;
    }

    public static String addArticulo(Articulo art) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO articulo VALUES (").append(art.getCodArticulo()).append(",'").append(art.getDescripcion()).append("',");
        sql.append(art.getCodMarca()).append(",").append(art.getCodProveedor()).append(",").append(art.getEfectivo()).append(",").append(art.getMontoCalculado()).append(",");
        sql.append(art.getTarjeta()).append(",").append(art.getCosto()).append(",'").append(art.getFecha()).append("',").append(art.getCodUnidad()).append(",").append(art.getCodRubro()).append(",");
        sql.append(art.getStock()).append(",'S')");
        msg = Operacion.exeOperacion(sql.toString());
        /*msg = Operacion.exeOperacion("INSERT INTO articulo VALUES (" + art.getCodArticulo() + ",'" + art.getDescripcion() + "',"
         + art.getCodMarca() + "," + art.getCodProveedor() + "," + art.getEfectivo() + "," + art.getMontoCalculado() + ","
         + art.getTarjeta() + "," + art.getCosto() + ",'" + art.getFecha() + "'," + art.getCodUnidad() + "," + art.getCodRubro() + ","
         + art.getStock() + ",'S')");*/
        return msg;
    }


    public static String actArticulo(Articulo art) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE articulo SET art_descripcion='").append(art.getDescripcion());
        sql.append("',art_marca=").append(art.getCodMarca());
        sql.append(",art_proveedor=").append(art.getCodProveedor());
        sql.append(",art_efectivo=").append(art.getEfectivo());
        sql.append(",art_montoCalculado=").append(art.getMontoCalculado());
        sql.append(",art_tarjeta=").append(art.getTarjeta());
        sql.append(",art_costo=").append(art.getCosto());
        sql.append(",art_fechaCompra='").append(art.getFecha());
        sql.append("',art_unidad=").append(art.getCodUnidad());
        sql.append(",art_rubro=").append(art.getCodRubro());
        sql.append(",art_stock=").append(art.getStock());
        sql.append(" WHERE art_codigo=").append(art.getCodArticulo()).append("");
        msg = Operacion.exeOperacion(sql.toString());
        /*msg = Operacion.exeOperacion("UPDATE articulo SET art_descripcion='" + art.getDescripcion() +
         "',art_marca=" + art.getCodMarca() +
         ",art_proveedor=" + art.getCodProveedor() +
         ",art_efectivo=" + art.getEfectivo() +
         ",art_montoCalculado=" + art.getMontoCalculado() +
         ",art_tarjeta=" + art.getTarjeta() +
         ",art_costo=" + art.getCosto() +
         ",art_fechaCompra='" + art.getFecha() +
         "',art_unidad=" + art.getCodUnidad() +
         ",art_rubro=" + art.getCodRubro() + 
         ",art_stock=" + art.getStock() +
         " WHERE art_codigo=" + art.getCodArticulo() + "");*/
        return msg;
    }

    public static String actStock(Articulo art) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE articulo SET art_stock=");
        sql.append(art.getStock());
        sql.append(" WHERE art_codigo=");
        sql.append(art.getCodArticulo());
        sql.append("");
        msg = Operacion.exeOperacion(sql.toString());
        //msg = Operacion.exeOperacion("UPDATE articulo SET art_stock=" + art.getStock() + " WHERE art_codigo=" + art.getCodArticulo() + "");
        return msg;
    }

    public static String delArticulo(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE articulo SET art_indicador = 'N' WHERE art_codigo = ");
        sql.append(cod);
        sql.append("");
        msg = Operacion.exeOperacion(sql.toString());
        return msg;
    }

    public static Articulo busArticulo(String cod) {
        Articulo ar = null;
        StringBuilder s = new StringBuilder("SELECT * FROM articulo WHERE art_codigo = ");
        s.append(cod);
        s.append("");
        Object[] filaObt = Operacion.getFila(s.toString());
        if (filaObt != null) {
            ar = new Articulo();
            ar.setCodArticulo(Integer.parseInt(filaObt[0].toString()));
            ar.setDescripcion(filaObt[1].toString());
            ar.setCodMarca(Integer.parseInt(filaObt[2].toString()));
            ar.setCodProveedor(Integer.parseInt(filaObt[3].toString()));
            ar.setEfectivo(Double.parseDouble(filaObt[4].toString()));
            ar.setMontoCalculado(Double.parseDouble(filaObt[5].toString()));
            ar.setTarjeta(Double.parseDouble(filaObt[6].toString()));
            ar.setCosto(Double.parseDouble(filaObt[7].toString()));
            ar.setFecha(filaObt[8].toString());
            ar.setCodUnidad(Integer.parseInt(filaObt[9].toString()));
            ar.setCodRubro(Integer.parseInt(filaObt[10].toString()));
            ar.setStock(Double.parseDouble(filaObt[11].toString()));
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
        return ar;
    }

    public static List listArticulo(String cod) {
        String sql = new StringBuffer("SELECT articulo.art_codigo,")
                .append("articulo.art_descripcion,")
                .append("marca.mar_nombre,")
                .append("proveedor.pro_razonsocial,")
                .append("articulo.art_efectivo,")
                .append("articulo.art_montocalculado,")
                .append("articulo.art_tarjeta,")
                .append("articulo.art_costo,")
                .append("articulo.art_fechacompra,")
                .append("unidad.uni_nombre,")
                .append("rubro.rub_nombre,")
                .append("articulo.art_stock,")
                .append("stock.sto_cantidad ")
                .append("FROM (((((articulo ")
                .append("JOIN marca ON ((articulo.art_marca = marca.mar_codigo))) ")
                .append("JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo))) ")
                .append("JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo))) ")
                .append("JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo))) ")
                .append("JOIN stock ON ((stock.sto_articulo = articulo.art_codigo))) ")
                .append("WHERE ")
                .append("articulo.art_indicador = 'S'")
                .append("ORDER BY ")
                .append(cod)
                .append("")
                .toString();
        /*String sql = "SELECT articulo.art_codigo,"
         + "    articulo.art_descripcion,"
         + "    marca.mar_nombre,"
         + "    proveedor.pro_razonsocial,"
         + "    articulo.art_efectivo,"
         + "    articulo.art_montocalculado,"
         + "    articulo.art_tarjeta,"
         + "    articulo.art_costo,"
         + "    articulo.art_fechacompra,"
         + "    unidad.uni_nombre,"
         + "    rubro.rub_nombre,"
         + "    articulo.art_stock,"
         + "    stock.sto_cantidad"
         + "   FROM (((((articulo"
         + "   JOIN marca ON ((articulo.art_marca = marca.mar_codigo)))"
         + "   JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo)))"
         + "   JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo)))"
         + "   JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo)))"
         + "   JOIN stock ON ((stock.sto_articulo = articulo.art_codigo)))"
         + "   WHERE"
         + "   articulo.art_indicador = 'S'"
         + "   ORDER BY " + cod + "";*/
        return Operacion.getTabla(sql);
    }

    public static List filtrarArticulo(String cad) {
        String sql = new StringBuffer("SELECT articulo.art_codigo,")
                .append("articulo.art_descripcion,")
                .append("marca.mar_nombre,")
                .append("proveedor.pro_razonsocial,")
                .append("articulo.art_efectivo,")
                .append("articulo.art_montocalculado,")
                .append("articulo.art_tarjeta,")
                .append("articulo.art_costo,")
                .append("articulo.art_fechacompra,")
                .append("unidad.uni_nombre,")
                .append("rubro.rub_nombre,")
                .append("articulo.art_stock,")
                .append("stock.sto_cantidad ")
                .append("FROM (((((articulo ")
                .append("JOIN marca ON ((articulo.art_marca = marca.mar_codigo))) ")
                .append("JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo))) ")
                .append("JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo))) ")
                .append("JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo))) ")
                .append("JOIN stock ON ((stock.sto_articulo = articulo.art_codigo))) ")
                .append("WHERE (((articulo.art_indicador) = 'S') AND ((articulo.art_descripcion) LIKE '")
                .append(cad)
                .append("%'))")
                .toString();
        /*String sq = " SELECT articulo.art_codigo,"
         + "    articulo.art_descripcion,"
         + "    marca.mar_nombre,"
         + "    proveedor.pro_razonsocial,"
         + "    articulo.art_efectivo,"
         + "    articulo.art_montocalculado,"
         + "    articulo.art_tarjeta,"
         + "    articulo.art_costo,"
         + "    articulo.art_fechacompra,"
         + "    unidad.uni_nombre,"
         + "    rubro.rub_nombre,"
         + "    articulo.art_stock,"
         + "    stock.sto_cantidad"
         + "   FROM (((((articulo"
         + "   JOIN marca ON ((articulo.art_marca = marca.mar_codigo)))"
         + "   JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo)))"
         + "   JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo)))"
         + "   JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo)))"
         + "   JOIN stock ON ((stock.sto_articulo = articulo.art_codigo)))"
         + "  WHERE (((articulo.art_indicador) = 'S') AND ((articulo.art_descripcion) ILIKE '" + cad + "%'))";*/
        return Operacion.getTabla(sql);
    }

    public static List filtrarRubro(String cad) {
        String sql = new StringBuffer("SELECT articulo.art_codigo,")
                .append("articulo.art_descripcion,")
                .append("marca.mar_nombre,")
                .append("proveedor.pro_razonsocial,")
                .append("articulo.art_efectivo,")
                .append("articulo.art_montocalculado,")
                .append("articulo.art_tarjeta,")
                .append("articulo.art_costo,")
                .append("articulo.art_fechacompra,")
                .append("unidad.uni_nombre,")
                .append("rubro.rub_nombre,")
                .append("articulo.art_stock,")
                .append("stock.sto_cantidad ")
                .append("FROM (((((articulo ")
                .append("JOIN marca ON ((articulo.art_marca = marca.mar_codigo))) ")
                .append("JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo))) ")
                .append("JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo))) ")
                .append("JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo))) ")
                .append("JOIN stock ON ((stock.sto_articulo = articulo.art_codigo))) ")
                .append("WHERE (((articulo.art_indicador) = 'S') AND rubro.rub_nombre LIKE '")
                .append(cad)
                .append("%')")
                .toString();
        /*String sql = "SELECT articulo.art_codigo,"
         + "    articulo.art_descripcion,"
         + "    marca.mar_nombre,"
         + "    proveedor.pro_razonsocial,"
         + "    articulo.art_efectivo,"
         + "    articulo.art_montocalculado,"
         + "    articulo.art_tarjeta,"
         + "    articulo.art_costo,"
         + "    articulo.art_fechacompra,"
         + "    unidad.uni_nombre,"
         + "    rubro.rub_nombre,"
         + "    articulo.art_stock,"
         + "    stock.sto_cantidad"
         + "   FROM (((((articulo"
         + "   JOIN marca ON ((articulo.art_marca = marca.mar_codigo)))"
         + "   JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo)))"
         + "   JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo)))"
         + "   JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo)))"
         + "   JOIN stock ON ((stock.sto_articulo = articulo.art_codigo)))"
         + "   WHERE"
         + "(((articulo.art_indicador) = 'S') AND "
         + "rubro.rub_nombre ILIKE '" + cad + "%')";*/
        return Operacion.getTabla(sql);
    }

    public static List filtrarMarca(String cad) {
        String sql = new StringBuffer("SELECT articulo.art_codigo,")
                .append("articulo.art_descripcion,")
                .append("marca.mar_nombre,")
                .append("proveedor.pro_razonsocial,")
                .append("articulo.art_efectivo,")
                .append("articulo.art_montocalculado,")
                .append("articulo.art_tarjeta,")
                .append("articulo.art_costo,")
                .append("articulo.art_fechacompra,")
                .append("unidad.uni_nombre,")
                .append("rubro.rub_nombre,")
                .append("articulo.art_stock,")
                .append("stock.sto_cantidad ")
                .append("FROM (((((articulo ")
                .append("JOIN marca ON ((articulo.art_marca = marca.mar_codigo))) ")
                .append("JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo))) ")
                .append("JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo))) ")
                .append("JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo))) ")
                .append("JOIN stock ON ((stock.sto_articulo = articulo.art_codigo))) ")
                .append("WHERE (((articulo.art_indicador) = 'S') AND marca.mar_nombre LIKE '")
                .append(cad)
                .append("%')")
                .toString();
        /*String sql = "SELECT articulo.art_codigo,"
         + "    articulo.art_descripcion,"
         + "    marca.mar_nombre,"
         + "    proveedor.pro_razonsocial,"
         + "    articulo.art_efectivo,"
         + "    articulo.art_montocalculado,"
         + "    articulo.art_tarjeta,"
         + "    articulo.art_costo,"
         + "    articulo.art_fechacompra,"
         + "    unidad.uni_nombre,"
         + "    rubro.rub_nombre,"
         + "    articulo.art_stock,"
         + "    stock.sto_cantidad"
         + "   FROM (((((articulo"
         + "   JOIN marca ON ((articulo.art_marca = marca.mar_codigo)))"
         + "   JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo)))"
         + "   JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo)))"
         + "   JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo)))"
         + "   JOIN stock ON ((stock.sto_articulo = articulo.art_codigo)))"
         + "   WHERE"
         + "(((articulo.art_indicador) = 'S') AND "
         + "marca.mar_nombre ILIKE '" + cad + "%')";*/
        return Operacion.getTabla(sql);
    }

    public static List filtProveedor(String cad) {
        String sql = new StringBuffer("SELECT articulo.art_codigo,")
                .append("articulo.art_descripcion,")
                .append("marca.mar_nombre,")
                .append("proveedor.pro_razonsocial,")
                .append("articulo.art_efectivo,")
                .append("articulo.art_montocalculado,")
                .append("articulo.art_tarjeta,")
                .append("articulo.art_costo,")
                .append("articulo.art_fechacompra,")
                .append("unidad.uni_nombre,")
                .append("rubro.rub_nombre,")
                .append("articulo.art_stock,")
                .append("stock.sto_cantidad ")
                .append("FROM (((((articulo ")
                .append("JOIN marca ON ((articulo.art_marca = marca.mar_codigo))) ")
                .append("JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo))) ")
                .append("JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo))) ")
                .append("JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo))) ")
                .append("JOIN stock ON ((stock.sto_articulo = articulo.art_codigo))) ")
                .append("WHERE (((articulo.art_indicador) = 'S') AND proveedor.pro_razonsocial LIKE '")
                .append(cad)
                .append("%')")
                .toString();
        /*String sql = "SELECT articulo.art_codigo,"
         + "    articulo.art_descripcion,"
         + "    marca.mar_nombre,"
         + "    proveedor.pro_razonsocial,"
         + "    articulo.art_efectivo,"
         + "    articulo.art_montocalculado,"
         + "    articulo.art_tarjeta,"
         + "    articulo.art_costo,"
         + "    articulo.art_fechacompra,"
         + "    unidad.uni_nombre,"
         + "    rubro.rub_nombre,"
         + "    articulo.art_stock,"
         + "    stock.sto_cantidad"
         + "   FROM (((((articulo"
         + "   JOIN marca ON ((articulo.art_marca = marca.mar_codigo)))"
         + "   JOIN proveedor ON ((articulo.art_proveedor = proveedor.pro_codigo)))"
         + "   JOIN unidad ON ((articulo.art_unidad = unidad.uni_codigo)))"
         + "   JOIN rubro ON ((articulo.art_rubro = rubro.rub_codigo)))"
         + "   JOIN stock ON ((stock.sto_articulo = articulo.art_codigo)))"
         + "   WHERE"
         + "(((articulo.art_indicador) = 'S') AND "
         + "proveedor.pro_razonsocial ILIKE '" + cad + "%')";*/
        return Operacion.getTabla(sql);
    }

}
