package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Datos.GestionarArticulos;
import IU.dlgArticulos;
import IU.dlgGestAriculos;
import Modelo.Articulo;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlArticulo {

    public static void aModifcar() {
        int x = dlgArticulos.jTable1.getSelectedRow();

        String cod = dlgArticulos.jTable1.getValueAt(x, 0).toString();
        String stm = dlgArticulos.jTable1.getValueAt(x, 12).toString();

        Articulo ar = GestionarArticulos.busArticulo(cod);

        dlgGestAriculos.lblCodArt.setText(String.valueOf(ar.getCodArticulo()));
        System.out.println(ar.getCodArticulo());
        dlgGestAriculos.txtDescArt.setText(ar.getDescripcion());
        dlgGestAriculos.cbProveedor.setSelectedIndex(ar.getCodProveedor() - 1);
        dlgGestAriculos.cbMarca.setSelectedIndex(ar.getCodMarca() - 1);
        dlgGestAriculos.txtEfectivo.setText(String.valueOf(ar.getEfectivo()));
        dlgGestAriculos.txtCostoCalc.setText(String.valueOf(ar.getMontoCalculado()));
        dlgGestAriculos.txtTarjeta.setText(String.valueOf(ar.getTarjeta()));
        dlgGestAriculos.txtCosto.setText(String.valueOf(ar.getCosto()));
        dlgGestAriculos.cbUnidad.setSelectedIndex(ar.getCodUnidad() - 1);
        dlgGestAriculos.txtFecha.setText(ar.getFecha());
        dlgGestAriculos.cbRubr.setSelectedIndex(ar.getCodRubro() - 1);
        dlgGestAriculos.txtStock.setText(String.valueOf(ar.getStock()));
        dlgGestAriculos.txtStockMin.setText(stm);
    }

    public static Articulo capturarCampos() {
        Articulo art;
        int codA = Integer.parseInt(dlgGestAriculos.lblCodArt.getText());
        String desc = dlgGestAriculos.txtDescArt.getText().toUpperCase();
        int codM = Integer.parseInt(dlgGestAriculos.lblMarca.getText());
        int codP = Integer.parseInt(dlgGestAriculos.lblCodProv.getText());
        double efec = Double.parseDouble(dlgGestAriculos.txtEfectivo.getText());
        double monC = Double.parseDouble(dlgGestAriculos.txtCostoCalc.getText());
        double tarj = Double.parseDouble(dlgGestAriculos.txtTarjeta.getText());
        double costo = Double.parseDouble(dlgGestAriculos.txtCosto.getText());
        String fecha = dlgGestAriculos.dcFecha.getText();
        String fechas = Fecha.formatoFecha(fecha);
        int codU = Integer.parseInt(dlgGestAriculos.lblUnidad.getText());
        int codR = Integer.parseInt(dlgGestAriculos.lblRubro.getText());
        double stock = Double.parseDouble(dlgGestAriculos.txtStock.getText());

        art = new Articulo(codA, desc, codM, codP, efec, monC, tarj, costo, fechas, codU, codR, stock);
        return art;
    }

    public static String addArticulo() {
        String msg;
        Articulo art = capturarCampos();
        msg = GestionarArticulos.addArticulo(art);
        if (msg == null) {
            Mensajes.informacion("Artículo Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

//    public static void addImagen(String cod) {
//        GestionarArticulos.addImagen(cod);
//    }
//
//    public static void actImagen(String cod) {
//        GestionarArticulos.actImagen(cod);
//    }
//
//    public static void busImagen(String cod, JLabel lblImagen) {
//        GestionarArticulos.busImagen(cod, lblImagen);
//    }

    public static String actArticulo() {
        String msg;
        Articulo art = capturarCampos();
        msg = GestionarArticulos.actArticulo(art);
        if (msg == null) {
            Mensajes.informacion("Artículo Modifcado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static Articulo busArticulo(String cod) {
        Articulo art = null;
        art = GestionarArticulos.busArticulo(cod);
        return art;
    }

    public static String delArticulo() {
        int x = dlgArticulos.jTable1.getSelectedRow();
        String msg;
        String cod = dlgArticulos.jTable1.getValueAt(x, 0).toString();
        msg = GestionarArticulos.delArticulo(cod);
        if (msg == null) {
            Mensajes.informacion("Artículo Eliminado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listArticulo(JTable tabla, String cod) {
        List lista = null;
        lista = GestionarArticulos.listArticulo(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
//            fila[0].toString();
//            fila[1].toString();
//            fila[2].toString();
//            fila[3].toString();
//            fila[4].toString();
//            fila[5].toString();
//            fila[6].toString();
//            fila[7].toString();
//            fila[8].toString();
//            fila[9].toString();
//            fila[10].toString();
//            fila[11].toString();
//            fila[12].toString();
            tb.addRow(fila);
        }
    }

    public static void filtrar(JTable tabla, String cod) {
        List lista = null;
        lista = GestionarArticulos.filtrarArticulo(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }

    public static void filrarProveedor(JTable tabla, String pr) {
        List lista = null;
        lista = GestionarArticulos.filtProveedor(pr);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }

    public static void filtrarRubro(JTable tabla, String rb) {
        List lista = null;
        lista = GestionarArticulos.filtrarRubro(rb);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }

    public static void filtrarMarca(JTable tabla, String rb) {
        List lista = null;
        lista = GestionarArticulos.filtrarMarca(rb);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }
}
