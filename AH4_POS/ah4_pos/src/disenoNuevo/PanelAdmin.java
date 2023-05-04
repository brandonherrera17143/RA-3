package disenoNuevo;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class PanelAdmin extends javax.swing.JFrame {

    public PanelAdmin() { 
        initComponents();
        initContent();   
        jButton5.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    public void initContent() {
        ShowPaneles(new PanelBienvenida());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(910, 520);
        a.setLocation(0, 0);

        jpContenidoGeneral.removeAll();
        jpContenidoGeneral.add(a, BorderLayout.CENTER);
        jpContenidoGeneral.revalidate();
        jpContenidoGeneral.repaint();
    }
    private void textoTitulo(int entrada){
        switch (entrada) {
            case 0:
                lblTextoTituloMenu.setText("");
                break;
            case 1:
                lblTextoTituloMenu.setText("PANEL VENDEDOR");
                break;
            case 2:
                lblTextoTituloMenu.setText("PANEL CLIENTE");
                break;
            case 3:
                lblTextoTituloMenu.setText("PANEL PRODUCTO");
                break;
            case 4:
                lblTextoTituloMenu.setText("PANEL SUCURSALES");
                break;
            default:
                break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        btbCerrar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVendedores = new javax.swing.JButton();
        banner = new javax.swing.JLabel();
        jpTituloAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpContenidoGeneral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        lblTextoTituloMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbCerrar.setBackground(new java.awt.Color(84, 166, 234));
        btbCerrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btbCerrar.setText("CERRAR SESION");
        btbCerrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btbCerrar.setBorderPainted(false);
        btbCerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbCerrar.setIconTextGap(25);
        btbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCerrarActionPerformed(evt);
            }
        });
        jpFondo.add(btbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 330, 50));

        jButton5.setBackground(new java.awt.Color(84, 166, 234));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar.png"))); // NOI18N
        jButton5.setText("INICIO");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setIconTextGap(25);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 330, 50));

        jButton3.setBackground(new java.awt.Color(84, 166, 234));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sucursales.png"))); // NOI18N
        jButton3.setText("SUCURSALES");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton3.setBorderPainted(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(25);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 330, 50));

        jButton4.setBackground(new java.awt.Color(84, 166, 234));
        jButton4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jButton4.setText("CLIENTES");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setIconTextGap(25);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 330, 50));

        btnProductos.setBackground(new java.awt.Color(84, 166, 234));
        btnProductos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btnProductos.setBorderPainted(false);
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.setIconTextGap(25);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jpFondo.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 50));

        btnVendedores.setBackground(new java.awt.Color(84, 166, 234));
        btnVendedores.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVendedores.setForeground(new java.awt.Color(255, 255, 255));
        btnVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vendedor.png"))); // NOI18N
        btnVendedores.setText("VENDEDORES");
        btnVendedores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVendedores.setBorderPainted(false);
        btnVendedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVendedores.setIconTextGap(25);
        btnVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedoresActionPerformed(evt);
            }
        });
        jpFondo.add(btnVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 330, 50));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.jpg"))); // NOI18N
        jpFondo.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 630));

        jpTituloAdmin.setBackground(new java.awt.Color(84, 166, 234));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Panel Administrador ");

        javax.swing.GroupLayout jpTituloAdminLayout = new javax.swing.GroupLayout(jpTituloAdmin);
        jpTituloAdmin.setLayout(jpTituloAdminLayout);
        jpTituloAdminLayout.setHorizontalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpTituloAdminLayout.setVerticalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFondo.add(jpTituloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 910, 60));

        jpContenidoGeneral.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContenidoGeneralLayout = new javax.swing.GroupLayout(jpContenidoGeneral);
        jpContenidoGeneral.setLayout(jpContenidoGeneralLayout);
        jpContenidoGeneralLayout.setHorizontalGroup(
            jpContenidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jpContenidoGeneralLayout.setVerticalGroup(
            jpContenidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jpFondo.add(jpContenidoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 910, 520));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jpFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 70));

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblTextoTituloMenu.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTextoTituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoTituloMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTituloMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTituloMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpFondo.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 910, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedoresActionPerformed
        ShowPaneles(new PanelAdminVendedores());
        textoTitulo(1);
        
    }//GEN-LAST:event_btnVendedoresActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ShowPaneles(new ClientesAdministrarUsuarios());
        textoTitulo(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ShowPaneles(new ProductoPanelAdministrador());
        textoTitulo(3);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ShowPaneles(new SucursalesPanelAdministrador());
        textoTitulo(4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ShowPaneles(new PanelBienvenida());
        textoTitulo(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCerrarActionPerformed
        LoginPos cerrarSesion = new LoginPos();
        cerrarSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btbCerrarActionPerformed
     
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btbCerrar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVendedores;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoGeneral;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpTituloAdmin;
    private javax.swing.JLabel lblTextoTituloMenu;
    // End of variables declaration//GEN-END:variables
}
