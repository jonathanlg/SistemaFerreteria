package Controladores;

import Componentes.Mensajes;
import Datos.GestionarCategoriaCompra;
import IU.dlgCategoria;
import Modelo.CategoriaCompra;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlCategoriaCompra {

    public static String addCategoria() {
        String msg;
        int cod = Integer.parseInt(dlgCategoria.jLabel1.getText());
        String categ = dlgCategoria.jTextField2.getText().toUpperCase();
        CategoriaCompra cat = new CategoriaCompra(cod, categ);
        msg = GestionarCategoriaCompra.addCategoria(cat);
        if (msg == null) {
            Mensajes.informacion("Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String actCategoria() {
        String msg;
        int cod = Integer.parseInt(dlgCategoria.jLabel1.getText());
        String categ = dlgCategoria.jTextField2.getText().toUpperCase();
        CategoriaCompra cat = new CategoriaCompra(cod, categ);
        msg = GestionarCategoriaCompra.actCategoria(cat);
        if (msg == null) {
            Mensajes.informacion("Actualizado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String delCategoria() {
        String msg;
        String cod = dlgCategoria.jLabel1.getText();
        msg = GestionarCategoriaCompra.delCategoria(cod);
        if (msg == null) {
            Mensajes.informacion("Eliminado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listCategoria(JTable tabla) {
        List lista = null;
        lista = GestionarCategoriaCompra.listarCategoria();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }

}
