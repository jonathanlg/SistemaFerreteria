package Controladores;

import Componentes.Mensajes;
import Datos.GestionarZona;
import IU.dlgZona;
import Modelo.zona;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlZona {
    
    public static String addZona()
    {
        String msg;
        int cod = Integer.parseInt(dlgZona.jLabel1.getText());
        String zona = dlgZona.jTextField2.getText().toUpperCase();
        zona z = new zona(cod, zona);
        msg = GestionarZona.addZona(z);
        if(msg==null)
        {
            Mensajes.informacion("Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actZona()
    {
        String msg;
        int cod = Integer.parseInt(dlgZona.jLabel1.getText());
        String zona = dlgZona.jTextField2.getText().toUpperCase();
        zona z = new zona(cod, zona);
        msg = GestionarZona.actZona(z);
        if(msg==null)
        {
            Mensajes.informacion("Modificado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delZona()
    {
        String msg;
        String cod = dlgZona.jLabel1.getText();
        msg = GestionarZona.delZona(cod);
        if(msg==null)
        {
            Mensajes.informacion("Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listZona(JTable tabla)
    {
        List lista = null;
        lista = GestionarZona.listZona();
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
