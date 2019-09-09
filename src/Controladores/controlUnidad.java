package Controladores;

import Componentes.Mensajes;
import Datos.GestionarUnidad;
import IU.dlgUnidad;
import Modelo.Unidad;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlUnidad {
    
    public static String addUnidad()
    {
        String msg;
        int cod = Integer.parseInt(dlgUnidad.jLabel1.getText());
        String nombre = dlgUnidad.jTextField2.getText().toUpperCase();
        Unidad u = new Unidad(cod, nombre);
        msg = GestionarUnidad.addUnidad(u);
        if(msg==null)
        {
            Mensajes.informacion("registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actUnidad()
    {
        String msg;
        int cod = Integer.parseInt(dlgUnidad.jLabel1.getText());
        String nombre = dlgUnidad.jTextField2.getText().toUpperCase();
        Unidad u = new Unidad(cod, nombre);
        msg = GestionarUnidad.actUnidad(u);
        if(msg==null)
        {
            Mensajes.informacion("Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delUnidad()
    {
        String msg;
        String cod = dlgUnidad.jLabel1.getText();
        msg = GestionarUnidad.delUnidad(cod);
        if(msg==null)
        {
            Mensajes.informacion("Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    
    public static void lisUnidades(JTable tabla)
    {
        List lista = null;
        lista = GestionarUnidad.listUnidad();
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
