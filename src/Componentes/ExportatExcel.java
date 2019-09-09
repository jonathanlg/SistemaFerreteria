package Componentes;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JTable;
import jxl.CellView;
import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import jxl.write.biff.RowsExceededException;

public class ExportatExcel {

    private File archi;
    private List<JTable> tabla;
    private List<String> nom_hoja;
    private WritableCellFormat formato_fila;
    private WritableCellFormat formato_columna;

    public ExportatExcel(List<JTable> tab, File ar) throws Exception {
        this.archi = ar;
        this.tabla = tab;
        if (tab.size() < 0) {
            throw new Exception("ERROR");
        }
    }

    public boolean Export() {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(archi));
            WritableWorkbook w = Workbook.createWorkbook(out);
            w.createSheet("Registro", 0);

            for (int index = 0; index < tabla.size(); index++) {
                JTable table = tabla.get(index);
                WritableSheet s = w.getSheet(0);

                for (int i = 0; i < table.getColumnCount(); i++) {
                    for (int j = 0; j < table.getRowCount(); j++) {
                        Object objeto = table.getValueAt(j, i);

                        createColumna(s, table.getColumnName(i), i);
                        createFilas(s, i, j, String.valueOf(objeto));
                    }
                }
            }

            w.write();
            w.close();
            out.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (WriteException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    private void createColumna(WritableSheet sheet, String columna, int number_columna) throws WriteException {
        /*Creamos el tipo de letra*/
        WritableFont times10pt = new WritableFont(WritableFont.TAHOMA, 14);
        /*Definimos el formato de la celda*/
        WritableCellFormat times = new WritableCellFormat(times10pt);
        /*Permite si se ajusta automaticamente a las celulas*/
//        times.setWrap(true);
        /*Crea una negrita con subrayado*/
        WritableFont times10ptBoldUnderline = new WritableFont(WritableFont.TAHOMA, 10, WritableFont.BOLD, false, UnderlineStyle.SINGLE);
        formato_columna = new WritableCellFormat(times10ptBoldUnderline);
        /*Permite que se ajusta automaticamente a las celulas*/
//        formato_columna.setWrap(true);
        CellView cv = new CellView();
        cv.setSize(220);
        cv.setDimension(70);
        cv.setFormat(times);
        cv.setFormat(formato_columna);
        cv.setAutosize(true);
        addColumna(sheet, number_columna, 0, columna, formato_columna);/*Numero de columna, 0 es la fila*/

    }

    /**
     * **************************************************************
     */
    private void createFilas(WritableSheet sheet, int number_columna, int filas, String name_filas) throws WriteException {
        /*Creamos el tipo de letra*/
        WritableFont times10pt = new WritableFont(WritableFont.ARIAL, 12);
        times10pt.setColour(jxl.format.Colour.GOLD);
        /*Definimos el formato de la celda*/
        WritableCellFormat times = new WritableCellFormat(times10pt);
        times.setBorder(Border.TOP, BorderLineStyle.MEDIUM, jxl.format.Colour.GOLD);
        /*Permite si se ajusta automaticamente a las celulas*/
        times.setWrap(true);
        /*Crea una negrita con subrayado*/
        WritableFont times10ptBoldUnderline = new WritableFont(WritableFont.ARIAL, 12, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE);
        formato_fila = new WritableCellFormat(times10ptBoldUnderline);
        /*Permite que se ajuste automaticamene a las celulas*/
//        formato_fila.setWrap(true);
        CellView cv = new CellView();
        cv.setDimension(70);
        cv.setFormat(times);
        cv.setFormat(formato_fila);
//        cv.setAutosize(true);
        /*Escribimos en las columnas*/
        addFilas(sheet, number_columna, filas, name_filas, formato_fila);
    }

    /**
     * ****************************************************************
     */
    private void addColumna(WritableSheet sheet, int column, int row, String s, WritableCellFormat format) throws RowsExceededException, WriteException {
        Label label;
        label = new Label(column, row, s, format);
        sheet.addCell(label);
    }

    private void addFilas(WritableSheet sheet, int column, int row, String s, WritableCellFormat format) throws WriteException, RowsExceededException {
        Label label;
        label = new Label(column, row, s, format);
        sheet.addCell(label);
    }
}
