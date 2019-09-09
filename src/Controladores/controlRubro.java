package Controladores;

import Componentes.Mensajes;
import Datos.GestionarRubro;
import IU.dlgRubro;
import Modelo.Rubro;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlRubro {

    public static String addRrubro() {
        String msg;
        int cod = Integer.parseInt(dlgRubro.jLabel1.getText().trim());
        String nombre = dlgRubro.jTextField2.getText().toUpperCase();
        Rubro r = new Rubro(cod, nombre);
        msg = GestionarRubro.addRubro(r);
        if (msg == null) {
            Mensajes.informacion("Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String actRubro() {
        String msg;
        int cod = Integer.parseInt(dlgRubro.jLabel1.getText().trim());
        String nombre = dlgRubro.jTextField2.getText().toUpperCase();
        Rubro r = new Rubro(cod, nombre);
        msg = GestionarRubro.actRubro(r);
        if (msg == null) {
            Mensajes.informacion("Actualizado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String delRubro() {
        String msg;
        String cod = dlgRubro.jLabel1.getText().trim();
        msg = GestionarRubro.delRubro(cod);
        if (msg == null) {
            Mensajes.informacion("Eliminado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listRubros(JTable tabla) {
        List lista = null;
        lista = GestionarRubro.listRubro();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }

}
