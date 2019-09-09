package Controladores;

import Componentes.Mensajes;
import Datos.GestionarMotivo;
import IU.dlgMotivo;
import Modelo.Motivo;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlMotivo {
    
    public static String addMotivo()
    {
        String msg;
        int cod = Integer.parseInt(dlgMotivo.jLabel1.getText());
        String mot = dlgMotivo.jTextField2.getText().toUpperCase();
        Motivo m = new Motivo(cod, mot);
        msg = GestionarMotivo.addMotivo(m);
        if(msg==null)
        {
            Mensajes.informacion("Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actMotivo()
    {
        String msg;
        int cod = Integer.parseInt(dlgMotivo.jLabel1.getText());
        String mot = dlgMotivo.jTextField2.getText().toUpperCase();
        Motivo m = new Motivo(cod, mot);
        msg = GestionarMotivo.actMotivo(m);
        if(msg==null)
        {
            Mensajes.informacion("Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delMotivo()    
    {
        String msg;
        String cod = dlgMotivo.jLabel1.getText();
        msg = GestionarMotivo.delMotivo(cod);
        if(msg==null)
        {
            Mensajes.informacion("Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listMotivo(JTable tabla)
    {
        List lista = null;
        lista = GestionarMotivo.listMotivo();
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