package Componentes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MiRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        int cant = Integer.parseInt(table.getValueAt(row, 11).toString());
        if (cant <= 50) {
            this.setOpaque(true);
            this.setBackground(Color.GREEN);
            this.setForeground(Color.BLUE);
        if (cant <= 10) {
            this.setOpaque(true);
            this.setBackground(Color.YELLOW);
            this.setForeground(Color.RED);
        }
        }
        else {
            this.setOpaque(false);
            this.setForeground(Color.BLACK);
            this.setBackground(Color.WHITE);
        }

        return this;
    }

}
