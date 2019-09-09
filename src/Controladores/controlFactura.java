package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Componentes.Redondeo;
import Datos.*;
import IU.*;
import Modelo.*;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlFactura {

    static Cliente cl;
    static Articulo art;
    static DetalleFactura dfa;
    static ArregloFactura array = new ArregloFactura();

    public static void selecArticulo()//Seleccionar Artículo
    {
        int x = dlgBuscarArticuloFactura.jTable1.getSelectedRow();
        String cod = dlgBuscarArticuloFactura.jTable1.getValueAt(x, 0).toString();
        art = GestionarArticulos.busArticulo(cod);
        dlgFactura.txtCodArticulo.setText(String.valueOf(art.getCodArticulo()));
        dlgFactura.lblDescripcion.setText(art.getDescripcion());
    }

    public static void selectCliente()//Seleccionar Cliente
    {
        int x = dlgBuscarCliente.jTable1.getSelectedRow();
        String cod = dlgBuscarCliente.jTable1.getValueAt(x, 0).toString();
        cl = GestionarCliente.busCliente(cod);
        dlgFactura.txtNombre.setText(cl.getRazonSocial());
        dlgFactura.txtCodCliente.setText(String.valueOf(cl.getCodCliente()));
        dlgFactura.txtDireccion.setText(cl.getDireccion());
        dlgFactura.txtDescuento.setText(String.valueOf(cl.getDesc()));
        dlgFactura.txtObservacion.setText(cl.getOsb());
        dlgFactura.txtRuc.setText(cl.getRuc());
        if (cl.gettPago().equalsIgnoreCase("EFECTIVO")) {
            dlgFactura.cbPrecio.setSelectedIndex(0);
        } else if (cl.gettPago().equalsIgnoreCase("TARJETA")) {
            dlgFactura.cbPrecio.setSelectedIndex(1);
        }
        dlgFactura.cbZona.setSelectedIndex(cl.getCodZona() - 1);
    }

    public static double getTotal()//Calcula el total de la venta
    {
        double total = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgFactura.jTable1.getModel();
        int fila = tb.getRowCount();
        for (int i = 0; i < fila; i++) {
            total += Double.parseDouble(String.valueOf(dlgFactura.jTable1.getModel().getValueAt(i, 4)));
        }
        return Redondeo.redondear(total);
    }

    public static double getDescuento()//Calcula el descuenti global
    {
        double desc = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgFactura.jTable1.getModel();
        int fila = tb.getRowCount();
        desc = (getTotal() / 100) * cl.getDesc();
        return Redondeo.redondear(desc);
    }

    public static void insertar(String cant, String cod, String descripcion, String precio, String total, String sa, JTable tabla)//Insertar en jtable
    {
        Object[] fila = {cant, cod, descripcion, precio, total, sa};
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        tb.addRow(fila);
    }

    public static double actStock() {
        int cant = Integer.parseInt(dlgFactura.txtCant.getText());
        return art.getStock() - cant;
    }

    public static void addTabla(JTable tabla)//Metodo para agregar lineas al detalle
    {
        try {
            int codA = art.getCodArticulo();
            String descrip = art.getDescripcion();
            int cant = Integer.parseInt(dlgFactura.txtCant.getText());
            double prec = art.getEfectivo();
            double monto = Redondeo.redondear(prec * cant);
            double sa = actStock();

            DetalleFactura df = new DetalleFactura(codA, cant, prec, monto);

            if (array.busca(df.getCodArticulo()) != -1)//Busca que el articulo no se repita
            {
                Mensajes.error("Articulo ya fue Agregado");
            } else {
                if (dlgFactura.txtCant.getText().compareTo("0") != 0)//Valida la cantidad ingresada
                {
                    if (cant < art.getStock() || cant > art.getStock())//Valida que cantidad no exceda stock
                    {
                        array.agregar(df);
                        insertar(String.valueOf(cant), String.valueOf(codA), descrip, String.valueOf(prec), String.valueOf(monto), String.valueOf(sa), tabla);
                        double total = getTotal();
                        dlgFactura.txtNeto.setText(String.valueOf(getTotal()));
                        dlgFactura.txtDescCalculado.setText(String.valueOf(getDescuento()));
                        dlgFactura.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
                    } else {
                        Mensajes.error("No tiene stock Suficiente");
                    }
                } else {
                    Mensajes.informacion("Ingrese una Cantidad");
                }
            }
        } catch (Exception e) {
            Mensajes.informacion("Eliga al menos un Articulo");
        }
    }

    public static void consLinea()//Buscar linea en ArrayList
    {
        int fila = dlgFactura.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgFactura.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if (p == -1) {
            Mensajes.informacion("Articulo no existe");
        } else {
            dfa = array.getFila(p);
            int codA = dfa.getCodArticulo();
            int cant = dfa.getCantidad();
            double pre = dfa.getPrecio();
            double monto = dfa.getTotal();
        }
    }

    public static void delRenglon(JTable tabla)//Quita un renglon del detalle
    {
        consLinea();
        int fila = dlgFactura.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgFactura.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if (p != -1) {
            int res = Mensajes.confirmar("Desea quitar esta linea");
            if (res == 0) {
                array.eliminar(p);
                DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
                tb.removeRow(fila);
                double total = getTotal();
                dlgFactura.txtNeto.setText(String.valueOf(total));
                dlgFactura.txtDescCalculado.setText(String.valueOf(getDescuento()));
                dlgFactura.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
            }
        }
    }

    public static void finalizar(JTable tabla)//Evento que se dispara al presionar el boton aceptar
    {
        int fila = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgFactura.jTable1.getModel();
        int renglones = tb.getRowCount();
        for (int i = 0; i < renglones; i++) {
            fila++;
        }
        if (fila <= 0) {
            Mensajes.error("No ha ingresado artículo");
        } else {
            dlgFinFactura ff = new dlgFinFactura(null, false);
            ff.setLocationRelativeTo(null);
            double total = Redondeo.redondear((getTotal() - actDescuento()));
            dlgFinFactura.txtTotal.setText(String.valueOf(total));
            dlgFinFactura.lblTotal.setText(String.valueOf(total));
            dlgFinFactura.lblEfectivo.setText(String.valueOf(total));
            dlgFinFactura.lblVuelto.setText(String.valueOf(actDescuento()));
            dlgFinFactura.txtAbono.requestFocus();
            ff.setVisible(true);
            dlgFinFactura.txtAbono.selectAll();
        }
    }

    public static double calCulos()//Metodo que realiza los calculos finales de la venta
    {
        double total = Double.parseDouble(dlgFinFactura.txtTotal.getText());
        double abono = Double.parseDouble(dlgFinFactura.txtAbono.getText());
        double vuelto = abono - total;
        return Redondeo.redondear(vuelto);
    }

    public static void actCantidad()//Actualiza la cantidad del articulo seleccionado
    {
        try {
            int fila = dlgFactura.jTable1.getSelectedRow();
            double prec = Double.parseDouble(dlgFactura.jTable1.getValueAt(fila, 3).toString());
            int cant = Mensajes.ingresarNumeros();
            double monto = prec * cant;
            double sa = (art.getStock() - cant);
            dlgFactura.jTable1.setValueAt(cant, fila, 0);
            dlgFactura.jTable1.setValueAt(monto, fila, 4);
            dlgFactura.jTable1.setValueAt(sa, fila, 5);
            double total = Redondeo.redondear(getTotal());
            dlgFactura.txtNeto.setText(String.valueOf(total));
            dlgFactura.txtDescCalculado.setText(String.valueOf(getDescuento()));
            dlgFactura.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
        } catch (NumberFormatException e) {
            Mensajes.informacion("Seleccione una fila de la tabla ");
        }
    }

    public static void actPrecio()//Actualiza la cantidad del articulo seleccionado
    {
        try {
            int fila = dlgFactura.jTable1.getSelectedRow();
            int cant = Integer.parseInt(dlgFactura.jTable1.getValueAt(fila, 0).toString());
            double pre = Mensajes.ingresarDecimales();
            double monto = pre * cant;
            dlgFactura.jTable1.setValueAt(pre, fila, 3);
            dlgFactura.jTable1.setValueAt(monto, fila, 4);
            double total = Redondeo.redondear(getTotal());
            dlgFactura.txtNeto.setText(String.valueOf(total));
            dlgFactura.txtDescCalculado.setText(String.valueOf(getDescuento()));
            dlgFactura.txtTotal.setText(String.valueOf(Redondeo.redondear(total - getDescuento())));
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }

    public static double actDescuento()//Actualiza el descuento global
    {
        double desc = Double.parseDouble(dlgFactura.txtDescuento.getText());
        DefaultTableModel tb = (DefaultTableModel) dlgFactura.jTable1.getModel();
        int fila = tb.getRowCount();
        double descAct = ((getTotal() / 100) * desc);
        double total = getTotal();
        dlgFactura.txtTotal.setText(String.valueOf(Redondeo.redondear(total - descAct)));
        return Redondeo.redondear(descAct);
    }

    public static void canCelar()//Cancelar la venta y vaciar ArrayList
    {
        array.vaciar();
    }

    public static String addFactura()//Registra la nueva factura
    {
        String msg;
        int codFacfura = Integer.parseInt(dlgFactura.txtCodFactura.getText());
        int codCliente = Integer.parseInt(dlgFactura.txtCodCliente.getText());
        int codVendedor = Integer.parseInt(dlgFactura.lblVendedor.getText());
        double descuento = Double.parseDouble(dlgFactura.txtDescCalculado.getText());
        String tipoPago = dlgFactura.cbPrecio.getSelectedItem().toString();
        String fecha = dlgFactura.dcFecha.getText();
        String fechaF = Fecha.formatoFecha(fecha);
        double neto = Double.parseDouble(dlgFactura.txtNeto.getText());
        double total = Double.parseDouble(dlgFactura.txtTotal.getText());

        Factura f = new Factura(codFacfura, codCliente, codVendedor, descuento, tipoPago, fechaF, neto, total);

        array.vaciar();

        msg = GestionarFactura.addFactura(f);

        if (msg == null) {
            Mensajes.informacion("Venta Realizada");
        } else {
            Mensajes.error(msg);
        }
        return msg;

    }

    public static String addDetalleFactura()//Registra las lineas de la factura
    {
        String msg = null;
        int fila = dlgFactura.jTable1.getRowCount();
        for (int i = 0; i < fila; i++) {
            int codFactu = Integer.parseInt(dlgFactura.txtCodFactura.getText());
            int codArt = Integer.parseInt(dlgFactura.jTable1.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(dlgFactura.jTable1.getValueAt(i, 0).toString());
            double pre = Double.parseDouble(dlgFactura.jTable1.getValueAt(i, 3).toString());
            double monto = Double.parseDouble(dlgFactura.jTable1.getValueAt(i, 4).toString());

            dfa = new DetalleFactura(codFactu, codArt, cant, pre, monto);

            msg = GestionarFactura.addDetalleFactura(dfa);
        }
        if (msg == null) {
            Mensajes.informacion("Detalle Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String anularFactura()//Metodo para anular facturas
    {
        String msg;
        int x = dlgConsultarFacturas.tblFactura.getSelectedRow();
        String cod = dlgConsultarFacturas.tblFactura.getValueAt(x, 0).toString();
        msg = GestionarFactura.actFactura(cod);
        if (msg == null) {
            Mensajes.informacion("Factura Anulada");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String actStocks() {
        String msg = null;
        int f = dlgFactura.jTable1.getRowCount();
        for (int i = 0; i < f; i++) {
            int coA = Integer.parseInt(dlgFactura.jTable1.getValueAt(i, 1).toString());
            double st = Double.parseDouble(dlgFactura.jTable1.getValueAt(i, 5).toString());
            Articulo a = new Articulo(coA, st);
            msg = GestionarArticulos.actStock(a);
        }
        if (msg == null) {
            Mensajes.informacion("Stock Actualizado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listFacturas(JTable tabla)//Lista las facturas realizadas
    {
        List lista = null;
        lista = GestionarFactura.listFacturas();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void listFacturas2(JTable tabla)//Lista las facturas realizadas
    {
        List lista;
        lista = GestionarFactura.lisFacturas2();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            fila[2].toString();
            fila[3].toString();
            fila[4].toString();
            tb.addRow(fila);
        }
    }
    
//    public static void listFacturasAnuladas(JTable tabla)//Lista las facturas realizadas
//    {
//        List lista;
//        lista = GestionarFactura.listFacturasAnuladas();
//        for (int i = 1; i < lista.size(); i++) {
//            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
//            Object[] fila = (Object[]) lista.get(i);
//            fila[0].toString();
//            fila[1].toString();
//            fila[2].toString();
//            fila[3].toString();
//            fila[4].toString();
//            tb.addRow(fila);
//        }
//    }    

    public static void listDetalle(JTable tabla)//Lista el detalle de la factura seleccionada
    {
        int x = dlgConsultarFacturas.tblFactura.getSelectedRow();
        String cod = dlgConsultarFacturas.tblFactura.getValueAt(x, 0).toString();
        String fecha = dlgConsultarFacturas.tblFactura.getValueAt(x, 2).toString();
        String des = dlgConsultarFacturas.tblFactura.getValueAt(x, 4).toString();
        String total = dlgConsultarFacturas.tblFactura.getValueAt(x, 5).toString();
        dlgConsultarFacturas.txtTotal.setText(total);
        dlgConsultarFacturas.txtDesGlobal.setText(des);
        dlgConsultarFacturas.txtCodFactura.setText(cod);
        dlgConsultarFacturas.txtFecha.setText(fecha);
        List lista = null;
        lista = GestionarFactura.listDetalles(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void ListClientes()//Mostrar informacion del cliente
    {
        int x = dlgConsultarFacturas.tblFactura.getSelectedRow();
        String cod = dlgConsultarFacturas.tblFactura.getValueAt(x, 3).toString();
        Cliente c = GestionarCliente.busCliente(cod);
        dlgConsultarFacturas.txtCodCliente.setText(String.valueOf(c.getCodCliente()));
        dlgConsultarFacturas.txtRazonSocial.setText(c.getRazonSocial());
        dlgConsultarFacturas.txtRuc.setText(c.getRuc());
        dlgConsultarFacturas.txtDireccion.setText(c.getDireccion());
        dlgConsultarFacturas.txtDesc.setText(String.valueOf(c.getDesc()));
    }

    public static void selecVendedor()//Seleccionar Vendedor
    {
        int x = dlgConsultarFacturas.tblFactura.getSelectedRow();
        String cod = dlgConsultarFacturas.tblFactura.getValueAt(x, 6).toString();
        Vendedor ven = GestionarVendedor.busVendedor(cod);
        dlgConsultarFacturas.txtVendedor.setText(ven.getNombreV());
    }

    public static void fillCliente(JTable tabla, String nom) {
        List lista;
        lista = GestionarFactura.fillCliente(nom);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

}
