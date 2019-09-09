package Controladores;

import Componentes.Mensajes;
import Componentes.Redondeo;
import Datos.ArregloCompras;
import Datos.GestionarArticulos;
import Datos.GestionarCompra;
import Datos.GestionarProveedor;
import IU.dlgBuscarArticuloCompra;
import IU.dlgBuscarProveedor;
import IU.dlgCompras;
import IU.dlgConsultarCompras;
import IU.dlgFinCompra;
import Modelo.Articulo;
import Modelo.Compra;
import Modelo.DetalleCompra;
import Modelo.Proveedor;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlCompra {

    static Proveedor prov;
    static Articulo art;
    static DetalleCompra dc;
    static ArregloCompras array = new ArregloCompras();

    public static void selectProveedor() {
        int x = dlgBuscarProveedor.jTable1.getSelectedRow();
        String cod = dlgBuscarProveedor.jTable1.getValueAt(x, 0).toString();
        prov = GestionarProveedor.busProveedor(cod);

        dlgCompras.txtCodProv.setText(String.valueOf(prov.getCodP()));
        dlgCompras.txtRazonS.setText(prov.getRazoS());
        dlgCompras.txtDirec.setText(prov.getDireccion());
        dlgCompras.txtRuc.setText(prov.getRuc());
    }

    public static void selectArticulo() {
        int x = dlgBuscarArticuloCompra.jTable1.getSelectedRow();
        String cod = dlgBuscarArticuloCompra.jTable1.getValueAt(x, 0).toString();
        art = GestionarArticulos.busArticulo(cod);
        dlgCompras.txtArt.setText(art.getDescripcion());
    }

    public static void insertar(String cant, String cod, String desc, String marca, String prec, String total, JTable tabla) {
        Object[] fila = {cant, cod, desc, marca, prec, total};
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        tb.addRow(fila);
    }

    public static double getTotal() {
        double total = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgCompras.jTable1.getModel();
        int fila = tb.getRowCount();
        for (int i = 0; i < fila; i++) {
            total += Double.parseDouble(String.valueOf(dlgCompras.jTable1.getModel().getValueAt(i, 5)));
        }
        return Redondeo.redondear(total);
    }

    public static void addTabla(JTable tabla) {
        try {
            int f = dlgBuscarArticuloCompra.jTable1.getSelectedRow();
            int codA = art.getCodArticulo();
            String desc = art.getDescripcion();
            int cant = Integer.parseInt(dlgCompras.txtCant.getText());
            String marc = dlgBuscarArticuloCompra.jTable1.getValueAt(f, 2).toString();
            double prec = art.getEfectivo();
            double mont = Redondeo.redondear(cant * prec);

            DetalleCompra dco = new DetalleCompra(codA, cant, prec, mont);

            if (array.busca(dco.getCodArticulo()) != -1) {
                Mensajes.error("Articulo ya fue agregado");
            } else {
                if (dlgCompras.txtCant.getText().compareTo("0") != 0) {
                    if (cant < art.getStock() || cant > art.getStock()) {
                        array.agregar(dco);
                        insertar(String.valueOf(cant), String.valueOf(codA), desc, marc, String.valueOf(prec), String.valueOf(mont), tabla);
                        double total = getTotal();
                        dlgCompras.txtTotal.setText(String.valueOf(total));
                    } else {
                        Mensajes.error("No tiene stock suficiente");
                    }
                } else {
                    Mensajes.error("Ingrese una cantidad");
                }
            }

        } catch (Exception e) {
            Mensajes.error("Eliga al menos un articulo");
        }
    }

    public static void consLinea() {
        int fila = dlgCompras.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgCompras.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if (p == -1) {
            Mensajes.informacion("Artículo no existe");
        } else {
            dc = array.getFila(p);
            int codAr = dc.getCodArticulo();
            int cant = dc.getCant();
            double prec = dc.getPrecio();
            double monto = dc.getMonto();
        }
    }

    public static void delRenglon(JTable tabla) {
        consLinea();
        int fila = dlgCompras.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgCompras.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if (p != -1) {
            int res = Mensajes.confirmar("Desea quitar esta linea");
            if (res == 0) {
                array.eliminar(p);
                DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
                tb.removeRow(fila);
                double total = Redondeo.redondear(getTotal());
                dlgCompras.txtTotal.setText(String.valueOf(total));
            }
        }
    }

    public static void canCelar() {
        array.vaciar();
    }

    public static String addCompra() {
        String msg;
        int codc = Integer.parseInt(dlgCompras.txtCodCompra.getText());
        int codProv = Integer.parseInt(dlgCompras.txtCodProv.getText());
        int codCatg = Integer.parseInt(dlgCompras.lblCat.getText());
        String condPago = dlgCompras.cbCondPago.getSelectedItem().toString();
        String fecha = dlgCompras.dcFecha.getText();
        double total = Double.parseDouble(dlgCompras.txtTotal.getText());

        Compra c = new Compra(codc, codProv, codCatg, condPago, fecha, total);

        array.vaciar();
        msg = GestionarCompra.addCompra(c);

        if (msg == null) {
            Mensajes.informacion("Compra Realizada");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String addDetalleCompra() {
        String msg = null;
        int fila = dlgCompras.jTable1.getRowCount();
        for (int i = 0; i < fila; i++) {
            int codArt = Integer.parseInt(dlgCompras.jTable1.getValueAt(i, 1).toString());
            int codCompra = Integer.parseInt(dlgCompras.txtCodCompra.getText());
            int cantidad = Integer.parseInt(dlgCompras.jTable1.getValueAt(i, 0).toString());
            double precio = Double.parseDouble(dlgCompras.jTable1.getValueAt(i, 4).toString());
            double mont = Double.parseDouble(dlgCompras.jTable1.getValueAt(i, 5).toString());

            dc = new DetalleCompra(codArt, codCompra, cantidad, precio, mont);

            msg = GestionarCompra.addDetalleCompra(dc);
        }
        if (msg == null) {
            Mensajes.informacion("Detalle Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void actCantidad(JTable tabla) {
        try {
            int fila = dlgCompras.jTable1.getSelectedRow();
            double pre = Double.parseDouble(dlgCompras.jTable1.getValueAt(fila, 4).toString());
            int cant = Mensajes.ingresarNumeros();
            double monto = pre * cant;
            dlgCompras.jTable1.setValueAt(cant, fila, 0);
            dlgCompras.jTable1.setValueAt(monto, fila, 5);
            double total = getTotal();
            dlgCompras.txtTotal.setText(String.valueOf(total));
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }

    public static void finalizar(JTable tabla) {
        int fila = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgCompras.jTable1.getModel();
        int renglones = tb.getRowCount();
        for (int i = 0; i < renglones; i++) {
            fila++;
        }
        if (fila <= 0) {
            Mensajes.error("No ha ingresado artículos");
        } else {
            dlgFinCompra fc = new dlgFinCompra(null, true);
            fc.setLocationRelativeTo(null);
            double total = Redondeo.redondear(getTotal());
            dlgFinCompra.txtTotal.setText(String.valueOf(total));
            dlgFinCompra.lblTotal.setText(String.valueOf(total));
            dlgFinCompra.lblEfectivo.setText(String.valueOf(total));
            dlgFinCompra.txtAbono.requestFocus();
            dlgFinCompra.txtAbono.selectAll();
            fc.setVisible(true);
        }
    }

    /*------CONSULTADO LAS COMPRAS REALIZADAS*/
    public static void listarCompras(JTable tabla) {
        List lista = null;
        lista = GestionarCompra.listarCompras();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void listarDetalleCompras(JTable tabla) {
        int x = dlgConsultarCompras.jTable1.getSelectedRow();
        String cod = dlgConsultarCompras.jTable1.getValueAt(x, 0).toString();
        String fecha = dlgConsultarCompras.jTable1.getValueAt(x, 1).toString();
        String pro = dlgConsultarCompras.jTable1.getValueAt(x, 2).toString();
        String codPro = dlgConsultarCompras.jTable1.getValueAt(x, 3).toString();
        String total = dlgConsultarCompras.jTable1.getValueAt(x, 4).toString();
        dlgConsultarCompras.txtCodCompra.setText(cod);
        dlgConsultarCompras.txtFechaCompra.setText(fecha);
        dlgConsultarCompras.txtProveedor.setText(pro);
        dlgConsultarCompras.txtTotalCompra.setText("S/. "+total);
        List lista = null;
        lista = GestionarCompra.listarDetalleCompras(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static String anularCompra() {
        String msg;
        int x = dlgConsultarCompras.jTable1.getSelectedRow();
        String cod = dlgConsultarCompras.jTable1.getValueAt(x, 0).toString();
        msg = GestionarCompra.delCompra(cod);
        if (msg == null) {
            Mensajes.informacion("Compra Anulada");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

}
