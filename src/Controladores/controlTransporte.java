package Controladores;

import Componentes.Mensajes;
import Datos.GestionarTransporte;
import IU.dlgTransporte;
import Modelo.Transporte;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlTransporte {
    
    public static String addTransporte()
    {
        String msg;
        int cod = Integer.parseInt(dlgTransporte.jLabel1.getText());
        String transp = dlgTransporte.jTextField2.getText().toUpperCase();
        Transporte t = new Transporte(cod, transp);
        msg = GestionarTransporte.addTransporte(t);
        if(msg==null)
        {
            Mensajes.informacion("registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actTransporte()
    {
        String msg;
        int cod = Integer.parseInt(dlgTransporte.jLabel1.getText());
        String transp = dlgTransporte.jTextField2.getText().toUpperCase();
        Transporte t = new Transporte(cod, transp);
        msg = GestionarTransporte.actTransporte(t);
        if(msg==null)
        {
            Mensajes.informacion("Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delTransporte()
    {
        String msg;
        String cod = dlgTransporte.jLabel1.getText();
        msg = GestionarTransporte.delTransporte(cod);
        if(msg==null)
        {
            Mensajes.informacion("Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listTransporte(JTable tabla)
    {
        List lista = null;
        lista = GestionarTransporte.listTransporte();
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
