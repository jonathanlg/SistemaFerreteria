package Controladores;

import Componentes.Mensajes;
import Datos.GestionarVendedor;
import IU.dlgGestVendedor;
import IU.dlgVendedor;
import Modelo.Vendedor;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlVendedor {

    public static void aModificar() {
        int x = dlgVendedor.jTable1.getSelectedRow();
        String cod = dlgVendedor.jTable1.getValueAt(x, 0).toString();
        
//        busImagen(cod, dlgGestVendedor.lblImagenV);

        Vendedor v = GestionarVendedor.busVendedor(cod);

        dlgGestVendedor.lblCodV.setText(String.valueOf(v.getCodVe()));
        dlgGestVendedor.txtNombres.setText(v.getNombreV());
        dlgGestVendedor.txtDireccion.setText(v.getDireccion());
        dlgGestVendedor.txtTelefono.setText(v.getTelefono());
        dlgGestVendedor.txtCelular.setText(v.getCelular());
        dlgGestVendedor.txtSueldo.setText(String.valueOf(v.getSueldo()));
        dlgGestVendedor.cbProvincia.setSelectedIndex(v.getCodProv() - 1);
        dlgGestVendedor.cbZona.setSelectedIndex(v.getCodZona() - 1);
        dlgGestVendedor.txtEmail.setText(v.getEmail());
        dlgGestVendedor.txtComision.setText(String.valueOf(v.getComision()));
        dlgGestVendedor.txaS.setText(v.getObs());
    }

    public static Vendedor capturarCampos() {
        Vendedor ven = null;
        int codV = Integer.parseInt(dlgGestVendedor.lblCodV.getText());
        String nombreV = dlgGestVendedor.txtNombres.getText().toUpperCase();
        String direccion = dlgGestVendedor.txtDireccion.getText().toUpperCase();
        String telef = dlgGestVendedor.txtTelefono.getText();
        String celu = dlgGestVendedor.txtCelular.getText();
        double sueldo = Double.parseDouble(dlgGestVendedor.txtSueldo.getText());
        int codProv = Integer.parseInt(dlgGestVendedor.lblProvincia.getText());
        int codZona = Integer.parseInt(dlgGestVendedor.lblZona.getText());
        Double comis = Double.parseDouble(dlgGestVendedor.txtComision.getText());
        String email = dlgGestVendedor.txtEmail.getText();
        String obs = dlgGestVendedor.txaS.getText().toUpperCase();
        ven = new Vendedor(codV, nombreV, direccion, telef, celu, sueldo, codProv, codZona, comis, email, obs);
        return ven;
    }

    public static String addVendedor() {
        String msg;
        Vendedor v = capturarCampos();
        msg = GestionarVendedor.addVendedor(v);
        if (msg == null) {
            Mensajes.informacion("Empleado Registrado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void addImagen(String cod) {
        GestionarVendedor.addImagen(cod);
    }

    public static void actImagen(String cod) {
        GestionarVendedor.actImagen(cod);
    }

    public static void busImagen(String cod, JLabel lblImagen) {
        GestionarVendedor.busImagen(cod, lblImagen);
    }

    public static String actVendedor() {
        String msg;
        Vendedor v = capturarCampos();
        msg = GestionarVendedor.actVendedor(v);
        if (msg == null) {
            Mensajes.informacion("Empleado Actualizado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static String delVendedor() {
        int x = dlgVendedor.jTable1.getSelectedRow();
        String msg;
        String cod = dlgVendedor.jTable1.getValueAt(x, 0).toString();
        msg = GestionarVendedor.delVendedor(cod);
        if (msg == null) {
            Mensajes.informacion("Empleado Eliminado");
        } else {
            Mensajes.error(msg);
        }
        return msg;
    }

    public static void listVendedor(JTable tabla, String cad) {
        List lista = null;
        lista = GestionarVendedor.listVendedor(cad);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void filNombre(JTable tabla, String cad) {
        List lista = null;
        lista = GestionarVendedor.filNombre(cad);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void filDireccion(JTable tabla, String cad) {
        List lista = null;
        lista = GestionarVendedor.filDireccion(cad);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

    public static void filTelefono(JTable tabla, String cad) {
        List lista = null;
        lista = GestionarVendedor.filTelefono(cad);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
        }
    }

}
