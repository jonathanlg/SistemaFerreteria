package Componentes;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Mensajes {
    
    public static void informacion(String mensaje)//Mensaje de informacion
    {
        JOptionPane.showMessageDialog(null, mensaje,"Información",JOptionPane.INFORMATION_MESSAGE);
//        //Necesario
//        UIManager UI=new UIManager(); 
//        //Borde
//        UI.put("OptionPane.background", Color.blue); 
//        //Fondo
//        UI.put("Panel.background", Color.red); 
//        //Lanzar el Joptionpane
//        JOptionPane.showMessageDialog(null,mensaje,"Titulo del Cuadro",JOptionPane.INFORMATION_MESSAGE); 
    }
    
    public static void error(String mensaje)//Mensaje de Error
    {
        JOptionPane.showMessageDialog(null, mensaje,"Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static int confirmar(String mensaje)//Mensaje de confirmacion
    {
        int res = JOptionPane.showConfirmDialog(null, mensaje,"Confirmar",0,JOptionPane.OK_CANCEL_OPTION);
        return res;
    }
    
    public static int ingresarNumeros()//JoptionPane que solo acepte numeros
    {
        int numero=0;
        boolean bandera = false;
        do
        {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad"));
                bandera = true;
            } catch (Exception e) {
                informacion("Solo se permiten números");
                bandera = false;
            }
        }while(!bandera);
        return numero;
    }
    
    public static double ingresarDecimales()//JoptionPane que solo acepte decimales
    {
        double numero=0;
        boolean bandera = false;
        do
        {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio"));
                bandera = true;
            } catch (Exception e) {
                informacion("Solo se permiten números");
                bandera = false;
            }
        }while(!bandera);
        return numero;
    }
            
}
