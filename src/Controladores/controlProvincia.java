package Controladores;

import Componentes.Mensajes;
import Datos.GestionarProvincia;
import IU.dlgProvincia;
import Modelo.Provincia;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlProvincia {
    
    public static String addProvincia()
    {
        String msg;
        int cod = Integer.parseInt(dlgProvincia.jLabel4.getText());
        String nombre = dlgProvincia.jTextField1.getText().toUpperCase();
        Provincia p = new Provincia(cod, nombre);
        msg = GestionarProvincia.addProvincia(p);
        if(msg==null)
        {
            Mensajes.informacion("Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actMarca()
    {
        String msg;
        int cod = Integer.parseInt(dlgProvincia.jLabel4.getText());
        String nombre = dlgProvincia.jTextField1.getText().toUpperCase();
        Provincia p = new Provincia(cod, nombre);
        msg = GestionarProvincia.actProvincia(p);
        if(msg==null)
        {
            Mensajes.informacion("Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delMarca()
    {
        String msg;
        String cod = dlgProvincia.jLabel4.getText();
        msg = GestionarProvincia.delProvincia(cod);
        if(msg==null)
        {
            Mensajes.informacion("Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listProvincias(JTable tabla)
    {
        List lista = null;
        lista = GestionarProvincia.listProvincias();
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }
}
