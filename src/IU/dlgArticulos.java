package IU;

import Componentes.ExportatExcel;
import Componentes.Mensajes;
import Componentes.MiRender;
import Controladores.CabecerasTablas;
import Controladores.controlArticulo;
import Controladores.controlGestStock;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class dlgArticulos extends javax.swing.JDialog {

    CabecerasTablas cabe = new CabecerasTablas();

    public dlgArticulos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTable1.setDefaultRenderer(Object.class, new MiRender());
        grupo();
        cabe.Articulos(jTable1);
        controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mbtnMmodificar = new javax.swing.JMenuItem();
        mbtnBorrar = new javax.swing.JMenuItem();
        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowInddex, int celIndex)
            {
                return false;
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnDesc = new javax.swing.JRadioButton();
        rbtnRubro = new javax.swing.JRadioButton();
        rbtnMarca = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        mbtnMmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modify.png"))); // NOI18N
        mbtnMmodificar.setText("Modificar");
        mbtnMmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtnMmodificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mbtnMmodificar);

        mbtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/16.png"))); // NOI18N
        mbtnBorrar.setText("Borrar");
        mbtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtnBorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mbtnBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulos");
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridLayout(1, 6));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil_add.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setToolTipText("Registrar Nuevo Artículo");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil.png"))); // NOI18N
        jButton2.setText("Modificar");
        jButton2.setToolTipText("Modificar Artículo");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/delete.png"))); // NOI18N
        jButton3.setText("Borrar");
        jButton3.setToolTipText("Borrar Artículo");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/page_refresh.png"))); // NOI18N
        jButton4.setText("Actualizar");
        jButton4.setToolTipText("Refrescar Lista");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/door_out32.png"))); // NOI18N
        jButton5.setText("Salir");
        jButton5.setToolTipText("Salir");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nuevo: F1             Modificar : Ctrl + M            Borrar : Ctrl + B            Actualizar: F5");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Buscar por :");

        txtBuscar.setEditable(false);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        rbtnCodigo.setText("Codigo");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        rbtnDesc.setText("Descripcion");
        rbtnDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDescActionPerformed(evt);
            }
        });

        rbtnRubro.setText("Rubro");
        rbtnRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRubroActionPerformed(evt);
            }
        });

        rbtnMarca.setText("Marca");
        rbtnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMarcaActionPerformed(evt);
            }
        });

        jMenu1.setText("Acceso Rapido");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Borrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem8.setText("Ordenar por Codigo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Ordenar por Descripcion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Ordenar por Rubro");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Importar / Exportar");

        jMenuItem6.setText("Exportar a Excel");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnDesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnRubro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnCodigo)
                    .addComponent(rbtnDesc)
                    .addComponent(rbtnRubro)
                    .addComponent(rbtnMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        if (SwingUtilities.isRightMouseButton(evt)) {
            Point p = evt.getPoint();
            int number = jTable1.rowAtPoint(p);
            ListSelectionModel modelos = jTable1.getSelectionModel();
            modelos.setSelectionInterval(number, number);
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CabecerasTablas.limpiarTablas(jTable1);
        controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        nuevoArticulo();
    }//GEN-LAST:event_jButton1ActionPerformed
    void nuevoArticulo() {
        dlgGestAriculos gestArticulos = new dlgGestAriculos(null, true);
        gestArticulos.setLocationRelativeTo(null);
        gestArticulos.setTitle("Nuevo Articulo");
        gestArticulos.setVisible(true);
    }
    private void mbtnMmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtnMmodificarActionPerformed
        // TODO add your handling code here:
        dlgGestAriculos a = new dlgGestAriculos(null, true);
        a.setLocationRelativeTo(null);
        controlArticulo.aModifcar();
        dlgGestAriculos.jButton6.setEnabled(true);
        dlgGestAriculos.jButton4.setEnabled(false);
        dlgGestAriculos.txtStockMin.setEnabled(false);
        a.setTitle("Modificación de Articulo");
        a.setVisible(true);
    }//GEN-LAST:event_mbtnMmodificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        modArticulo();
    }//GEN-LAST:event_jButton2ActionPerformed
    void modArticulo() {
        try {
            dlgGestAriculos a = new dlgGestAriculos(null, true);
            a.setLocationRelativeTo(null);
            controlArticulo.aModifcar();
            a.setTitle("Modificación de Articulo");
            dlgGestAriculos.jButton6.setEnabled(true);
            dlgGestAriculos.jButton4.setEnabled(false);
            dlgGestAriculos.txtStockMin.setEnabled(false);
            a.setVisible(true);
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        delArticulo();
    }//GEN-LAST:event_jButton3ActionPerformed
    void delArticulo() {
        try {
            int x = jTable1.getSelectedRow();
            String desc = jTable1.getValueAt(x, 1).toString();
            int rpta = Mensajes.confirmar("Desea realmente eliminar " + desc + " de la lista");
            if (rpta == 0) {
                controlGestStock.delStock();
                controlArticulo.delArticulo();
                CabecerasTablas.limpiarTablas(jTable1);
                controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
            }
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }
    private void mbtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtnBorrarActionPerformed
        // TODO add your handling code here:
        try {
            int rpta = Mensajes.confirmar("Desea realmente Eliminar");
            if (rpta == 0) {
                controlGestStock.delStock();
                controlArticulo.delArticulo();
                CabecerasTablas.limpiarTablas(jTable1);
                controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
            }
        } catch (Exception e) {
            Mensajes.error("Seleccione una fila de la tabla");
        }
    }//GEN-LAST:event_mbtnBorrarActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        try {
            /*Agrego el jtable a un ArrayList*/
            List<JTable> tb = new ArrayList<JTable>();
            tb.add(jTable1);

            ExportatExcel excellExporter = new ExportatExcel(tb, new File("REGISTRO DE ARTICULOS.xls"));
            if (excellExporter.Export()) {
                Mensajes.informacion("DATOS EXPORTADOS CON EXITO");
            }
            llamaExcel();
        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        try {
            String cod = txtBuscar.getText();
            if (rbtnCodigo.isSelected()) {
                busCodigo();
            } else if (rbtnDesc.isSelected()) {
                CabecerasTablas.limpiarTablas(jTable1);
                controlArticulo.filtrar(jTable1, cod);
            } else if (rbtnRubro.isSelected()) {
                CabecerasTablas.limpiarTablas(jTable1);
                controlArticulo.filtrarRubro(jTable1, cod);
            } else if (rbtnMarca.isSelected()) {
                CabecerasTablas.limpiarTablas(jTable1);
                controlArticulo.filtrarMarca(jTable1, cod);
            }
        } catch (Exception e) {
            System.out.println("Caracter Invalido");
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDescActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnDescActionPerformed

    private void rbtnRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRubroActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnRubroActionPerformed

    private void rbtnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMarcaActionPerformed
        // TODO add your handling code here:
        seleccionarRadio();
    }//GEN-LAST:event_rbtnMarcaActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        CabecerasTablas.limpiarTablas(jTable1);
        controlArticulo.listArticulo(jTable1, "rubro.rub_nombre");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        CabecerasTablas.limpiarTablas(jTable1);
        controlArticulo.listArticulo(jTable1, "articulo.art_descripcion");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        CabecerasTablas.limpiarTablas(jTable1);
        controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        delArticulo();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        modArticulo();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        nuevoArticulo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            try {
                dlgGestAriculos a = new dlgGestAriculos(null, true);
                a.setLocationRelativeTo(null);
                controlArticulo.aModifcar();
                a.setTitle("Modificación de Articulo");
                dlgGestAriculos.jButton6.setEnabled(true);
                dlgGestAriculos.jButton4.setEnabled(false);
                dlgGestAriculos.txtStockMin.setEnabled(false);
                a.setVisible(true);
            } catch (Exception e) {
                Mensajes.error("No se pudo cagar informacion del Artículo");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    void seleccionarRadio() {
        txtBuscar.setEditable(true);
        cabe.Articulos(jTable1);
        controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
        txtBuscar.setText("");
        txtBuscar.requestFocus();
    }

    void busCodigo() {
        try {
            CabecerasTablas.limpiarTablas(jTable1);
            controlArticulo.listArticulo(jTable1, "articulo.art_codigo");
            int cod = Integer.parseInt(txtBuscar.getText());
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (jTable1.getValueAt(i, 0).equals(cod)) {
                    jTable1.changeSelection(i, 1, false, false);
                    break;
                }
            }
        } catch (Exception e) {
            txtBuscar.setText("");
        }
    }

    public void grupo() {
        grupoBotones.add(rbtnCodigo);
        grupoBotones.add(rbtnDesc);
        grupoBotones.add(rbtnRubro);
        grupoBotones.add(rbtnMarca);
    }

    public void llamaExcel() {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "REGISTRO DE ARTICULOS.xls");
        } catch (Exception e) {
            System.out.println("No se pudo");
        }
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dlgArticulos dialog = new dlgArticulos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mbtnBorrar;
    private javax.swing.JMenuItem mbtnMmodificar;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnDesc;
    private javax.swing.JRadioButton rbtnMarca;
    private javax.swing.JRadioButton rbtnRubro;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
