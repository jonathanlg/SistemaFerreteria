package IU;

import Controladores.CabecerasTablas;
import Controladores.controlCliente;
import Controladores.controlFactura;

public class dlgBuscarCliente extends javax.swing.JDialog {

    CabecerasTablas cabe = new CabecerasTablas();
    
    public dlgBuscarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cabe.buscarCliente(jTable1);
        controlCliente.listClientes(jTable1, "clientes.cli_codigo");
        grupo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnRazon = new javax.swing.JRadioButton();
        rbtnContacto = new javax.swing.JRadioButton();
        rbtnRuc = new javax.swing.JRadioButton();
        rbtnDireccion = new javax.swing.JRadioButton();
        txtCodCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowInddex, int celIndex)
            {
                return false;
            }
        };
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por"));

        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        rbtnRazon.setText("Razón Social");
        rbtnRazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRazonActionPerformed(evt);
            }
        });

        rbtnContacto.setText("Contacto");
        rbtnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnContactoActionPerformed(evt);
            }
        });

        rbtnRuc.setText("RUC");
        rbtnRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRucActionPerformed(evt);
            }
        });

        rbtnDireccion.setText("Dirección");
        rbtnDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnRazon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnContacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnRuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnDireccion)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbtnCodigo)
                .addComponent(rbtnRazon)
                .addComponent(rbtnContacto)
                .addComponent(rbtnRuc)
                .addComponent(rbtnDireccion))
        );

        txtCodCliente.setEditable(false);
        txtCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodClienteKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cliente :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("Doble Clic para seleccionar cliente");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Doble clic para seleccionar cliente");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
        {
            controlFactura.selectCliente();
            dlgFactura.btnBuscarCliente.setEnabled(false);
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtCodClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodClienteKeyReleased
        // TODO add your handling code here:
        String cod = txtCodCliente.getText().trim();
        if(rbtnCodigo.isSelected())
        {
            busCodigo();
        }
        else
            if(rbtnRuc.isSelected())
            {
                CabecerasTablas.limpiarTablas(jTable1);
                controlCliente.filtRuc(jTable1, cod);
            }
        else
                if(rbtnRazon.isSelected())
                {
                    CabecerasTablas.limpiarTablas(jTable1);
                    controlCliente.filtRazonS(jTable1, cod);
                }
                else if(rbtnContacto.isSelected())
                {
                    CabecerasTablas.limpiarTablas(jTable1);
                    controlCliente.filContacto(jTable1, cod);
                }
                else if(rbtnDireccion.isSelected())
                {
                    CabecerasTablas.limpiarTablas(jTable1);
                    controlCliente.filDireccion(jTable1, cod);
                }
    }//GEN-LAST:event_txtCodClienteKeyReleased

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnRazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRazonActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnRazonActionPerformed

    private void rbtnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnContactoActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnContactoActionPerformed

    private void rbtnRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRucActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnRucActionPerformed

    private void rbtnDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDireccionActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnDireccionActionPerformed

    void seleccionarRadio()
    {
        txtCodCliente.setEditable(true);
        cabe.buscarCliente(jTable1);
        controlCliente.listClientes(jTable1, "clientes.cli_codigo");
        txtCodCliente.setText("");
        txtCodCliente.requestFocus();
    }
    
    void busCodigo()
    {
        try {
            int cod = Integer.parseInt(txtCodCliente.getText().trim());
            for(int i = 0; i<jTable1.getRowCount();i++)
            {
                if(jTable1.getValueAt(i, 0).equals(cod))
                {
                    jTable1.changeSelection(i, 1, false, false);
                    break;
                }
            }
        } catch (Exception e) {
            txtCodCliente.setText("");
        }
    }
    
    final void grupo()
    {
        grupoBotones.add(rbtnCodigo);
        grupoBotones.add(rbtnRuc);
        grupoBotones.add(rbtnContacto);
        grupoBotones.add(rbtnRazon);
        grupoBotones.add(rbtnDireccion);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(dlgBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgBuscarCliente dialog = new dlgBuscarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnContacto;
    private javax.swing.JRadioButton rbtnDireccion;
    private javax.swing.JRadioButton rbtnRazon;
    private javax.swing.JRadioButton rbtnRuc;
    private javax.swing.JTextField txtCodCliente;
    // End of variables declaration//GEN-END:variables
}
