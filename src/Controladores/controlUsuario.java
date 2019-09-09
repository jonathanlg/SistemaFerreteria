package Controladores;

import Componentes.Encript;
import Componentes.Mensajes;
import Datos.GestionarUsuario;
import Datos.GestionarVendedor;
import IU.dlgBuscarEmpleado;
import IU.dlgGestionarUsuario;
import Modelo.Usuario;
import Modelo.Vendedor;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlUsuario {
    
    public static void selecEmpleado()
    {
        int x = dlgBuscarEmpleado.jTable1.getSelectedRow();
        String cod = dlgBuscarEmpleado.jTable1.getValueAt(x, 0).toString();
        Vendedor ve = GestionarVendedor.busVendedor(cod);
        
        dlgGestionarUsuario.txtCodUsuario.setText(String.valueOf(ve.getCodVe()));
        dlgGestionarUsuario.txtNomUsuario.setText(ve.getNombreV());
    }
    
    public static Usuario capturarCampos()
    {
        Usuario u = null;
        int cod = Integer.parseInt(dlgGestionarUsuario.txtCodUsuario.getText());
        String nomU = dlgGestionarUsuario.txtNomUsuario.getText().toUpperCase();
        String user = dlgGestionarUsuario.txtUsuario.getText();
        String pass = Encript.getStringMessageDigest(dlgGestionarUsuario.psPassword.getText(), Encript.MD5);
        String perfil = dlgGestionarUsuario.cbPerfil.getSelectedItem().toString();
        String ip = dlgGestionarUsuario.txtIP.getText();
        u = new Usuario(cod, nomU, perfil, user, pass, ip);
        return u;
    }
    
    public static String addUsuario()
    {
        String msg;
        Usuario u = capturarCampos();
        msg = GestionarUsuario.addUsuario(u);
        if(msg==null)
        {
            Mensajes.informacion("Se registro usuario");
        }
        else
        {
           Mensajes.informacion("No se pudo registrar");
        }
        return msg;
    }
    
    public static String actUsuario()
    {
        String msg;
        Usuario u = capturarCampos();
        msg = GestionarUsuario.actUsuario(u);
        if(msg==null)
        {
            Mensajes.informacion("Se actualizo usuario");
        }
        else
        {
           Mensajes.informacion("No se pudo actualizar");
        }
        return msg;
    }
    
    public static String delUsuario()
    {
        String cod = dlgGestionarUsuario.txtCodUsuario.getText();
        String msg;
        msg = GestionarUsuario.delUsuario(cod);
        if(msg==null)
        {
            Mensajes.informacion("Se Borro Usuario");
        }
        else
        {
            Mensajes.informacion("No se pudo Borrar");
        }
        return msg;
    }
        
    public static void listUsuario(JTable tabla)
    {
        List lista = null;
        lista = GestionarUsuario.listUsuario();
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void listEmpleado(JTable tabla)
    {
        List lista = null;
        lista = GestionarUsuario.listEmpleados();
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
}
