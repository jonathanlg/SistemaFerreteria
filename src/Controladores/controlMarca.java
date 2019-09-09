package Controladores;

import Componentes.Mensajes;
import Datos.GestionarMarca;
import IU.dlgMarca;
import Modelo.Marca;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlMarca {
    
    public static String addMarca()
    {
        String msg;
        int cod = Integer.parseInt(dlgMarca.jLabel1.getText().trim());
        String nombre = dlgMarca.jTextField2.getText().toUpperCase();
        Marca m = new Marca(cod, nombre);
        msg = GestionarMarca.addMarca(m);
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
        int cod = Integer.parseInt(dlgMarca.jLabel1.getText().trim());
        String nombre = dlgMarca.jTextField2.getText().toUpperCase();
        Marca m = new Marca(cod, nombre);
        msg = GestionarMarca.actMarca(m);
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
        String cod = dlgMarca.jLabel1.getText().trim();
        msg = GestionarMarca.delMarca(cod);
        if(msg==null)
        {
            Mensajes.informacion("Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    
    public static void lisMarcas(JTable tabla)
    {
        List lista = null;
        lista = GestionarMarca.listMarca();
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
