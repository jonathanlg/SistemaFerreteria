package Controladores;

import Componentes.Fecha;
import Componentes.Mensajes;
import Componentes.Redondeo;
import Datos.ArregloDetalles;
import Datos.GestionarArticulos;
import Datos.GestionarSalida;
import IU.dlgBuscarArticulo;
import IU.dlgConSalidas;
import IU.dlgSalidaMercaderia;
import Modelo.Articulo;
import Modelo.DetalleSalida;
import Modelo.Salidas;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlSalida {
    static DetalleSalida ds;
    static Articulo art;
    static ArregloDetalles array = new  ArregloDetalles();  
    
    public static void selecProducto()
    {
        int x = dlgBuscarArticulo.jTable1.getSelectedRow();
        String cod = dlgBuscarArticulo.jTable1.getValueAt(x, 0).toString();
        art = GestionarArticulos.busArticulo(cod);
        
        dlgSalidaMercaderia.txtArt.setText(art.getDescripcion());
        dlgSalidaMercaderia.txtCant.requestFocus();
    }
    
    public static void addTabla(JTable tabla)
    {
        try {
            int codA = art.getCodArticulo();
            String desc = art.getDescripcion();
            int codM = Integer.parseInt(dlgSalidaMercaderia.lblMotivo.getText());
            String mot = dlgSalidaMercaderia.cbMotivo.getSelectedItem().toString();
            int can = Integer.parseInt(dlgSalidaMercaderia.txtCant.getText());
            double pre = art.getEfectivo();
            double mon = Redondeo.redondear(can * pre);
            double sa = stockActual();
            
            DetalleSalida dsa = new DetalleSalida(codA, codM, can, pre, mon);
            
                if(array.busca(dsa.getCodArt()) !=-1 )
                {
                    Mensajes.error("Articulo ya fue agregado");
                }
            else
            {
                if(dlgSalidaMercaderia.txtCant.getText().compareTo("0") != 0)
                {
                    if(can<art.getStock())
                    {
                        array.agregar(dsa);
                        insertar(String.valueOf(codA),desc ,String.valueOf(codM),mot ,String.valueOf(can), String.valueOf(pre), String.valueOf(mon), String.valueOf(sa), tabla);
                        double total = getTotal();
                        dlgSalidaMercaderia.txtTotal.setText(String.valueOf(total));
                    }
                    else
                    {
                        Mensajes.error("No tiene stock sufisiente");
                    }
                }
                else
                {
                    Mensajes.error("Ingrese una cantidad");
                }
            
            }
        } catch (Exception e) {
            Mensajes.error("Eliga al menos un Artículo");
        }
    }
    
    public static void delRenglon(JTable tabla)
    {
        consLinea();
        int f = dlgSalidaMercaderia.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgSalidaMercaderia.jTable1.getValueAt(f, 0).toString());
        int p = array.busca(cod);
        if(p != -1)
        {
            int res = Mensajes.confirmar("Desea quitar esta linea");
            if(res == 0)
            {
                array.eliminar(p);
                DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
                tb.removeRow(f);
                double total = getTotal();
                dlgSalidaMercaderia.txtTotal.setText(String.valueOf(total));
            }
        }
    }
    
    public static void actCantidad(JTable tabla)
    {
        try {
            int fila = dlgSalidaMercaderia.jTable1.getSelectedRow();
            String cod = dlgSalidaMercaderia.jTable1.getValueAt(fila, 0).toString();
            art = GestionarArticulos.busArticulo(cod);
            double pre = Double.parseDouble(dlgSalidaMercaderia.jTable1.getValueAt(fila, 5).toString());
            int can = Mensajes.ingresarNumeros();
            double monto = Redondeo.redondear(pre*can);
            double st = (art.getStock()-can);
            dlgSalidaMercaderia.jTable1.setValueAt(can, fila, 4);
            dlgSalidaMercaderia.jTable1.setValueAt(monto, fila, 6);
            dlgSalidaMercaderia.jTable1.setValueAt(st, fila, 7);
            double total = getTotal();
            dlgSalidaMercaderia.txtTotal.setText(String.valueOf(total));
            dlgSalidaMercaderia.txtArt.setText("");
            dlgSalidaMercaderia.txtCant.setText("");
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }
    
    public static void consLinea()
    {
        int f = dlgSalidaMercaderia.jTable1.getSelectedRow();
        int cod = Integer.parseInt(dlgSalidaMercaderia.jTable1.getValueAt(f, 0).toString());
        int p = array.busca(cod);
        if(p == -1)
            Mensajes.informacion("Artículo no existe");
        else
        {
            ds = array.getFila(p);
            int codA = ds.getCodArt();
            int codM = ds.getCodM();
            int cant = ds.getCant();
            double pre = ds.getPrec();
            double monto = ds.getMonto();
        }
        
    }
    
    static void insertar(String codA, String desc, String codM,String mont, String cand, String prec, String tot, String sActual, JTable tabla)
    {
        Object[] fila = {codA, desc, codM, mont, cand, prec, tot,sActual};
        DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
        tb.addRow(fila);
    }
    
    public static double getTotal()
    {
        double total = 0;
        DefaultTableModel tb = (DefaultTableModel)dlgSalidaMercaderia.jTable1.getModel();
        int fila = tb.getRowCount();
        for(int i=0;i<fila;i++)
        {
            total += Double.parseDouble(String.valueOf(dlgSalidaMercaderia.jTable1.getModel().getValueAt(i, 6)));
        }
        return Redondeo.redondear(total);
    }
    
    public static double stockActual()
    {
        int cant = Integer.parseInt(dlgSalidaMercaderia.txtCant.getText());
        return art.getStock()-cant;
    }
    
    public static String actStock()
    {
        String msg = null;
        int f = dlgSalidaMercaderia.jTable1.getRowCount();
        for(int i=0;i<f;i++)
        {
            int coda = Integer.parseInt(dlgSalidaMercaderia.jTable1.getValueAt(i, 0).toString());
            double st = Double.parseDouble(dlgSalidaMercaderia.jTable1.getValueAt(i, 7).toString());
            Articulo a = new Articulo(coda, st);
            msg = GestionarArticulos.actStock(a);
        }
        if(msg==null)
        {
            Mensajes.informacion("Stock Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void canCelar()
    {
        array.vaciar();
    }
    
    public static String addSalida()
    {
        String msg;
        int codS = Integer.parseInt(dlgSalidaMercaderia.lblSalida.getText());
        String fecha = dlgSalidaMercaderia.dcFechaS.getText();
        String fechaF = Fecha.formatoFecha(fecha);
        double total = Double.parseDouble(dlgSalidaMercaderia.txtTotal.getText());
        Salidas salida = new Salidas(codS, fechaF, total);
        array.vaciar();
        msg = GestionarSalida.addSalida(salida);
        
        if(msg==null)
        {
            Mensajes.informacion("Salida Registrada");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actSalida()
    {
        String msg;
        int x = dlgConSalidas.jTable1.getSelectedRow();
        String cod = dlgConSalidas.jTable1.getValueAt(x, 0).toString();
        msg = GestionarSalida.actSalida(cod);
        if(msg==null)
        {
            Mensajes.informacion("Salida Anulada");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String addDetalleSalida()
    {
        String msg = null;
        int f = dlgSalidaMercaderia.jTable1.getRowCount();
        for(int i=0; i<f;i++)
        {
            int codA = Integer.parseInt(dlgSalidaMercaderia.jTable1.getValueAt(i, 0).toString());
            int codS = Integer.parseInt(dlgSalidaMercaderia.lblSalida.getText());
            int codM = Integer.parseInt(dlgSalidaMercaderia.jTable1.getValueAt(i, 2).toString());
            int cant = Integer.parseInt(dlgSalidaMercaderia.jTable1.getValueAt(i, 4).toString());
            double prec = Double.parseDouble(dlgSalidaMercaderia.jTable1.getValueAt(i, 5).toString());
            double impo = Double.parseDouble(dlgSalidaMercaderia.jTable1.getValueAt(i, 6).toString());
            
            ds = new DetalleSalida(codA, codS, codM, cant, prec, impo);
            
            msg = GestionarSalida.addDetalleSalida(ds);
        }
        if(msg==null)
        {
            Mensajes.informacion("Detalle Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listSalidas(JTable tabla)
    {
        List lista = null;
        lista = GestionarSalida.listSalidas();
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void listDetalle(JTable tabla)
    {
        int x = dlgConSalidas.jTable1.getSelectedRow();
        String cod = dlgConSalidas.jTable1.getValueAt(x, 0).toString();
        String fecha = dlgConSalidas.jTable1.getValueAt(x, 1).toString();
        dlgConSalidas.txtFecha.setText(fecha);
        List lista = null;
        lista = GestionarSalida.listDetalle(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
}
