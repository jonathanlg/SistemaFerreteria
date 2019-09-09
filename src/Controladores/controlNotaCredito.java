package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Componentes.Redondeo;
import Datos.*;
import IU.dlgBuscarArticuloNCredito;
import IU.dlgBuscarFactura;
import IU.dlgConsNotaCredito;
import IU.dlgNotasCredito;
import Modelo.*;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlNotaCredito {

    static CabecerasTablas cabe = new CabecerasTablas();
    static Factura fac;
    static Cliente cli;
    static Vendedor vend;
    static Articulo art;
    static detalle_notaCredito dnc;
    static ArregloNotasCredito array = new ArregloNotasCredito();

    public static void selectFactura()//Seleccionar la factura
    {
        int x = dlgBuscarFactura.jTable1.getSelectedRow();
        String cod = dlgBuscarFactura.jTable1.getValueAt(x, 0).toString();
        fac = GestionarFactura.busFactura(cod);
        dlgNotasCredito.txtCodFactura.setText(String.valueOf(fac.getCodFactura()));
        dlgNotasCredito.txtNeto.setText(String.valueOf(Redondeo.redondear(fac.getTotal())));
        dlgNotasCredito.txtDescTotal.setText(String.valueOf(fac.getDescuento()));
        dlgNotasCredito.txtTotal.setText(String.valueOf(fac.getTotal()-fac.getDescuento()));
        dlgNotasCredito.txtFEcha.setText(fac.getFecha());
    }

    public static void selectCliente()//Traer los datos del cliente en la factura
    {
        int x = dlgBuscarFactura.jTable1.getSelectedRow();
        String cod = dlgBuscarFactura.jTable1.getValueAt(x, 3).toString();
        cli = GestionarCliente.busCliente(cod);
        dlgNotasCredito.txtCodCliente.setText(String.valueOf(cli.getCodCliente()));
        dlgNotasCredito.txtRazonS.setText(cli.getRazonSocial());
        dlgNotasCredito.txtDireccion.setText(cli.getDireccion());
        dlgNotasCredito.txtRUC.setText(cli.getRuc());
        dlgNotasCredito.txtObs.setText(cli.getOsb());
        dlgNotasCredito.txtDescuento.setText(String.valueOf(cli.getDesc()));
    }

    public static void selectVendedor()//Mostrar nombre del vendedor
    {
        int x = dlgBuscarFactura.jTable1.getSelectedRow();
        String cod = dlgBuscarFactura.jTable1.getValueAt(x, 6).toString();
        vend = GestionarVendedor.busVendedor(cod);
        dlgNotasCredito.txtVendedor.setText(vend.getNombreV());
    }

    public static void selectArticulo()//Seleccionar articulo 
    {
        int x = dlgBuscarArticuloNCredito.jTable1.getSelectedRow();
        String cod = dlgBuscarArticuloNCredito.jTable1.getValueAt(x, 0).toString();
        art = GestionarArticulos.busArticulo(cod);
        dlgNotasCredito.txtCodArticulo.setText(String.valueOf(art.getCodArticulo()));
        dlgNotasCredito.lblDescripcion.setText(art.getDescripcion());
    }

    public static void addArray() { //Agregar informacion de la factura al Array
        CabecerasTablas.limpiarTablas(dlgNotasCredito.jTable1);
        cabe.detallePresupuesto(dlgNotasCredito.jTable1);
        controlNotaCredito.listDetalle(dlgNotasCredito.jTable1);
        DefaultTableModel tb = (DefaultTableModel) dlgNotasCredito.jTable1.getModel();
        int fila = tb.getRowCount();
        for (int i = 0; i < fila; i++) {
            int codArt = Integer.parseInt(String.valueOf(dlgNotasCredito.jTable1.getModel().getValueAt(i, 1)));
            int cant = Integer.parseInt(String.valueOf(dlgNotasCredito.jTable1.getModel().getValueAt(i, 0)));
            double pre = Double.parseDouble(String.valueOf(dlgNotasCredito.jTable1.getModel().getValueAt(i, 3)));
            double total = Double.parseDouble(String.valueOf(dlgNotasCredito.jTable1.getModel().getValueAt(i, 4)));

            detalle_notaCredito dn = new detalle_notaCredito(codArt, cant, pre, total);
            array.agregar(dn);
        }
    }

    public static double getTotal() { //Calcula el total del proceso
        double total = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgNotasCredito.jTable1.getModel();
        int fila = tb.getRowCount();
        for (int i = 0; i < fila; i++) {
            total += Double.parseDouble(String.valueOf(dlgNotasCredito.jTable1.getModel().getValueAt(i, 4)));
        }
        System.out.println(String.valueOf(total));
        return Redondeo.redondear(total);
    }

    public static double getDescuento() { //Calcula el descuento total
        double desc = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgNotasCredito.jTable1.getModel();
        int fila = tb.getRowCount();
        desc = (getTotal() / 100 * cli.getDesc());
        return Redondeo.redondear(desc);
    }

    public static void addTabla(JTable tabla)//Agregar al detalle los articulos
    {
        try {
            int codArt = art.getCodArticulo();
            String desc = art.getDescripcion();
            int cant = Integer.parseInt(dlgNotasCredito.txtCant.getText());
            double pre = art.getEfectivo();
            double monto = Redondeo.redondear(pre * cant);

            detalle_notaCredito dn = new detalle_notaCredito(codArt, cant, pre, monto);

            if (array.busca(dn.getCodArticulo()) != -1) { //Busca que el articulo no se repita
                Mensajes.error("Artículo ya fue agregado");
            } else {
                if (dlgNotasCredito.txtCant.getText().compareTo("0") != 0) { //Valida la cantidad ingresada
                    if (cant < art.getStock() || cant > art.getStock()) {
                        array.agregar(dn);
                        insertar(String.valueOf(cant), String.valueOf(codArt), desc, String.valueOf(pre), String.valueOf(monto), tabla);
                        double total = getTotal();
                        dlgNotasCredito.txtNeto.setText(String.valueOf(total));
                        dlgNotasCredito.txtDescTotal.setText(String.valueOf(getDescuento()));
                        dlgNotasCredito.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
                    } else {
                        Mensajes.error("No tiene stock suficiente");
                    }
                } else {
                    Mensajes.informacion("Ingrese la cantidad");
                }
            }
        } catch (Exception e) {
            Mensajes.informacion("Eliga al meno un artículos");
        }
    }

    public static void insertar(String cant, String cod, String desc, String prec, String total, JTable tabla) {
        Object[] fila = {cant, cod, desc, prec, total};
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        tb.addRow(fila);
    }

    public static void consLinea() { //Buscar una linea en el ArrayList
        int fila = dlgNotasCredito.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgNotasCredito.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if (p == -1) {
            Mensajes.informacion("Articulo no existe");
        } else {
            dnc = array.getFila(p);
            int codA = dnc.getCodArticulo();
            int cant = dnc.getCantidad();
            double pre = dnc.getPrecio();
            double monto = dnc.getTotal();
        }
    }

    public static void delRenglon(JTable tabla) { //Quita un renglon del detalle
        consLinea();
        int fila = dlgNotasCredito.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgNotasCredito.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if (p != -1) {
            int res = Mensajes.confirmar("Desea quitar esta línea");
            if (res == 0) {
                array.eliminar(p);
                DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
                tb.removeRow(fila);
                double total = getTotal();
                dlgNotasCredito.txtNeto.setText(String.valueOf(total));
                dlgNotasCredito.txtDescTotal.setText(String.valueOf(getDescuento()));
                dlgNotasCredito.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
            }
        }
    }

    public static void finalizar(JTable tabla) { //Evento que se dispara al presionar el boton aceptar
        int fila = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgNotasCredito.jTable1.getModel();
        int renglones = tb.getRowCount();
        for (int i = 0; i < renglones; i++) {
            fila++;
        }
        if (fila <= 0) {
            Mensajes.error("No ha ingresado artículo");
        } else {
            addNotaCredito();
            addDetalleNotaCredito();
        }
    }

    public static void actCantidad() { //Actualiza la cantidad del articulo seleccionado
        try {
            int fila = dlgNotasCredito.jTable1.getSelectedRow();
            double prec = Double.parseDouble(dlgNotasCredito.jTable1.getValueAt(fila, 3).toString());
            int cant = Mensajes.ingresarNumeros();
            double monto = prec * cant;
            dlgNotasCredito.jTable1.setValueAt(cant, fila, 0);
            dlgNotasCredito.jTable1.setValueAt(monto, fila, 4);
            double total = Redondeo.redondear(getTotal());
            dlgNotasCredito.txtNeto.setText(String.valueOf(total));
            dlgNotasCredito.txtDescTotal.setText(String.valueOf(getDescuento()));
            dlgNotasCredito.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
        } catch (NumberFormatException e) {
            Mensajes.informacion("Seleccione una fila de la tabla"+e.toString());
        }
    }

    public static void actPrecio() { //Actualiza el precion del articulo seleccionado
        try {
            int fila = dlgNotasCredito.jTable1.getSelectedRow();
            int cant = Integer.parseInt(dlgNotasCredito.jTable1.getValueAt(fila, 0).toString());
            double prec = Mensajes.ingresarDecimales();
            double monto = prec * cant;
            dlgNotasCredito.jTable1.setValueAt(prec, fila, 3);
            dlgNotasCredito.jTable1.setValueAt(monto, fila, 4);
            double total = Redondeo.redondear(getTotal());
            dlgNotasCredito.txtNeto.setText(String.valueOf(total));
            dlgNotasCredito.txtDescTotal.setText(String.valueOf(getDescuento()));
            dlgNotasCredito.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
        } catch (NumberFormatException e) {
            Mensajes.informacion("Seleccione una fila de la tabla");
        }
    }

    public static double actDescuento() { //Actualiza el descuento global
        double desc = Double.parseDouble(dlgNotasCredito.txtDescuento.getText());
        DefaultTableModel tb = (DefaultTableModel) dlgNotasCredito.jTable1.getModel();
        int fila = tb.getRowCount();
        double descAct = ((getTotal() / 100) * desc);
        double total = getTotal();
        dlgNotasCredito.txtTotal.setText(String.valueOf(Redondeo.redondear(total - descAct)));
        return Redondeo.redondear(descAct);
    }

    public static void listDetalle(JTable tabla)//Listar los articulos de la factura consultada
    {
        String cod = dlgNotasCredito.txtCodFactura.getText();
        List lista = null;
        lista = GestionarFactura.listDetallesF(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void cancelar() { //Cancela el proceso y vacea el ArrayList
        array.vaciar();
    }

    /*Procesos*/
    public static String addNotaCredito() { //Registra la nueva Nota de Credito
        String msg;
        int codNotaCredito = Integer.parseInt(dlgNotasCredito.txtCodNota.getText());
        int codFactura = Integer.parseInt(dlgNotasCredito.txtCodFactura.getText());
        int codCliente = Integer.parseInt(dlgNotasCredito.txtCodCliente.getText());
        double descuento = Double.parseDouble(dlgNotasCredito.txtDescTotal.getText());
        String fecha = dlgNotasCredito.dcFecha.getText();
        String fechaF = Fecha.formatoFecha(fecha);
        double total = Double.parseDouble(dlgNotasCredito.txtTotal.getText());

        notaCredito nc = new notaCredito(codNotaCredito, codFactura, codCliente, descuento, fechaF, total);

        array.vaciar();

        msg = GestionarNotaCretito.addNotaCredit(nc);

        if (msg == null) {
            Mensajes.informacion("Nota de Crédito realizada");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String anularNotaCredito() { //Anula una nota de credito
        String msg;
        int x = dlgConsNotaCredito.jTable1.getSelectedRow();
        String cod = dlgConsNotaCredito.jTable1.getValueAt(x, 0).toString();
        msg = GestionarNotaCretito.actNotaCredito(cod);
        if (msg == null) {
            Mensajes.informacion("Nota de Crédito Anulada");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String addDetalleNotaCredito() { //Registra las lineas del detalle de la nota de credito
        String msg = null;
        int fila = dlgNotasCredito.jTable1.getRowCount();
        for (int i = 0; i < fila; i++) {
            int codNotaCredito = Integer.parseInt(dlgNotasCredito.txtCodNota.getText());
            int codArticulo = Integer.parseInt(dlgNotasCredito.jTable1.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(dlgNotasCredito.jTable1.getValueAt(i, 0).toString());
            double precio = Double.parseDouble(dlgNotasCredito.jTable1.getValueAt(i, 3).toString());
            double total = Double.parseDouble(dlgNotasCredito.jTable1.getValueAt(i, 4).toString());

            dnc = new detalle_notaCredito(codNotaCredito, codArticulo, cantidad, precio, total);

            msg = GestionarNotaCretito.addDetalleNotaCredito(dnc);
        }
        if (msg == null) {
            Mensajes.informacion("Detalle Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listNotaCredtito(JTable tabla) {
        List lista = null;
        lista = GestionarNotaCretito.lisNotaCredito();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void listDetalleNotaCredtito(JTable tabla, String cod) {
        List lista = null;
        lista = GestionarNotaCretito.listDetalleNotaCredito(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void listCliente() {
        int x = dlgConsNotaCredito.jTable1.getSelectedRow();
        String cod = dlgConsNotaCredito.jTable1.getValueAt(x, 3).toString();
        Cliente c = GestionarCliente.busCliente(cod);
        dlgConsNotaCredito.txtCodCliente.setText(String.valueOf(c.getCodCliente()));
        dlgConsNotaCredito.txtRazonSocial.setText(c.getRazonSocial());
        dlgConsNotaCredito.txtRuc.setText(c.getRuc());
        dlgConsNotaCredito.txtDireccion.setText(c.getDireccion());
    }

}
