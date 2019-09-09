package Controladores;

import Componentes.Mensajes;
import Datos.GestionarCliente;
import IU.dlgClientes;
import IU.dlgGestClientes;
import Modelo.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlCliente {
    
    public static void aModificar()
    {
        int x = dlgClientes.jTable1.getSelectedRow();
        String cod = dlgClientes.jTable1.getValueAt(x, 0).toString();
        Cliente c = GestionarCliente.busCliente(cod);
        
        dlgGestClientes.lblCodCliente.setText(String.valueOf(c.getCodCliente()));
        dlgGestClientes.txtRazonSocial.setText(c.getRazonSocial());
        dlgGestClientes.txtContacto.setText(c.getContacto());
        dlgGestClientes.cbVendedor.setSelectedIndex(c.getCodVendedor()-1);
        dlgGestClientes.txtCelu.setText(c.getCelu());
        dlgGestClientes.txtTelef.setText(c.getTelefon());
        dlgGestClientes.txtFax.setText(c.getFax());
        dlgGestClientes.cbRubro.setSelectedIndex(c.getCodRubro()-1);
        dlgGestClientes.txtRUC.setText(c.getRuc());
        dlgGestClientes.txtLimCuenta.setText(String.valueOf(c.getLimCuenta()));
        dlgGestClientes.txtDireccion.setText(c.getDireccion());
        dlgGestClientes.txtEmail.setText(c.getEmail());
        dlgGestClientes.txtWeb.setText(c.getWeb());
        dlgGestClientes.cbTransporte.setSelectedIndex(c.getCodTrans()-1);
        dlgGestClientes.cbProvincia.setSelectedIndex(c.getCodProv()-1);
        dlgGestClientes.cbZona.setSelectedIndex(c.getCodZona()-1);
        dlgGestClientes.txtDescuento.setText(String.valueOf(c.getDesc()));
        if(c.gettPago().equalsIgnoreCase("EFECTIVO"))
            dlgGestClientes.rbtnEfectivo.setSelected(true);
        else
        {
            if(c.gettPago().equalsIgnoreCase("TARJETA"))
                dlgGestClientes.rbtnTarjeta.setSelected(true);
        }
        dlgGestClientes.txaS.setText(c.getOsb());
    }
    
    public static Cliente capturarCampos()
    {
        Cliente c = null;
        int codC = Integer.parseInt(dlgGestClientes.lblCodCliente.getText());
        String razonS = dlgGestClientes.txtRazonSocial.getText().toUpperCase();
        String contac = dlgGestClientes.txtContacto.getText().toUpperCase();
        int codVe = Integer.parseInt(dlgGestClientes.lblVendedor.getText());
        String telf = dlgGestClientes.txtTelef.getText();
        String celu = dlgGestClientes.txtCelu.getText();
        String fax = dlgGestClientes.txtFax.getText();
        int codRub = Integer.parseInt(dlgGestClientes.lblRubro.getText());
        String ruc = dlgGestClientes.txtRUC.getText().toUpperCase();
        double limCta = Double.parseDouble(dlgGestClientes.txtLimCuenta.getText());
        String direc = dlgGestClientes.txtDireccion.getText().toUpperCase();
        String email = dlgGestClientes.txtEmail.getText();
        String web = dlgGestClientes.txtWeb.getText();
        int codTrans = Integer.parseInt(dlgGestClientes.lblTtransporte.getText());
        int codProv = Integer.parseInt(dlgGestClientes.lblProvincia.getText());
        int codZona = Integer.parseInt(dlgGestClientes.lblZona.getText());
        double desc = Double.parseDouble(dlgGestClientes.txtDescuento.getText());
        String r = null;
        if(dlgGestClientes.rbtnEfectivo.isSelected())
        {
            r = "EFECTIVO";
        }
        else
            if(dlgGestClientes.rbtnTarjeta.isSelected())
            {
                r = "TARJETA";
            }
        String obs = dlgGestClientes.txaS.getText().toUpperCase();
        c = new Cliente(codC, razonS, contac, codVe, telf, celu, fax, codRub, ruc, limCta, direc, email, web, codTrans, codProv, codZona, desc, r, obs);                
        return c;
    }
    
    public static String addCliente()
    {
        String msg;
        Cliente c = capturarCampos();
        msg = GestionarCliente.addCliente(c);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actCliente()
    {
        String msg;
        Cliente c = capturarCampos();
        msg = GestionarCliente.actCliente(c);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delCliente()
    {
        int x = dlgClientes.jTable1.getSelectedRow();
        String msg;
        String cod = dlgClientes.jTable1.getValueAt(x, 0).toString();
        msg = GestionarCliente.delCliente(cod);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listClientes(JTable tabla, String cod)
    {
        List lista = null;
        lista = GestionarCliente.listClientes(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filtRazonS(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filRazonS(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filtRuc(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filRuc(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filContacto(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filContacto(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filDireccion(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filDireccion(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
            
}
