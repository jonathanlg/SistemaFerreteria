package Datos;

import Componentes.ConexionBD;
import Componentes.Fecha;
import Componentes.GenerarReporte;
import Componentes.Mensajes;
import Componentes.Notas;
import Componentes.generarCodigos;
import Componentes.traerIP;
import IU.frmAcceso;
import IU.frmCargaInicial;
import IU.frmPrincipal;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Main {

    public static void main(String[] args) {
//        try {
//            UIManager.LookAndFeelInfo[] lista = UIManager.getInstalledLookAndFeels();
//            for (int i = 0; i < lista.length; i++) {
//                System.out.println(lista[i].getClassName());
//
//            }
//            JFrame.setDefaultLookAndFeelDecorated(true);
//            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteSkin");
//            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSunGlareTheme");
//            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "No se pudo cargar el skin " + e);
//        }
        try {
//            frmPrincipal p = new frmPrincipal();
//            p.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
//            p.setVisible(true);
            frmAcceso p2 = new frmAcceso();
            p2.setLocationRelativeTo(null);
            p2.setVisible(true);
//            frmCargaInicial f = new frmCargaInicial();
//            f.setLocationRelativeTo(null);
//            f.setVisible(true);
        } catch (HeadlessException e) {
            Mensajes.error("Error al cargar...Intentelo de nuevo " + e.toString());
            System.exit(0);
        }

        /*-------------------Prueba de Coneccion - ---------------*/
//        Connection cn = (Connection) new ConexionBD().getConexion();
//        if (cn == null) {
//            System.out.println("No hay conexion con el servidor");
//        } else {
//            System.out.println("Conectado al servidor");
//        }
        /*-----------Pruebas de Codigo --- No tocar a menos de saber como funciona ------*/
//        Fecha.darHora();
//        String cod = generarCodigos.getCodigo("SELECT MAX(codArticulo) FROM articulo");
//        System.out.println(String.valueOf(cod));
//        String sql = "select * from rubro where codRubro = '3'";
//        Object[] fila = Operacion.getFila(sql);
//        if(fila!=null)
//        {
//            System.out.println(fila[0].toString());
//            System.out.println(fila[1].toString());
//        }else
//        {
//            System.out.println("No existe");
//        }
//        String sql = "DELETE FROM rubro WHERE codRubro = 12";
//        String msg = Operacion.exeOperacion(sql);
//        if(msg==null)
//        {
//            System.out.println("Registro eliminado");
//        }
//        else
//        {
//            System.out.println(msg);
//        }
        /*Saber IP y Hostname*/
//        String ip = traerIP.getIP();
//        System.out.println(ip);
//        String d = generarCodigos.getDecimales("select SUM(ing_importe) from ingreso where ing_fecha = '2015-03-30");
//        System.out.println("Total es :" + String.valueOf(d));
//        System.out.println(System.getProperty("user.dir")+"/src/Reportes/Articulos/Articulos.jasper");
        
        
    }

}
