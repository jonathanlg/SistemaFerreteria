package Componentes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GenerarReporte {

    //creando una conexion
    Connection con = new ConexionBD().getConexion();
    
    public void exportarPF(String ruta, String archi){
        try {
            String rutaInforme = ruta;
            JasperPrint informe = JasperFillManager.fillReport(ruta, null, con);
            JasperExportManager.exportReportToPdfFile(informe, archi);
            JasperViewer jasperViewer = new JasperViewer(informe, false);
            jasperViewer.setTitle("INFORME");
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            Mensajes.error(e.getMessage());
        }
    }

    public void MostrarReporte(String url, String tit, String nombre) {
        try {// se lee el archivo del tipo jasper desde su ubicacion
            JasperReport reporte = (JasperReport) JRLoader.loadObject(url);
            //se crea el objeto Map para enviar el parametro que necesita el archivo jasper
            Map parametro = new HashMap();
            //se filtra el reporte con su conexion y su parametro  para mostrarlo
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, con);
            //se lanza el viewer de Jasper, para ver el reporte
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle(tit); // se envia un titulo
            jviewer.setVisible(true); // se muestra el viewer
            JasperExportManager.exportReportToPdfFile(jasperPrint, System.getProperty("user.dir")+"/PDF/"+nombre);
        } catch (JRException j) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Reporte.. " + j.getMessage());
        }
    }

    public void MostrarReporteConParametro(String url, String tit, int codF, String nombre) {
        try {// se lee el archivo del tipo jasper desde su ubicacion
            JasperReport reporte = (JasperReport) JRLoader.loadObject(url);
            //se crea el objeto Map para enviar el parametro que necesita el archivo jasper
            Map parametro = new HashMap();
            //Se Coloca al parametro el campo y su valor para actualizarlo
            parametro.put("ls_codigo", codF);
            //se filtra el reporte con su conexion y su parametro  para mostrarlo
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, con);
            //se lanza el viewer de Jasper, para ver el reporte
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle(tit); // se envia un titulo
            jviewer.setVisible(true); // se muestra el viewer
            JasperExportManager.exportReportToPdfFile(jasperPrint, System.getProperty("user.dir")+"/PDF/"+nombre);
        } catch (JRException j) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Reporte.. " + j.getMessage());
        }
    }
    
    public void MostrarReporteConParametro2(String url, String tit, String fecha) {
        try {// se lee el archivo del tipo jasper desde su ubicacion
            JasperReport reporte = (JasperReport) JRLoader.loadObject(url);
            //se crea el objeto Map para enviar el parametro que necesita el archivo jasper
            Map parametro = new HashMap();
            //Se Coloca al parametro el campo y su valor para actualizarlo
            parametro.put("fFec", fecha);
            //se filtra el reporte con su conexion y su parametro  para mostrarlo
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, con);
            //se lanza el viewer de Jasper, para ver el reporte
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle(tit); // se envia un titulo
            jviewer.setVisible(true); // se muestra el viewer
        } catch (JRException j) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Reporte.. " + j.getMessage());
        }
    }
    
    public void MostrarReporte2Parametros(String url, String tit, String fecha1, String fecha2) {
        try {// se lee el archivo del tipo jasper desde su ubicacion
            JasperReport reporte = (JasperReport) JRLoader.loadObject(url);
            //se crea el objeto Map para enviar el parametro que necesita el archivo jasper
            Map parametro = new HashMap();
            //Se Coloca al parametro el campo y su valor para actualizarlo
            parametro.put("fDesde", fecha1);
            parametro.put("fHasta", fecha2);
            //se filtra el reporte con su conexion y su parametro  para mostrarlo
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, con);
            //se lanza el viewer de Jasper, para ver el reporte
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setTitle(tit); // se envia un titulo
            jviewer.setVisible(true); // se muestra el viewer
        } catch (JRException j) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Reporte.. " + j.getMessage());
        }
    }

    public void cerrar() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la"
                    + "  conexión.. " + ex.getMessage());
        }
    }
}
