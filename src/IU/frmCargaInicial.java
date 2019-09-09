package IU;

import Componentes.Mensajes;
import Componentes.Transparencia;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmCargaInicial extends javax.swing.JFrame {

    public frmCargaInicial() {
        Transparencia.transparencia transparencia = new Transparencia.transparencia(this);
        initComponents();
        
        cargarIcono();
        
        CargandoDatos CargandoDatos = new CargandoDatos();
        CargandoDatos.start();
        CargandoDatos = null;

        Cargando Cargando = new Cargando();
        Cargando.start();
        Cargando = null;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblCarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/carga.jpg"))); // NOI18N

        lblCarga.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblCarga.setText("Carga");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(lblCarga)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(lblCarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void velocidadDeCarga() throws InterruptedException{ 
        for(int i = 0; i<=100; i++){ 
            Thread.sleep(90L); 
            jProgressBar1.setValue(i);
            if (i == 00) {
               lblCarga.setText("Cargando Componentes..."); 
            }
            if (i == 20) {
                lblCarga.setText("Iniciando Software...");
            }
            if (i == 30) {
               lblCarga.setText("Conectando con la Base de Datos..."); 
            }
            if (i == 40) {
                lblCarga.setText("Cargando Interfaz de Usuario...");
            }
            if (i == 450) {
               lblCarga.setText("Cargando Reportes..."); 
            }
            if (i == 55) {
               lblCarga.setText("Compilando..."); 
            }
            if (i == 65) {
                lblCarga.setText("Verificando Administrador...");
            }
            if (i == 70) {
               lblCarga.setText("Verificando Usuarios..."); 
            }
            if (i == 73) {
               lblCarga.setText("Cargando Listas..."); 
            }
            if (i == 75) {
                lblCarga.setText("Cargando Módulos...");
            }
            if (i == 85) {
               lblCarga.setText("Carga de Módulos Terminada..."); 
            }
            if (i == 90) {
               lblCarga.setText("Iniciando Módulos..."); 
            }
            if (i == 95) {
                lblCarga.setText("Bienvenido al Sistema");
            }        
        } 
    }
     
    class Cargando extends Thread{
          public Cargando(){super(); }
          @Override
               public void run(){
                      setProgresoMax(100);
              try {
                  velocidadDeCarga();
              } catch (InterruptedException ex) {
                  Logger.getLogger(frmCargaInicial.class.getName()).log(Level.SEVERE, null, ex);
              }
              new frmAcceso().setVisible(true);
              dispose();
               }
    }
    
    class CargandoDatos extends Thread{
          public CargandoDatos(){super(); }
          @Override
               public void run(){
              try {  
                  velocidadDeCarga();
              } catch (InterruptedException ex) {
                  Logger.getLogger(frmCargaInicial.class.getName()).log(Level.SEVERE, null, ex);
              }
               }
    }
          
    public void setProgresoMax(int maxProgress){
        jProgressBar1.setMaximum(maxProgress);
    }
    
    public void setProgreso(int progress){
        final int progreso = progress;
        jProgressBar1.setValue(progreso);
    }
    
    void cargarIcono() {
        try {
            java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Iconos/logo.png"));
            setIconImage(icon);
            setVisible(true);
            this.setLocationRelativeTo(null);
        } catch (Exception e) {
            Mensajes.error("No se pudo cargo icono");
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCargaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCargaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCargaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCargaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCargaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblCarga;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
