package ventanasPanelVendedor;

import disenoNuevo.*;


public class VentasListadoGeneral2 extends javax.swing.JPanel {

   
    public VentasListadoGeneral2() {
        initComponents();
        btnRegresarTabla.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresarTabla = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtNit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtNoFac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(910, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnRegresarTabla.setBackground(new java.awt.Color(84, 166, 234));
        btnRegresarTabla.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegresarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btnRegresarTabla.setText("REGRESAR");
        btnRegresarTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegresarTabla.setBorderPainted(false);
        btnRegresarTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarTabla.setIconTextGap(15);
        btnRegresarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarTablaActionPerformed(evt);
            }
        });
        add(btnRegresarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 20));

        btnBuscar.setBackground(new java.awt.Color(84, 166, 234));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnBuscar.setText("APLICAR FILTRO");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(15);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 200, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 230, 6));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 230, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, 20));

        txtFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 230, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 230, 6));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 230, -1));

        txtNit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNit.setBorder(null);
        txtNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNitMousePressed(evt);
            }
        });
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });
        add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 230, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("NIT");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 30, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 230, 10));

        txtNoFac.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNoFac.setBorder(null);
        txtNoFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNoFacMousePressed(evt);
            }
        });
        txtNoFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoFacActionPerformed(evt);
            }
        });
        add(txtNoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 230, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("No. Factura");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Filtrar por:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Filtrados:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 10));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO GENERAL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 220, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Factura", "NIT", "Nombre", "Fecha", "Total", "Acciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 830, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaActionPerformed
//        ShowPaneles(new TablaVendedores());
//        botonRegresar(false);
    }//GEN-LAST:event_btnRegresarTablaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitMousePressed

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void txtNoFacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNoFacMousePressed

    }//GEN-LAST:event_txtNoFacMousePressed

    private void txtNoFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoFacActionPerformed

    }//GEN-LAST:event_txtNoFacActionPerformed

    public void botonRegresar(boolean click) {
        
        if (click) {
            btnRegresarTabla.setVisible(true);
        } else {
            btnRegresarTabla.setVisible(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNoFac;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
