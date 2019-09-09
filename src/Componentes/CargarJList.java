package Componentes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;

public class CargarJList {
    static DefaultComboBoxModel modeloCombo;
    
    public static void cargar(JList cb, String sql)
    {
        try {
            Connection con = new ConexionBD().getConexion();//Nos conectamos
            Statement st = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery(sql);
            modeloCombo = new DefaultComboBoxModel();
            cb.setModel(modeloCombo);
            while(rs.next()){//recorremos la tabla
                //Agregamos al combo los valores
                modeloCombo.addElement(new Combo(Integer.parseInt(rs.getString(1)), rs.getString(2)));
            }
            rs.close();//Cerramos el recorrido
            con.close();//Cerramos la conexion
        } catch (Exception e) {
            //Excepcion en caso haya conexion
            System.out.println("Algunos formularios no estan activos, para actualizarse, o no hay conexión");
        }
    }
    
    public static String getCodidgo(JList cb)//Metodo para Obtener el id
    {
        Combo c = (Combo)cb.getSelectedValue();//Seleccionamos
        int id = c.getCodigo();//Obtenermos el id
        return String.valueOf(id);//Retornamos el codigo
    }
}
