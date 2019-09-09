package Controladores;

import Componentes.Mensajes;
import Datos.GestionarStock;
import IU.dlgAjusteStock;
import IU.dlgArticulos;
import IU.dlgCantStock;
import IU.dlgGestAriculos;
import Modelo.Stock;

public class controlGestStock {
    
    public static void aModificar()
    {
        int x = dlgAjusteStock.jTable1.getSelectedRow();
        String cod = dlgAjusteStock.jTable1.getValueAt(x, 0).toString();
        String desc = dlgAjusteStock.jTable1.getValueAt(x, 1).toString();
        Stock st = GestionarStock.busStock(cod);
        
        dlgCantStock.lblCodA.setText(String.valueOf(st.getCod()));
        dlgCantStock.lblDesc.setText(desc);
        dlgCantStock.lblStA.setText(String.valueOf(st.getStock()));
    }
    
    public static String addStock()
    {
        String msg;
        int cod = Integer.parseInt(dlgGestAriculos.lblCodArt.getText());
        double st = Double.parseDouble(dlgGestAriculos.txtStockMin.getText());
        Stock s = new Stock(cod, st);
        msg = GestionarStock.addStock(s);
        if(msg==null)
        {
            System.out.println("Se agrego nuevo Stock");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    public static String actStock()
    {
        String msg;
        int cod = Integer.parseInt(dlgCantStock.lblCodA.getText());
        double st = Double.parseDouble(dlgCantStock.jTextField1.getText());
        Stock s = new Stock(cod, st);
        msg = GestionarStock.actStock(s);
        if(msg==null)
        {
            System.out.println("Se actualizo el stock");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
        
    public static String delStock()
    {
        int x = dlgArticulos.jTable1.getSelectedRow();
        String msg;
        String cod = dlgArticulos.jTable1.getValueAt(x, 0).toString();
        msg = GestionarStock.delStock(cod);
        if(msg==null)
        {
            System.out.println("Se elimino stock junto con articulo");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
}
