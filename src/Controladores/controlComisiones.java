package Controladores;

import Componentes.Redondeo;
import Datos.GestionarComisiones;
import IU.dlgComisionEmpleado;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlComisiones {

    public static void listVentas(JTable tabla, String cod) {
        List lista;
        lista = GestionarComisiones.listVentas(cod);
        for (int i = 1; i < lista.size(); i++) {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            Object[] fila = (Object[]) lista.get(i);
            tb.addRow(fila);
            dlgComisionEmpleado.txtComision.setText(String.valueOf(Redondeo.redondear(Double.parseDouble(fila[4].toString()))));
        }
    }

    public static void getCalculos() {
        double sumTotal = 0;
        double sumCom = 0;
        DefaultTableModel tb = (DefaultTableModel) dlgComisionEmpleado.jTable1.getModel();
        int filas = tb.getRowCount();
        for (int i = 0; i < filas; i++) {
            sumTotal += Double.parseDouble(String.valueOf(dlgComisionEmpleado.jTable1.getModel().getValueAt(i, 3)));
            sumCom += Double.parseDouble(String.valueOf(dlgComisionEmpleado.jTable1.getModel().getValueAt(i, 5)));
        }
        dlgComisionEmpleado.txtTotalVentas.setText(String.valueOf(sumTotal));
        dlgComisionEmpleado.txtTotalComisiones.setText(String.valueOf(Redondeo.redondear(sumCom)));
    }

}
