package Controladores;

import Componentes.Mensajes;
import Datos.GestionarDetalleGasto;
import IU.dlgDetalleGasto;
import Modelo.DetalleGasto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlDetalleGasto {

    public static String addDetalleGasto() {
        String msg;
        int dgCodigo = Integer.parseInt(GestionarDetalleGasto.getCodigo());
        String dgDescripcion = dlgDetalleGasto.jTextField1.getText().toUpperCase().trim();
        DetalleGasto dg = new DetalleGasto(dgCodigo, dgDescripcion);
        msg = GestionarDetalleGasto.addDetalleGasto(dg);
        if (msg == null) {
            Mensajes.informacion("Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String actDetalleGasto() {
        String msg;
        int dgCodigo = Integer.parseInt(dlgDetalleGasto.lblCod.getText().trim());
        String dgDescripcion = dlgDetalleGasto.jTextField1.getText().toUpperCase().trim();
        DetalleGasto dg = new DetalleGasto(dgCodigo, dgDescripcion);
        msg = GestionarDetalleGasto.actDetalleGasto(dg);
        if (msg == null) {
            Mensajes.informacion("Actualizado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String delDetalleGasto() {
        String msg;
        String cod = dlgDetalleGasto.lblCod.getText().trim();
        msg = GestionarDetalleGasto.delDetalleGasto(cod);
        if (msg == null) {
            Mensajes.informacion("Eliminado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listDetalleGasto(JTable tabla) {
        List lista = null;
        lista = GestionarDetalleGasto.listDetalleGasto();
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            fila[0].toString();
            fila[1].toString();
            tb.addRow(fila);
        }
    }

}
