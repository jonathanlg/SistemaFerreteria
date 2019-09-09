package Controladores;

import Componentes.Mensajes;
import Datos.GestionarProveedor;
import IU.dlgGestProveedor;
import IU.dlgProveedores;
import Modelo.Proveedor;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlProveedor {
    
    public static void aModificar()
    {
        int x = dlgProveedores.jTable1.getSelectedRow();
        String cod = dlgProveedores.jTable1.getValueAt(x, 0).toString();
        Proveedor pr = GestionarProveedor.busProveedor(cod);
        
        dlgGestProveedor.lblCodP.setText(String.valueOf(pr.getCodP()));
        dlgGestProveedor.txtRazonS.setText(pr.getRazoS());
        dlgGestProveedor.txtRuc.setText(pr.getRuc());
        dlgGestProveedor.txtContacto.setText(pr.getContac());
        dlgGestProveedor.txtCelular.setText(pr.getCelu());
        dlgGestProveedor.txtTelefono.setText(pr.getTelef());
        dlgGestProveedor.txtFax.setText(pr.getFax());
        dlgGestProveedor.txtDireccion.setText(pr.getDireccion());
        dlgGestProveedor.cbProvincia.setSelectedIndex(pr.getCodProvincia()-1);
        dlgGestProveedor.txtEmail.setText(pr.getEmail());
        dlgGestProveedor.txtWeb.setText(pr.getWeb());
        dlgGestProveedor.txaS.setText(pr.getObs());
    }
    
    public static Proveedor capturarCampos()
    {
        Proveedor pr = null;
        int cod = Integer.parseInt(dlgGestProveedor.lblCodP.getText());
        String razonS = dlgGestProveedor.txtRazonS.getText().toUpperCase();
        String ruc = dlgGestProveedor.txtRuc.getText();
        String contac = dlgGestProveedor.txtContacto.getText().toUpperCase();
        String celu = dlgGestProveedor.txtCelular.getText();
        String telef = dlgGestProveedor.txtTelefono.getText();
        String fax = dlgGestProveedor.txtFax.getText();
        String direc = dlgGestProveedor.txtDireccion.getText().toUpperCase();
        int codPro = Integer.parseInt(dlgGestProveedor.lblProvincia.getText());
        String email = dlgGestProveedor.txtEmail.getText();
        String web = dlgGestProveedor.txtWeb.getText();
        String obs = dlgGestProveedor.txaS.getText().toUpperCase();
        pr = new Proveedor(cod, razonS, ruc, contac, celu, telef, fax, direc, codPro, email, web, obs);
        return pr;
    }
    
    public static String addProveedor()
    {
        String msg = null;
        Proveedor pr = capturarCampos();
        msg = GestionarProveedor.addProveedor(pr);
        if(msg==null)
        {
            Mensajes.informacion("Proveedor Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actProveedor()
    {
        String msg = null;
        Proveedor pr = capturarCampos();
        msg = GestionarProveedor.actProveedor(pr);
        if(msg==null)
        {
            Mensajes.informacion("Proveedor Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delProveedor()
    {
        int x = dlgProveedores.jTable1.getSelectedRow();
        String msg;
        String cod = dlgProveedores.jTable1.getValueAt(x, 0).toString();
        msg = GestionarProveedor.delProveedor(cod);
        if(msg==null)
        {
            Mensajes.informacion("Proveedor Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listProveedor(JTable tabla, String cod)
    {
        List lista = null;
        lista = GestionarProveedor.listProveedor(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filProveedor(JTable tabla, String cod)
    {
        List lista = null;
        lista = GestionarProveedor.filRazonS(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filContacto(JTable tabla, String cod)
    {
        List lista = null;
        lista = GestionarProveedor.filContacto(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
}
