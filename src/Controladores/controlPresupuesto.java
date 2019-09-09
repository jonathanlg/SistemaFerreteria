package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Componentes.Redondeo;
import Datos.ArregloPresupuesto;
import Datos.GestionarArticulos;
import Datos.GestionarCliente;
import Datos.GestionarPresupuesto;
import IU.*;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.detalle_presupuesto;
import Modelo.prespuesto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlPresupuesto {
    
    static Cliente cl;
    static Articulo art;
    static detalle_presupuesto dp;
    static ArregloPresupuesto array = new ArregloPresupuesto();
    
    public static void selectCliente()//Seleccionar Cliente y exportarlo al formulario
    {
        int x = dlgBuscarClientePresupuesto.jTable1.getSelectedRow();
        String cod = dlgBuscarClientePresupuesto.jTable1.getValueAt(x, 0).toString();
        cl = GestionarCliente.busCliente(cod);
        dlgPresupuestos.txtRazonSocial.setText(cl.getRazonSocial());
        dlgPresupuestos.txtCodCliente.setText(String.valueOf(cl.getCodCliente()));
        dlgPresupuestos.txtDireccion.setText(cl.getDireccion());
        dlgPresupuestos.txtDescuento.setText(String.valueOf(cl.getDesc()));
        dlgPresupuestos.txtObservacion.setText(cl.getOsb());
        dlgPresupuestos.txtRUC.setText(cl.getRuc());
        if(cl.gettPago().equalsIgnoreCase("EFECTIVO"))
            dlgPresupuestos.cbPrecio.setSelectedIndex(0);
        else
            if(cl.gettPago().equalsIgnoreCase("TARJETA"))
                dlgPresupuestos.cbPrecio.setSelectedIndex(1);
    }
    
    public static void selecArticulo()//Seleccionar articulo y exportarlo al formulario
    {
        int x = dlgBuscarArticuloPresupuesto.jTable1.getSelectedRow();
        String  cod = dlgBuscarArticuloPresupuesto.jTable1.getValueAt(x, 0).toString();
        art = GestionarArticulos.busArticulo(cod);
        dlgPresupuestos.lblArticulo.setText(art.getDescripcion());
        dlgPresupuestos.txtCodArticulo.setText(String.valueOf(art.getCodArticulo()));
    }
    
    public static double getMonto()//Calcula el monto por cada articulo que se coloce en la tabla
    {
        double monto = 0;
        DefaultTableModel tb = (DefaultTableModel)dlgPresupuestos.jTable1.getModel();
        int fila = tb.getRowCount();
        for(int i=0;i<fila;i++)
        {
            monto += Double.parseDouble(String.valueOf(dlgPresupuestos.jTable1.getModel().getValueAt(i, 4)));
        }
        return Redondeo.redondear(monto);
    }
    
    public static double getDescuento()//Calcula el descuento
    {
        double desc = 0;
        DefaultTableModel tb = (DefaultTableModel)dlgPresupuestos.jTable1.getModel();
        int fila = tb.getRowCount();
        desc = (getMonto()/100)*cl.getDesc();
        return Redondeo.redondear(desc);
    }
    
    public static void insertar(String cant, String cod, String des, String prec, String total, JTable tabla)//Inserta en la tabla
    {
        Object[] fila = {cant, cod, des, prec, total};
        DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
        tb.addRow(fila);
    }
    
    public static void addTabla(JTable tabla)//Inserta en la tabla los articulos validados
    {
        try {
            int codArt = art.getCodArticulo();
            String desc = art.getDescripcion();
            int cant = Integer.parseInt(dlgPresupuestos.txtCant.getText());
            double pre = art.getEfectivo();
            double monto = Redondeo.redondear(pre*cant);
            
            detalle_presupuesto dps = new detalle_presupuesto(codArt, cant, pre, monto);
            
            if(array.busca(dps.getCodArticulo()) != -1)//Busca que no se repita
            {
                Mensajes.error("Artículo ya fue agregado");
            }
            else
            {
                if(dlgPresupuestos.txtCant.getText().compareTo("0") != 0)//Valida que campo no sea igual a 0
                {
                    if(cant<art.getStock() || cant>art.getStock())//Valida la cantidad con el stock
                    {
                        array.agregar(dps);
                        insertar(String.valueOf(cant), String.valueOf(codArt), desc, String.valueOf(pre), String.valueOf(monto), tabla);
                        double total = getMonto();
                        dlgPresupuestos.txtNeto.setText(String.valueOf(total));
                        dlgPresupuestos.txtDesCalculado.setText(String.valueOf(getDescuento()));
                        dlgPresupuestos.txtTotal.setText(String.valueOf(Redondeo.redondear(total-getDescuento())));
                        int filas = sumarRenglones();
                        dlgPresupuestos.lblArtFilas.setText(String.valueOf(filas+" Artículos"));
                        dlgPresupuestos.lblRenglones.setText(String.valueOf(filas+" Renglones"));
                    }
                    else
                    {
                        Mensajes.informacion("No tiene stock suficiente");
                    }
                }
                else
                {
                    Mensajes.informacion("Ingrese una cantidad");
                }
            }
        } catch (Exception e) {
            Mensajes.informacion("Eliga al menos un artículo");
        }
    }
    
    public static void consLineas()//Metodo buscar articulos en ArrayList
    {
        int fila = dlgPresupuestos.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgPresupuestos.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if( p== -1)
        {
            Mensajes.informacion("Artículo ya existe");
        }
        else
        {
            dp = array.getFila(p);
            int codA = dp.getCodArticulo();
            int cant = dp.getCantidad();
            double pre = dp.getPrecio();
            double total = dp.getMonto();
        }
    }
    
    public static int sumarRenglones()//Suma los renglones de la tabla
    {
        int fila = 0;
        DefaultTableModel tb = (DefaultTableModel)dlgPresupuestos.jTable1.getModel();
        int filas = tb.getRowCount();
        for(int i=0;i<filas;i++)
        {
            fila ++;
        }
        return fila;
    }
    
    public static void delRenglon(JTable tabla)//Quitar un reglon de la tabla
    {
        consLineas();
        int fila = dlgPresupuestos.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgPresupuestos.jTable1.getValueAt(fila, 1).toString());
        int p = array.busca(cod);
        if(p != -1)
        {
            int res = Mensajes.confirmar("Desea quitar "+dlgPresupuestos.jTable1.getValueAt(fila, 2) +" de la lista");
            if(res == 0)
            {
                array.eliminar(p);
                DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
                tb.removeRow(fila);
                double monto = getMonto();
                dlgPresupuestos.txtNeto.setText(String.valueOf(monto));
                dlgPresupuestos.txtDesCalculado.setText(String.valueOf(getDescuento()));
                dlgPresupuestos.txtTotal.setText(String.valueOf(Redondeo.redondear(monto-getDescuento())));
                int filas = sumarRenglones();
                dlgPresupuestos.lblArtFilas.setText(String.valueOf(filas+" Artículos"));
                dlgPresupuestos.lblRenglones.setText(String.valueOf(filas+" Renglones"));
            }
        }
    }
    
    public static void actCantidad()//Actualiza la cantidad de un articulo de la tabla
    {
        try {
            int fila = dlgPresupuestos.jTable1.getSelectedRow();
            double pre = Double.parseDouble(dlgPresupuestos.jTable1.getValueAt(fila, 3).toString());
            int cant = Mensajes.ingresarNumeros();
            double monto = Redondeo.redondear(pre*cant);
            dlgPresupuestos.jTable1.setValueAt(cant, fila, 0);
            dlgPresupuestos.jTable1.setValueAt(monto, fila, 4);
            double total = Redondeo.redondear(getMonto());
            dlgPresupuestos.txtNeto.setText(String.valueOf(total));
            dlgPresupuestos.txtDesCalculado.setText(String.valueOf(getDescuento()));
            dlgPresupuestos.txtTotal.setText(String.valueOf(Redondeo.redondear(total-getDescuento())));
        } catch (Exception e) {
            Mensajes.informacion("Seleccione una fila de tabla");
        }
    }
    
    public static void actPrecio()//Actualiza el precio de un articulo de la tabla
    {
        try {
            int fila = dlgPresupuestos.jTable1.getSelectedRow();
            int cant = Integer.parseInt(dlgPresupuestos.jTable1.getValueAt(fila, 0).toString());
            double pre = Mensajes.ingresarDecimales();
            double monto = Redondeo.redondear(pre*cant);
            dlgPresupuestos.jTable1.setValueAt(pre, fila, 3);
            dlgPresupuestos.jTable1.setValueAt(monto, fila, 4);
            double total = Redondeo.redondear(getMonto());
            dlgPresupuestos.txtNeto.setText(String.valueOf(total));
            dlgPresupuestos.txtDesCalculado.setText(String.valueOf(getDescuento()));
            dlgPresupuestos.txtTotal.setText(String.valueOf(Redondeo.redondear(total-getDescuento())));
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }
    
    public static double actDescuento()//Actualiza el descuento global del presupuesto
    {
        double desc = Double.parseDouble(dlgPresupuestos.txtDescuento.getText());
        DefaultTableModel tb = (DefaultTableModel)dlgPresupuestos.jTable1.getModel();
        int fila = tb.getRowCount();
        double desAct = ((getMonto()/100)*desc);
        double monto = getMonto();
        dlgPresupuestos.txtTotal.setText(String.valueOf(Redondeo.redondear(monto-desAct)));
        return Redondeo.redondear(desAct);
    }
    
    public static void finalizar(JTable tabla)//Metodo que se dispara al presionar el boton finalizar del formulario
    {
        int fila = 0;
        DefaultTableModel tb = (DefaultTableModel)dlgPresupuestos.jTable1.getModel();
        int renglones = tb.getRowCount();
        for(int i=0;i<renglones;i++)//Recorre todas las filas de la tabla
            fila++;
        if(fila<=0)//Valida que la tabla no este vacia
            Mensajes.error("No ha ingresado artículos");
        else//Envia al siguiente formulario
        {
            dlgFinPresupuesto fp = new dlgFinPresupuesto(null, false);
            fp.setLocationRelativeTo(null);
            double total = Redondeo.redondear(getMonto()-actDescuento());
            dlgFinPresupuesto.txtTotal.setText(String.valueOf(total));
            fp.setVisible(true);
        }
    }
    
    public static void canCelar()//Cancelar proceso y vaciar el ArrayList
    {
        array.vaciar();
    }
    
    public static String addPresupuesto()//Registrar el presupuesto
    {
        String msg;
        int codPresupuesto = Integer.parseInt(dlgPresupuestos.txtCodPresupuesto.getText());
        int codVendedor = Integer.parseInt(dlgPresupuestos.lblVendedor.getText());
        int codCliente = Integer.parseInt(dlgPresupuestos.txtCodCliente.getText());
        double descuento = Double.parseDouble(dlgPresupuestos.txtDesCalculado.getText());
        String tipoPago = dlgPresupuestos.cbPrecio.getSelectedItem().toString();
        String fecha = dlgPresupuestos.dcFecha.getText();
        String fechaF = Fecha.formatoFecha(fecha);        
        double total = Double.parseDouble(dlgPresupuestos.txtTotal.getText());
        
        prespuesto p = new prespuesto(codPresupuesto, codVendedor, codCliente,descuento, tipoPago, fechaF, total);
        
        array.vaciar();
        
        msg = GestionarPresupuesto.addPresupuesto(p);
        
        if(msg == null)
        {
            Mensajes.informacion("Presupuesto Realizado");
        }
        else
        {
            Mensajes.error("Ocurrio un problema al registrar el presupuesto "+msg);
        }
        
        return msg;
    }
    
    public static String addDetallePresupuesto()//Registrar las lineas del presupuesto
    {
        String msg = null;
        int fila = dlgPresupuestos.jTable1.getRowCount();
        for(int i=0;i<fila;i++)
        {
            int codPresupuesto = Integer.parseInt(dlgPresupuestos.txtCodPresupuesto.getText());
            int codArticulo = Integer.parseInt(dlgPresupuestos.jTable1.getValueAt(i, 1).toString());
            int cantidad = Integer.parseInt(dlgPresupuestos.jTable1.getValueAt(i, 0).toString());
            double pre = Double.parseDouble(dlgPresupuestos.jTable1.getValueAt(i, 3).toString());
            double monto = Double.parseDouble(dlgPresupuestos.jTable1.getValueAt(i, 4).toString());
            
            dp = new detalle_presupuesto(codPresupuesto, codArticulo, cantidad, pre, monto);
            
            msg = GestionarPresupuesto.addDetallePresupuesto(dp);
        }
        
        if(msg == null)
        {
            Mensajes.informacion("Detalle Registrado");
        }
        else
        {
            Mensajes.error("Ocurrio un erro al registrar los articulo"+ msg);
        }
        return msg;
    }
    
    public static void anularPresupuesto()
    {
        String msg;
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 0).toString();
        msg = GestionarPresupuesto.actPresupuesto(cod);
        if(msg == null)
        {
            Mensajes.informacion("Presupuesto anulado");
        }
        else
        {
            Mensajes.error(msg);
        }
    }
    
    public static void aceptarPresupuesto()
    {
        String msg;
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 0).toString();
        msg = GestionarPresupuesto.presAceptado(cod);
        if(msg == null)
        {
            Mensajes.informacion("Presupuesto Aceptado");
        }
        else
        {
            Mensajes.error(msg);
        }
    }
    
    public static void presPendiente()
    {
        String msg;
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 0).toString();
        msg = GestionarPresupuesto.presPendiente(cod);
        if(msg == null)
        {
            Mensajes.informacion("Presupuesto Pendiente");
        }
        else
        {
            Mensajes.error(msg);
        }
    }
    
    public static void rechazarPresupuesto()
    {
        String msg;
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 0).toString();
        msg = GestionarPresupuesto.presRechazado(cod);
        if(msg == null)
        {
            Mensajes.informacion("Presupuesto Rechazado");
        }
        else
        {
            Mensajes.error(msg);
        }
    }
    
    public static void listPresupuestos(JTable tabla)//Lista los presupuestos
    {
        List lista;
        lista = GestionarPresupuesto.listPresupuesto();
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void listDetallePresupuesto(JTable tabla)//Lista el detalle del presupuesto seleccionado
    {
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 0).toString();
        String fecha = dlgConsultarPresupuesto.jTable1.getValueAt(x, 1).toString();
        String des = dlgConsultarPresupuesto.jTable1.getValueAt(x, 4).toString();
        String total = dlgConsultarPresupuesto.jTable1.getValueAt(x, 5).toString();
        dlgConsultarPresupuesto.txtCodPresupuesto.setText(cod);
        dlgConsultarPresupuesto.txtFecha.setText(fecha);
        dlgConsultarPresupuesto.txtDescGlobal.setText(des);
        dlgConsultarPresupuesto.txtTotal.setText(total);
        List lista;
        lista = GestionarPresupuesto.listDetallePresupuest(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void habilitar()
    {
        dlgConsultarPresupuesto.btnAceptado.setEnabled(true);
        dlgConsultarPresupuesto.btnPendiente.setEnabled(true);
        dlgConsultarPresupuesto.btnRechazado.setEnabled(true);
        dlgConsultarPresupuesto.btnAnular.setEnabled(true);
    }
    
    public static void estado()//Verificar el estado del presupuesto
    {
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 0).toString();
        prespuesto pre = GestionarPresupuesto.busPresupuesto(cod);
        if(pre.getIndicador().equalsIgnoreCase("S"))
        {
            habilitar();
            dlgConsultarPresupuesto.btnPendiente.setEnabled(false);
        }
        else
            if(pre.getIndicador().equalsIgnoreCase("A"))
            {
                habilitar();
                dlgConsultarPresupuesto.btnAceptado.setEnabled(false);
            }
        else
                if(pre.getIndicador().equalsIgnoreCase("R"))
                {
                    habilitar();
                    dlgConsultarPresupuesto.btnRechazado.setEnabled(false);
                }
                else{
                    if(pre.getIndicador().equalsIgnoreCase("N")){
                        dlgConsultarPresupuesto.btnPendiente.setEnabled(false);
                        dlgConsultarPresupuesto.btnAceptado.setEnabled(false);
                        dlgConsultarPresupuesto.btnRechazado.setEnabled(false);
                        dlgConsultarPresupuesto.btnAnular.setEnabled(false);
                    }
                }
    }
    
    public static void listClientes()//Mostrar los datos del cliente
    {
        int x = dlgConsultarPresupuesto.jTable1.getSelectedRow();
        String cod = dlgConsultarPresupuesto.jTable1.getValueAt(x, 3).toString();
        Cliente c = GestionarCliente.busCliente(cod);
        dlgConsultarPresupuesto.txtCodCliente.setText(String.valueOf(c.getCodCliente()));
        dlgConsultarPresupuesto.txtRazon.setText(c.getRazonSocial());
        dlgConsultarPresupuesto.txtRuc.setText(c.getRuc());
        dlgConsultarPresupuesto.txtDireccion.setText(c.getDireccion());
        dlgConsultarPresupuesto.txtDesc.setText(String.valueOf(c.getDesc()));
        dlgConsultarPresupuesto.txtObs.setText(c.getOsb());
    }
    
}
