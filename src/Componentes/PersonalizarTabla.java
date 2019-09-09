package Componentes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PersonalizarTabla extends DefaultTableCellRenderer {

    public Component getTableCellRenderComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (String.valueOf(table.getValueAt(row, 5)).equals("ACTIVO")) {
            setForeground(Color.blue);
        } // SI NO ES ACTIVO ENTONCES COLOR ROJO
        else {
            setForeground(Color.red);
        }
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;
    }

}
